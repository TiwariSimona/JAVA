//Write a program to print this series:

package daysOfCode;
import java.util.*;
public class sol_53 {
	
	
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
	        System.out.println("enter the no of elements");
			int n=sc.nextInt();
			int i=1,j=1;
			while(i<=n)
			{
				System.out.print((j*j)+" ");
				System.out.print((j*j*j)+" ");
				j++;
				i+=2;
			}
		}

	}

