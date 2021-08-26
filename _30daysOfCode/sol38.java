//You are given a multiset of N integers. Please find such a nonempty subset of it that the sum of the subset's elements is divisible by N. Otherwise, state that this subset doesn't exist.

import java.util.HashMap;
import java.util.Scanner;

public class ques38 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of testcases");
		int count=sc.nextInt();
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		findNonEmptySubset(count,arr,n);
	}
	public static void findNonEmptySubset(int count,int a[],int n){
		HashMap<Integer,Integer> h =new HashMap<Integer,Integer>();
		while(count>0) {
			int sum = 0;
			for (int i=0;i<n; i++){
				sum=(sum+a[i])%n;
				
				if(h.containsKey(sum)==true){
					System.out.println((i-h.get(sum)));
					
					for (int j=h.get(sum)+1;j<= i; j++) {
						System.out.print(j+1+ " ");
					}
					return;
				}
				else {
					h.put(sum,i);
				}
			}
			count--;
		}
		
	}
}
