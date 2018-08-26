import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Splitter {

	public static void main(String args[]) throws FileNotFoundException {
		  
        File text = new File("C:/Users/rajus/Desktop/customer.text");
      
        Scanner scnr = new Scanner(text);
      
        int lineNumber = 1;
        while(scnr.hasNextLine()){
            String line = scnr.nextLine();
            System.out.println(lineNumber + " " + line);
            lineNumber++;
        }       
    
    }   

}