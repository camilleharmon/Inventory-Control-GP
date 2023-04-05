import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

	static Scanner userInput = new Scanner(System.in);
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner file;
	static ArrayList <Inventory> receipts = new ArrayList <Inventory>();
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
    	file = new Scanner(new File("Tracking.txt"));
    	greetEmployee();
		
	}
	
	public static void start() throws FileNotFoundException 
	{	
    	file = new Scanner(new File("Tracking.txt"));
    	greetEmployee();
		
	}
	
	public static void greetEmployee() throws FileNotFoundException {
		
		Delay.delay2();
		file = new Scanner(new File("Tracking.txt"));
		System.out.println(ANSI_RED + "M" +ANSI_GREEN+ "a" + ANSI_YELLOW + "n" + ANSI_CYAN + "a" + ANSI_RED + "g" +ANSI_GREEN+ "e" 
		+ ANSI_YELLOW + "m" + ANSI_CYAN + "e" +  ANSI_RED + "m" +ANSI_GREEN+ "e" + ANSI_YELLOW + "n" + ANSI_CYAN + "t" + ANSI_RESET);
		Delay.delay2();
		System.out.println("Money : $$$");
		Delay.delay2();
		System.out.println("Expenses : 0");
		Delay.delay2();
		System.out.println("Bottom Line : $$$");
		Delay.delay2();
		System.out.println("New Transactions : ");
		Delay.delay2();
		printIV();
		//display();
	}
	
	public static void printIV() throws FileNotFoundException {
		
		int counter = 1;
		
		for(int i = 0; i < 10; i++) {
			
			String SKU = file.next();
			String name = file.next();
			int amount = file.nextInt();
			double retail_cost = file.nextDouble();
			double wholesale_cost = file.nextDouble();
			
			receipts.add(new Inventory(SKU, name, amount, retail_cost, wholesale_cost));
		}
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println(counter + ") " + receipts.get(i).getName());
			counter++;
			Delay.delay1();
		}
		
		listNum = counter;
	}

}
