//Write a Program that will convert an integer to to it’s corresponding 2’s Complement in binary representation.


package daysOfCode;
import java.util.Scanner;
public class sol_12 {
  public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter the number");
			int n = sc.nextInt();
			System.out.println( "2’s complement for the no. is  1011 in binary representation is " + Integer.toBinaryString(n));
			
		}
	}
