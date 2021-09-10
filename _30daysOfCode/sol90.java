//Write a program to reverse an integer number.

package daysOfCode;
import java.util.Scanner;
public class sol_90 {
	
	
	  public static void main(String args[])
	  {
	    int n, reverse = 0;

	    System.out.println("Enter an integer to reverse");
	    Scanner in = new Scanner(System.in);
	    n = in.nextInt();

	    while(n != 0)
	    {
	      reverse = reverse * 10;
	      reverse = reverse + n%10;
	      n = n/10;
	    }

	    System.out.println("Reverse of the number is " + reverse);
	  }
	}

