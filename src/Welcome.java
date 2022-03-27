
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Welcome {
	
	//Method for welcome Message
	public static void welcome()  {
		
		File dirPath=new File("My Docs");
		if(!dirPath.exists()) {
			dirPath.mkdir();
		}
				
		System.out.println("Welcome to LockedMe.com");
		System.out.println("Developer Name : Pritam Kundu");
		System.out.println("This Product is presented by : Company Lockers Pvt. Ltd.");
		
		welcomePage(dirPath);
		
		
	}
	
	//Method for Primary Menu And taking user input
	public static void welcomePage(File dirpath)  {
		try {
			System.out.println("------------------------------------------------------");
			
			System.out.println("Choose Options from below:-");
			System.out.println("1 - Retrieving the file names in an ascending order");
			System.out.println("2 - Business-level operations:(like-add,delete,search file)");
			System.out.println("3 - Option to close the application");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("You want to choose: ");
			int input=sc.nextInt();
			System.out.println("------------------------------------------------------");
			
			switch (input) {
			case 1:
				FirstOpt.firstOption(dirpath);
				break;
			
			case 2:
				SecondOpt.secondOption(dirpath);
				break;
			case 3:
				System.out.println("Application Closed-----");
				break;
			default:
				System.out.println("------------------------------------------------------");
				System.out.println("Input type Error---- Enter only Integer as input");
				welcomePage(dirpath);
			}
			
		} catch (InputMismatchException e) {
			System.out.println("------------------------------------------------------");
			System.out.println("Input type Error---- Enter only Integer as input");
			welcomePage(dirpath);
		}
	}
}