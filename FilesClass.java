
/*
 * 
 * Java.io package includes a File class that allows you to work with files.
 * To start, create a File object and specify the path of the file in the constructor
 * 
 * TO read, one of the simplest way is to use Scanner class from the java.util package.
 * 
 * Creating Files->
 * Formatter another useful class in java.util is used to create content and write it in files.
 * 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FilesClass {

	
	public static void main(String[] args) {
	
		// in file \\ -> one \ is used as escape  character
	File x = new File("C:\\Users\\SuryaP1\\Documents\\GitHub\\Java-Programs\\File handling Folder\\File IO2.txt");	
	if (x.exists()){
		System.out.println(x.getName() + " Exists at " + x.getPath());
		try {
			Scanner sc = new Scanner(x);
			
			while (sc.hasNextLine())
			{
				System.out.println(sc.nextLine());
			}
			
			/*
			while (sc.hasNext())
			{
				System.out.println(sc.next());
			}
			*/
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else
	{
		System.out.println("The file does not exist. Creating a new one");
		try{
			Formatter f = new Formatter(x.getPath());
			f.format("%d %s %s", 1,"john","Smith \r\n");
			f.format("%s %s %s", 2,"amy","Brown \r\n");
			f.format("%d %s %s", 3,"peter","parker");
			f.close();
		}catch(Exception e){
			System.out.println("Error while creating the file.");
		}
	}
	
	
	
	
	
	}

}
