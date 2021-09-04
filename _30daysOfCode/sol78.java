//Given an array a[ ] of size n, swap the p th element from beginning with p th element from end.

import java.util.*;
public class Q78 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Enter position: ");
		int p=sc.nextInt();
		sc.close();
		int temp=a[p-1];
		a[p-1]=a[a.length-p];
		a[a.length-p]=temp;
		System.out.println("Array after swapping:");
		for(int e:a) {
			System.out.print(e+" ");
		}
	}
}

