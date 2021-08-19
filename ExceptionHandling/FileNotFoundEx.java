package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundEx {

	public static void main(String[] args) {
		try
		{
			File file=new File("/home/miracle/Documents/sample.txt");
			FileReader fr=new FileReader(file);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FileNotFoundException Occured!");
		}
	}
}
