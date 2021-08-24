//Write a program which returns all distinct non attacking placements of n Queens on an n x n chessboard, where n is an input to the program.

import java.util.*;
public class Q21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int n=sc.nextInt();
		sc.close();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++)
			for(int j=0;j<n;j++)
				a[i][j]=0;
		if(!solve(a,0)) {
			System.out.println("No solution");
			System.exit(-1);
		}
		else
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++)
					System.out.print(a[i][j]+" ");
				System.out.println();
			}
	}
	static boolean solve(int a[][], int col) {
		if(col>=a[0].length)
			return true;
		for(int i=0;i<a[0].length;i++) {
			if(safe(a,i,col)) {
				a[i][col]=1;
				if(solve(a,col+1))
					return true;
				a[i][col]=0;
			}
		}
		return false;
	}
	static boolean safe(int a[][], int r, int c) {
		for(int i=0;i<c;i++) {
			if(a[r][i]==1)
				return false;
		}
		for(int i=r, j=c; i>=0 && j>=0; i--, j--) {
			if(a[i][j]==1)
				return false;
		}
		for(int i=r, j=c; i<a[0].length && j>=0; i++, j--) {
			if(a[i][j]==1)
				return false;
		}
		return true;
	}
}
