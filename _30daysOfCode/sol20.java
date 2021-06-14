//Program to print a statement without using the print statement.

package daysOfCode;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class sol_20 {	
 public static void main(String args[]) throws IOException {
      OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
      Scanner sc= new Scanner(System.in);
      String str= sc.nextLine();
      streamWriter.write(str);
      streamWriter.flush();		 
	   }
	}


      
     
