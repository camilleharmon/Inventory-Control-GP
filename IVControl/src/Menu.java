import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Menu
	{
	static Scanner userInputInt = new Scanner(System.in);
	static Scanner userInputLine = new Scanner(System.in);
//	Opening menu asks if user is buyer or company employee
	//Employee access requires a password
	
	//text color
	static final String ANSI_RESET = "\u001B[0m"; 
    static final String ANSI_RED = "\u001B[31m";
	static final String ANSI_GREEN = "\u001B[32m";
	static final String ANSI_YELLOW = "\u001B[33m";
    static final String ANSI_CYAN = "\u001B[36m";
    static final String ANSI_PINK = "\u001B[35m";
    //background color
    static final String RED = "\u001b[41;1m";
    static final String LBLUE = "\u001b[46;1m";
	    

	public static void startMenu() throws FileNotFoundException
		{
		System.out.println(ANSI_YELLOW + "Welcome!" + ANSI_RESET);
		System.out.println("Would you like to log in as a" + ANSI_GREEN + " buyer" + ANSI_RESET + " or" + ANSI_RED + " company employee?" + ANSI_RESET);
		System.out.println("(1)" + ANSI_GREEN +  " Buyer" + ANSI_RESET);
		System.out.println("(2)" + ANSI_RED + " Company Employee" + ANSI_RESET);
		int login = userInputInt.nextInt();
		
		if(login == 1)
			{
			System.out.println("Welcome valued customer!");
			Customer.start();
			}
		else if(login == 2)
			{
			System.out.println("Please input the password:");
			String password = userInputLine.nextLine(); //current password is password
			if(password.equals("password"))
				{
				System.out.println(ANSI_GREEN +  "That was correct!" + ANSI_RESET);
				Delay.delay3();
				System.out.println("Welcome valued employee!");
				Employee.start();
				}
			else
				{
				System.out.println(ANSI_RED + "That was incorrect. You will be redirected to the main menu." + ANSI_RESET);
				Delay.delay3();
				startMenu();
				}
			}
		else
			{
			System.out.println("That was not an option.");
			startMenu();
			}
		
		
		
		}
	}
