//Print the following pattern.

package daysOfCode;
import java.util.Scanner;
public class sol_85 {
	      public static void main(String args[])  
	       {  
	    	  Scanner sc=new Scanner(System.in);
	    	  System.out.println("Enter the number of rows");
	          int row=  sc.nextInt();
	            for (int i= row; i>= 1; i--)  
	              {  
	                  for (int j=row; j>i;j--)  
	                   {  
	                      System.out.print(" ");  
	                   }  
	                   for (int k=1;k<=i;k++)  
	                     {  
	                        System.out.print(k);
	                     }  
	                  System.out.println("");  
	              }
	       }
	}


