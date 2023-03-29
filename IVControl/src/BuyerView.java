import java.util.Scanner;

public class BuyerView {
	
	public static Scanner userInput = new Scanner(System.in);
	public static Scanner userIntInput = new Scanner(System.in);
	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001b[34;1m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_HGREEN = "\u001b[42;1m";
    public static final String ANSI_MAGENTA = "\u001b[35m";
    
    public static final String BLUE = "\u001b[44;1m";
    public static final String GREEN = "\u001b[42;1m";
    public static final String YELLOW = "\u001b[43;1m";
    public static final String RED = "\u001b[41;1m";
    public static final String ORANGE = "\033[48;2;255;165;0m";
    public static final String LBLUE = "\u001b[46;1m";
    
	public static void start() {
		
		greetCusto();
		//ADD
	}
	
	public static void greetCusto() {
		
		System.out.println("Welcome to the " + ANSI_RED + "S" +ANSI_GREEN+ "h" + ANSI_YELLOW + "o" + ANSI_CYAN + "p" + ANSI_RESET + "!");
		System.out.println("Here is our inventory: ");
		printIV();
		display();
	}
	
	public static void printIV() {
		
		int counter = 1;
		
		for(int i = 0; i < 10; i++) {
			
//			String SKU = file.next();
//			String name = file.next();
//			int amount = file.nextInt();
//			int retail_cost = file.nextInt();
//			int wholesale_cost = file.nextInt();
			
			System.out.println(counter + ") ");
			counter++;
		}
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
		
	}

	public static void search() {
		
		System.out.println("");
		System.out.print(ANSI_CYAN + "Search: " + ANSI_RESET);
		
		String search = userInput.nextLine();
	}

	
	
	
	
	
	
	
	
}
