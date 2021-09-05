//Given an array of even size N, task is to find minimum value that can be added to an element so that array become balanced. An array is balanced if the sum of the left half of the array elements is equal to the sum of right half.

import java.util.Scanner;

public class ques81 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("enter the size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		int x =0;int y=0;int i;int j;int z=0;
		System.out.println("a[]:");
		for( i=0;i<n;i++) {
	a[i]=sc.nextInt();
		}	
		for( i=0;i<n/2;i++) {
			x=x+a[i];
		}
		for( j=n/2;j<n;j++) {
			y=y+a[j];
		}
		if(x-y!=0) {
	 z = Math.abs(x-y) ;
		System.out.print("difference:"+z);
		}
	}
}
		
