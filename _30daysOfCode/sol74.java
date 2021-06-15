//Write a program to compute the harmonic mean.

package daysOfCode;
import java.util.Scanner;
public class sol_74 {	
		public static void main(String arg[])
		{     
		       double num;
		       double sum=0;
		       Scanner sc=new Scanner(System.in);
		       System.out.println("Enter the number");
	        	num=sc.nextDouble();
	        	for(double i=1;i<=num;i++)
		  {
		             sum=sum+(1/i);
		}
		System.out.println("Harmonic value = "+sum);
		}
	}

