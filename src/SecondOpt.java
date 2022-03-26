import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondOpt {
	
	//Method for Secondary Menu of Business-level operations
	public static void secondOption(File dirpath) {
		
		try {
			System.out.println("------------------------------------------------------");
			
			System.out.println("Choose Options from below:-");
			System.out.println("1 - Add a file to the existing directory list");
			System.out.println("2 - Delete a user specified file from the existing directory list");
			System.out.println("3 - Search a user specified file from the main directory");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("You want to choose: ");
			int input=sc.nextInt();
			System.out.println("------------------------------------------------------");
			
			switch (input) {
			case 1:
				Operations.add(dirpath);
				break;
			
			case 2:
				Operations.delete(dirpath);
				break;
			case 3:
				Operations.search(dirpath);
				break;
			default:
				System.out.println("Wrong Option Choosen");
				secondOption(dirpath);
				break;
			}
			
		} catch (InputMismatchException e) {
			System.out.println("------------------------------------------------------");
			System.out.println("Input type Error---- Enter only Integer as input");
			secondOption(dirpath);
		}
	}
}
