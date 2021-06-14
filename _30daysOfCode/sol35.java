//Find the n th fibonacci number

package daysOfCode;
import java.util.Scanner;

public class sol_35 {	 
	 public static int fib(int n)
	 {
		 if (n <= 1) { return n;
	 } 
		 return fib(n - 1) + fib(n - 2);
	 } 
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int n = sc.nextInt();		
	   System. out. println("nth Fibonacci number is " + fib(n));
	 	}
	 }

	
	



