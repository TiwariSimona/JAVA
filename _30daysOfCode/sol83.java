//Given an array arr of positive integers. Your task is to find the leaders in the array. An element of array is leader if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader.

import java.util.*;

public class Q83 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The leader elements of the array are : ");
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					break;
				} else if(j==arr.length-1) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
}
