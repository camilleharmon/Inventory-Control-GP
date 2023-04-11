import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Employee {

	static Scanner userInput = new Scanner(System.in);
	static Scanner userIntInput = new Scanner(System.in);
	static Scanner receiptFile;
	static Scanner trkFile;
	static ArrayList <Purchase> receipts = new ArrayList <Purchase>();
	
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
    	trkFile = new Scanner(new File("Tracking.txt"));
    	receiptFile = new Scanner(new File("Receipts.txt"));
    	greetEmployee();
		
	}
	
	public static void start() throws FileNotFoundException 
	{	
    	trkFile = new Scanner(new File("Tracking.txt"));
    	receiptFile = new Scanner(new File("Receipts.txt"));
    	greetEmployee();
		
	}
	
	public static void greetEmployee() throws FileNotFoundException {
		
		//Delay.delay2();
		trkFile = new Scanner(new File("Tracking.txt"));
		System.out.println(ANSI_RED + "M" +ANSI_GREEN+ "a" + ANSI_YELLOW + "n" + ANSI_CYAN + "a" + ANSI_RED + "g" +ANSI_GREEN+ "e" 
		+ ANSI_YELLOW + "m" + ANSI_CYAN + "e" +  ANSI_RED + "m" +ANSI_GREEN+ "e" + ANSI_YELLOW + "n" + ANSI_CYAN + "t" + ANSI_RESET);
//		Delay.delay2();
		printIV();
		printTracking();
		
		//display();
	}
	
	public static String padRight(String s, int n) {
	     return String.format("%-" + n + "s", s);  
	}
	
	public static void printTracking() throws FileNotFoundException{
		
		ArrayList <String> history = new ArrayList <String>();
		
		WritingToFile.orderHistory(history);
		
		System.out.println("");
		System.out.println("Order History");
		System.out.println("-------------------------------------------------");
		
		
		for(int i = 0; i < history.size(); i++) {
			
			System.out.println(history.get(i));
			Delay.delay1();
		}
	}
	
	public static void printIV() throws FileNotFoundException {
		
		//Load receipts
		while(receiptFile.hasNext())
		{			
			String name = receiptFile.next();
			int count = receiptFile.nextInt();
			double cost = receiptFile.nextDouble();
			
			receipts.add(new Purchase(name, count, cost));
		}
		
		double bottomLine = 0;
		
		System.out.print(padRight("Name", 25));
		System.out.print(padRight("Count", 7));
		System.out.print(padRight("Cost", 10));
		System.out.println(padRight("Total", 15));
		System.out.println("-------------------------------------------------");
		
		
		for(int i = 0; i < receipts.size(); i++) {
			
			String name = receipts.get(i).getName();
			int count = receipts.get(i).getPurchasedCount();
			double cost = receipts.get(i).getCost();
			
			double total = cost * count;
			bottomLine += total;
			
			System.out.print(padRight(name, 25));
			System.out.print(padRight(String.valueOf(count), 7));
			System.out.print(padRight(String.valueOf(cost), 10));
			System.out.println(padRight(String.valueOf(total), 15));
			Delay.delay1();
		}
		
		System.out.println("_________________________________________________");
		System.out.print(padRight("Bottom Line", 42));
		System.out.println(bottomLine);
	}

}
