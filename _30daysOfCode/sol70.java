//WAP that given a number, find minimum sum of its factors.

import java.util.Scanner;

public class ques70 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(findMinSum(num));
	}
	
	public static int findMinSum(int n){
		int sum=0;
		for(int i=2;i*i<=n;i++) {
			while (n%i==0) {
				sum+= i;
				n/= i;
			}
		}
		sum+=n;
		return sum;
	}
}
