//Given a sorted array containing only 0s and 1s, find the transition point. Note: return -1 if there is no transition point.

import java.util.Scanner;
public class ques82 {
		public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Entre n");
	int n=sc.nextInt();
	int ar[]=new int[n];
	System.out.println("Entre Values:");
	for(int i=0;i<n;i++) {
		ar[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		System.out.print(ar[i]+" ");
	}
	System.out.println();
	for(int i=0,j=1;i<n-1&&j<n;i++,j++) {
		if(ar[i]==ar[j]) {
				continue;	
			}
		
		else {
			System.out.println("Transition Point is "+j);
			}
		}
}
	}
