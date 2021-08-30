//WAP that given a number n, the task is to find the even factor sum of a number.

import java.util.*;
public class D30Q69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				if(i%2==0) sum=sum+i;
				else continue;
			}
		}
		System.out.println(sum);
		System.out.print("Even dividers sum ");
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				if(i%2==0) {
					
					if(i==n) System.out.print(i);
					else System.out.print(i+" + ");;
				}		
				else continue;
			}
		}
		System.out.println(" = "+sum);
		System.out.println();
	}

}
