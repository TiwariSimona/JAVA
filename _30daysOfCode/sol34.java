//You are given two integer arrays a and b of length n. You can reverse at most one subarray (continuous subsegment) of the array a. Your task is to reverse such a subarray that the sum ∑i=1nai⋅bi is maximized.

import java.util.*;
public class ques34 {
	public static int[] reverse(int arr[],int n){
	    int[] temp = new int[n];
	    int j = n;
	    for(int i = 0; i < n; i++) {
	         temp[j - 1] = arr[i];
	         j = j - 1;
	  }
	  return temp; 
	}
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n =sc.nextInt();
	        int a[]=new int[n];
	        int b[]=new int[n];
	       for(int i = 0; i < n; i++) {
	           a[i]=sc.nextInt();
	           b[i]=sc.nextInt();
	       }
	        int []r = reverse(a,n);
	         int[] s = reverse(b,n);
	         int s1=0,s2=0,s3=0;
	         for(int i = 0; i < n; i++) {
	             s1=s1+(a[i]*b[i]);
	             s2=s2+(a[i]*s[i]);
	             s3=s3+(r[i]*b[i]);
	         }
	         System.out.println(Math.max(s1,Math.max(s2,s3)));
	     }
} 
