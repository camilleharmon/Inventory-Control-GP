import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import jdk.tools.jlink.internal.ModularJarArchive;

public class Customer {
	
	static Scanner userInput = new Scanner(System.in);
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner file;
	static ArrayList <Inventory> items = new ArrayList <Inventory>();
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
	
	public static void greetCusto() throws FileNotFoundException {
		
		file = new Scanner(new File("Items.txt"));
		System.out.println("Welcome to the " + ANSI_RED + "S" +ANSI_GREEN+ "h" + ANSI_YELLOW + "o" + ANSI_CYAN + "p" + ANSI_RESET + "!");
		System.out.println("Here is our inventory: ");
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
			
			items.add(new Inventory(SKU, name, amount, retail_cost, wholesale_cost));
		}
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(counter + ") " + items.get(i).getName());
			counter++;
		}
		
		listNum = counter;
	}
	
	public static void display() {
		
		boolean ask = true;
		
		System.out.println("________________________");
		System.out.print(RED + "BUY" + ANSI_RESET);
		System.out.print("               ");
		System.out.print(LBLUE + "SEARCH" + ANSI_RESET);
		System.out.println("");
		
		while(ask) {
			
			int choice = userIntInput.nextInt();
			
			if(choice == 1) {
				
				ask = false;
				buy();
			}else if(choice == 2) {
				
				ask = false;
				search();
			}else {
				
				ask = true;
			}
		}
		
		
	}
	
	public static void buy() {
		
		System.out.println("");
		System.out.println("What would you like to " + ANSI_RED + "buy" + ANSI_RESET + "?");
		
		int choice = userIntInput.nextInt();
		
		if(choice > listNum) {
			
			System.out.println("INPUT ERROR");
			buy();
		}else if(choice == 2) {
			
			
			
		}else {
			
			
		}
	}

	public static void search() {
		
		int counter = 1;
		System.out.println("");
		System.out.print(ANSI_CYAN + "Search: " + ANSI_RESET);
		
		String search = userInput.nextLine();
		search = search.toLowerCase();
		
		for(int i = 0; i < items.size(); i++) {
			
			if(items.get(i).getName().toLowerCase().contains(search)) {
				
				System.out.println(counter + ") " + items.get(i).getName());
				counter++;
			}
		}
		
		listNum = counter;
		
		display();
	}

	
	
	
	
	
	
	
	
}
