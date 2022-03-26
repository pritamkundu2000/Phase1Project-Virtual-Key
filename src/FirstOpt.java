import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstOpt {
	
	
	//Method for Retrieving the file names in an ascending order
	public static void firstOption(File dirpath) {
		
		File[] contents=dirpath.listFiles();
		if(contents.length==0) {
			System.out.println("No files Exists");
		}
		else {
			System.out.println("The files names are given below in assending order: ---");
			for(File each: contents) {
				System.out.println(each.getName());
			}
		}
		firstoptionOperation(dirpath);
	}
	
	//Method to go back to Main Menu
	public static void firstoptionOperation(File dirpath) {
		try {
			System.out.println("------------------------------------------------------");
			
			System.out.println("Choose Options from below:-");
			System.out.println("1 - Go To Main Menu");
			System.out.println("2 - Close the application");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("You want to choose: ");
			int input=sc.nextInt();
			System.out.println("------------------------------------------------------");
			
			switch (input) {
			case 1:
				Welcome.welcomePage(dirpath);
				break;
			
			case 2:
				System.out.println("Application Closed-----");
				break;
			
			default:
				System.out.println("Wrong Input given");
				firstOption(dirpath);
				break;
			}
			
		} catch (InputMismatchException e) {
			System.out.println("------------------------------------------------------");
			System.out.println("Input type Error---- Enter only Integer as input");
			firstOption(dirpath);
		}
	}
}
