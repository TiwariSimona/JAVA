//Write a java program to accept numbers in a matrix of size 4 x 4 by using Scanner class then calculate and display sum of bordered elements.

import java.util.*;
public class Q31 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of 4x4 matrix:");
		int a[][]= new int[4][4];
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		int sum=0;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==0 || j==0 || i==3 || j==3) {
					sum+=a[i][j];
				}
			}
		}
		System.out.println("Sum: "+sum);
	}
}
