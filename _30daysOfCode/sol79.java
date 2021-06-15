//Print the following pattern.

package daysOfCode;
public class sol_79 {	
	 public static void main(String[] args) 
	 {
	   System.out.print("Enter number of rows: ");
	   int rows = 4;
	         int k=1;
	        System.out.println("Here is your pattern....!!!");
	        for (int i = 1; i <= 4; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            	System.out.print(k++ +" ");
	            System.out.println(" ");
	        }  
	    }
	}

