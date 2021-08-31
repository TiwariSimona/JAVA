//Given an integer N, the task is to generate a matrix of dimensions N x N using positive integers from the range [1, N] such that the sum of the secondary diagonal is a prefect square

import java.util.Scanner;

public class ques71 {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Input size");
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=i+1;
		}
		square(a,n);
	}
	
	public static void square(int a[],int n) { 
		for(int i=0;i<n;i++){ 
			for(int j=0;j<n;j++){ 
				System.out.print(a[(j+i)%n]+ " ");
			}
			System.out.println();
		}
	}
}
