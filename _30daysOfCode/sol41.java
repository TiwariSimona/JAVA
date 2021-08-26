//You are given a sequence of numbers a1, a2, ..., an, and a number m. Check if it is possible to choose a non-empty subsequence aij such that the sum of numbers in this subsequence is divisible by m.

import java.util.Scanner;
public class ques41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter size of array: ");
		 int n=sc.nextInt();
		 System.out.println("Enter the divisor: ");
		 int m=sc.nextInt();
		 int a[]=new int[n];
int sum=0;
System.out.println("enter the sequence");
for(int i=0;i<n;i++) {
	 a[i]=sc.nextInt();
	 sum=sum+a[i];
}


if(sum%m==0||sum/m==1) {
	System.out.println("yes");
}else {
	System.out.println("no");
}


	}

}
