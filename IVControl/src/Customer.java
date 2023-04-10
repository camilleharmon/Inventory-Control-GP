import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	
	static Scanner userInput = new Scanner(System.in);
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner file;
	static ArrayList <Inventory> items = new ArrayList <Inventory>();
	static ArrayList <Inventory> searchItems = new ArrayList <Inventory>();

	static int listNum = 0;
	
	//text color
	static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_GREEN = "\u001B[32m";
    static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_CYAN = "\u001B[36m";
    //background color
    static final String RED = "\u001b[41;1m";
    static final String LBLUE = "\u001b[46;1m";
    
    public static void main(String[] args) throws FileNotFoundException 
	{	
    	file = new Scanner(new File("Items.txt"));
    	greetCusto();
		
	}
    
    public static void start() throws FileNotFoundException 
	{	
    	file = new Scanner(new File("Items.txt"));
    	greetCusto();
		
	}
	
	public static void greetCusto() throws FileNotFoundException {
		
		Delay.delay2();
		file = new Scanner(new File("Items.txt"));
		System.out.println(ANSI_RED + "S" +ANSI_GREEN+ "h" + ANSI_YELLOW + "o" + ANSI_CYAN + "p" + ANSI_RESET);
		Delay.delay2();
		System.out.println("Here is our inventory: ");
		Delay.delay2();
		printIV();
		display();
	}
	
	public static void printIV() throws FileNotFoundException {
		
		int counter = 1;
		
		for(int i = 0; i < 10; i++) {
			
			String SKU = file.next();
			String name = file.next();
			int amount = file.nextInt();
			double retail_cost = file.nextDouble();
			double wholesale_cost = file.nextDouble();
			
			if(amount > 0) {
				Inventory iv = new Inventory(SKU, name, amount, retail_cost, wholesale_cost);
				items.add(iv);
				searchItems.add(iv);
			}
		}
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(counter + ") " + items.get(i).getName());
			System.out.println("\tAmount: " + items.get(i).getAmount());
			counter++;
			Delay.delay1();
		}
		
		listNum = counter;
	}
	
	public static void display() {
		
		Reorder.reorder();
		
		boolean ask = true;
		
		Delay.delay2();
		System.out.println("________________________");
		System.out.print(RED + "BUY" + ANSI_RESET);
		System.out.print("               ");
		System.out.print(LBLUE + "SEARCH" + ANSI_RESET);
		System.out.println("");
		
		while(ask) {
			
			String choice = userInput.nextLine();
			choice = choice.toLowerCase();
			
			if(choice.equals("search")) {
				
				ask = false;
				search();
			}else if(choice.equals("s")) {
				
				ask = false;
				search();
			}else if(choice.equals("buy")) {
				
				ask = false;
				buy();
			}else if(choice.equals("b")) {
				
				ask = false;
				buy();
			}else {
				
				ask = true;
			}
		}
		
		
	}
	
	public static void buy() {
		
		System.out.println("");
		System.out.println("What would you like to " + ANSI_RED + "buy" + ANSI_RESET + "?");
		
		int choice = userIntInput.nextInt();
		
		if(choice > searchItems.size()) {
			
			System.out.println("INPUT ERROR");
			buy();
		}
		
		int amt = searchItems.get(choice-1).decAmount();
		
		WritingToFile.order(searchItems.get(choice-1));
		WritingToFile.writeItemFile(items);
		
		if(amt == 0)
			searchItems.remove(choice-1);
		
		for(int i = 0; i < searchItems.size(); i++) {
			
			System.out.println(i+1 + ") " + searchItems.get(i).getName());
			System.out.println("\tAmount: " + searchItems.get(i).getAmount());
			Delay.delay1();
		}
		
		display();
		
	}

	public static void search() {
		
		searchItems.clear();
		
		int counter = 1;
		System.out.println("");
		System.out.print(ANSI_CYAN + "Search: " + ANSI_RESET);
		
		String search = userInput.nextLine();
		search = search.toLowerCase();
		
		for(int i = 0; i < items.size(); i++) {
			
			if((search == "*" || items.get(i).getName().toLowerCase().contains(search)) 
					&& items.get(i).getAmount() > 0) {
				
				System.out.println(counter + ") " + items.get(i).getName());
				System.out.println("\tAmount: " + items.get(i).getAmount());
				counter++;
				Delay.delay1();
				
				searchItems.add(items.get(i));
			}
		}
		
		listNum = counter;
		
		display();
	}

	
	
	
	
	
	
	
	
}
