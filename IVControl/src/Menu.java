import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class Menu
	{
	static Scanner userInputInt = new Scanner(System.in);
	static Scanner userInputLine = new Scanner(System.in);
//	Opening menu asks if user is buyer or company employee
	//Employee access requires a password

	public static void startMenu()
		{
		System.out.println("Welcome!");
		System.out.println("Would you like to log in as a buyer or company employee?");
		System.out.println("(1) Buyer");
		System.out.println("(2) Company Employee");
		int login = userInputInt.nextInt();
		
		if(login == 1)
			{
			System.out.println("Welcome valued customer!");
			BuyerView.start();
			}
		else if(login == 2)
			{
			System.out.println("Please input the password:");
			String password = userInputLine.nextLine(); //current password is password
			if(password.equals("password"))
				{
				System.out.println("Welcome valued employee!");
				}
			else
				{
				System.out.println("That was incorrect. You will be redirected to the main menu.");
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
