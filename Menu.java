

package mypackage1;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Menu {
	
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int option;
		int suboption;
		System.out.println("Application Developer : Shaista");
		System.out.println("File Menu Related Application");
		
		
		do
		{
			System.out.println("Choose your option");
			System.out.println("1 - Display the Current File Name");
			System.out.println("2 - Display the user interface");
			System.out.println("3 - Exit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:// logic to display the current file name 
				 
				System.out.println("You are in Case 1");
				Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
				for (Path name: dirs) {
				    System.err.println(name);
				}
				break;
			case 2: // logic to display the user
					//interface to perform various operations of file
				System.out.println("You are in Case 2");
				System.out.println("Choose the operation to do...");
				System.out.println("11 - Add File");
				System.out.println("12 - Delete File");
				System.out.println("13 - Search File");
				System.out.println("14 - Back to Main Menu");
				suboption=sc.nextInt();
				String fileName = "";
				String filePath = "";
				String dir = "";
				switch(suboption)
				{
				case 11:
					// logic to add a file
			        System.out.println("Enter the file name:");
			        fileName = sc.next();
			        System.out.println("Enter the file path:");
			        filePath = sc.next();
					
					File file =  new File(filePath + fileName +".txt");
					if (file.createNewFile()) {
				        System.out.println("File created: " + file.getName());
				      } else {
				        System.out.println("File already exists.");
				      }
					break;
					
				case 12:
					// logic to delete a file
			        System.out.println("Enter the file path to be deleted:");
			        fileName = sc.next();
			        if(Files.deleteIfExists(Paths.get(fileName))) {
			        	System.out.println(fileName+" is successfully deleted");
				        }
				        else{
				            System.out.println("Failed to delete "+fileName+" file");
				        }
					 break;
				case 13: 
					// logic to search a file
					System.out.println("Enter the file to be searched:");
			        fileName = sc.next();
			        File fileToSearch = new File(fileName);
			        if(fileToSearch.exists()) {
			        	System.out.println("file found at: "+fileToSearch.getAbsolutePath());
				        }
				        else{
				            System.out.println("File Not Found");
				        }
					
				case 14:
					// logic to return to main menu
					break;
				}
				break;
			case 3: 
				System.out.println("You are in Case 3");
				return;
			
			}
			
		}while(true);
	}
	

}
