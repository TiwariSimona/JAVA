//Find the sum of all numbers which are equal to the sum of the factorial of their digits upto 10 factorial. Eg: If user enters 5 then it should calculate the sum of 1,2,3,4,5 factorial.

import java.util.Scanner;

public class ques98 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(sumfac(n));
	}
	public static int factorial(int n) {
		int mul=1;
		for(int i=n;i>0;i--) {
			mul*=i;
		}
		return mul;
	}
	public static int sumfac(int n) {
		int res=0;
		for (int i=10;i<n;i++) {
	    int sum=0;
	    int num=i;
	    while (num>0) {
	        int rem=num% 10;
	        num/=10;
	        sum=sum+factorial(rem);
	    }
	    if(sum==i)
	    	res+=i;
		}
		return res;
	}
}
