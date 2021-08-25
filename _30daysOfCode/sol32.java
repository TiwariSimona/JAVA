//Binomial co-efficient can be calculated by using the following formula : nCm = n!/m!(n–m)! (where ! sign represents the factorial of a number) WAP in java to calculate and print the binomial co-efficient of the given expression, taking the value n and m as input . Make use of the function int fact( int k ), which returns the factorial of a number k.

import java.util.Scanner;

public class ques32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n and m");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(fac(n)/(fac(m)*fac(n-m)));
	}
	public static int fac(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
}
