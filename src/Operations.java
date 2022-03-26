import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Operations {
	
	//Method to add a file in the directory
	public static void add(File dirpath)  {
		 
		System.out.println("To add a new file to this directory:");
		System.out.println("Please Enter the filename with extension:--");
		
		Scanner scanner=new Scanner(System.in);
		String file_name=scanner.next();		
		
		
		File newFile=new File(dirpath,file_name);
		
		if(!newFile.exists()) {
			try {
				newFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(file_name+" created successfully");
		}else {
			System.out.println(file_name+" already exists");
		}
		secondOptionOperation(dirpath);
		
	}
	
	//Method to delete an existing file from directory
	public static void delete(File dirpath)  {
		
		System.out.println("To delete an existing file from this directory:");
		System.out.println("Please Enter the filename with extension:--");
		
		Scanner scanner=new Scanner(System.in);
		String file_name=scanner.next();		
		
		
		File dFile=new File(dirpath,file_name);
		
		if(dFile.exists()) {
			dFile.delete();
			System.out.println(file_name+" deleted successfully");
		}else {
			System.out.println(file_name+" doesn't exists");
		}
		secondOptionOperation(dirpath);
		
	}
	
	//Method to a specile file in the directory
	public static void search(File dirpath)  {
		
		System.out.println("To search an existing file in this directory:");
		System.out.println("Please Enter the filename with extension:--");
		
		Scanner scanner=new Scanner(System.in);
		String file_name=scanner.next();
		
		File[] allFileNames=dirpath.listFiles();
		
		int flag=0;
		for(File file:allFileNames) {
			if(file.getName().equalsIgnoreCase(file_name)) {
				
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(file_name+" not found in this directory");
		}
		else {
			System.out.println(file_name+" found in this Directory");
		}
		secondOptionOperation(dirpath);
	}
	
	
	
	
	public static void secondOptionOperation(File dirpath) {
		try {
			System.out.println("------------------------------------------------------");
			
			System.out.println("Choose Options from below:-");
			System.out.println("1 - Go To Main Menu");
			System.out.println("2 - Go to Previous Menu");
			System.out.println("3 - Close the application");
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("You want to choose: ");
			int input=sc.nextInt();
			System.out.println("------------------------------------------------------");
			
			switch (input) {
			case 1:
				Welcome.welcomePage(dirpath);
				break;
			
			case 2:
				SecondOpt.secondOption(dirpath);
				break;
				
			case 3:
				System.out.println("Application Closed-----");
				break;
			
			default:
				System.out.println("Wrong Input given");
				secondOptionOperation(dirpath);
				break;
			}
			
		} catch (InputMismatchException e) {
			System.out.println("------------------------------------------------------");
			System.out.println("Input type Error---- Enter only Integer as input");
			secondOptionOperation(dirpath);
		}
	}
	
}
