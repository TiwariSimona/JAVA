//WAP that show double factorial

package daysOfCode;

import java.util.Scanner;
public class sol_75 {		 
	    static long D_fac(long n)
	    {
	        if (n == 0 || n==1)
	            return 1;            
	        return n * D_fac(n - 2);
	    }   
	     public static void main (String[] args)
	    {
	    	 Scanner sc=new Scanner(System.in);
	    	 System.out.println("Enter the number");
	    	 int n= sc.nextInt();
	        System.out.println("Double factorial is "+ D_fac(n));
	            
	    }
	}
