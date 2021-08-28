//Write a program to create a array of size N. Then perform a number of right circular rotations and return the values of the elements at the given indices.

import java.util.Arrays;
import java.util.Scanner;

public class ques59 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++) {
			System.out.print("q"+(i+1)+"=");
			a[i]=sc.nextInt();
		}
		while(count>0) {
			rotate(a,n);
		    count--;
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static int[] rotate(int a[], int n){
	       int x=a[n-1], i;
	       for (i=n-1; i>0; i--) {
	          a[i]=a[i-1];
	       }
	       a[0]=x;
	     return a;
	}
}
