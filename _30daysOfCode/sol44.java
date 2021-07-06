//WAP to check if the binary representation of a number is palindrome.

package daysOfCode;
import java.util.Scanner;
public class sol_44 {
	 public static void main(String args[])
		{
		 System.out.println("enter number");		
		Scanner sc=new Scanner(System.in);
			int n = sc.nextInt();	
		
		if (isPallindrome(n)) {
			System.out.println(n + " is palindrome");
	    }
							
	    else {
		    System.out.println(n + " is not palindrome");	
	    }
															
	}
		public static boolean isPallindrome(int n)
		{
			int rev = 0;
			int r = n;
			while (r > 0)
			{
										
			 rev = (rev << 1) | (r & 1);
			 r = r >> 1;
		        }
																		
			return n == rev;
		}
	
}
