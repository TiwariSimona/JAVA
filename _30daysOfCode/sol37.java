//The Gray code is a well-known concept. One of its important properties is that every two adjacent numbers have exactly one different digit in their binary representation. In this problem, we will give you n non-negative integers in a sequence A[1..n] (0<=A[i]<2^64), such that every two adjacent integers have exactly one different digit in their binary representation, similar to the Gray code. Your task is to check whether there exist 4 numbers A[i1], A[i2], A[i3], A[i4] (1 <= i1 < i2 < i3 < i4 <= n) out of the given n numbers such that A[i1] xor A[i2] xor A[i3] xor A[i4] = 0.

import java.util.*;
public class ques37 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		int ar[]=new  int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();}
		for(int a=0;a<n-3;a++ ) {
			
			String s1=Integer.toBinaryString(ar[a]);
			int x=Integer.parseInt(s1);
			for(int b=a+1;b<n-2;b++ ) {
				String s2=Integer.toBinaryString(ar[b]);
				int y=Integer.parseInt(s2);
				for(int c=b+1;c<n-1;c++ ) {
				String s3=Integer.toBinaryString(ar[c]);
				int z=Integer.parseInt(s3);
				for(int d=c+1;d<n;d++) {
					String s4=Integer.toBinaryString(ar[d]);
					int p=Integer.parseInt(s4);
					if(((x^y)^(z^p))==0) {
						System.out.print("yes");
						System.exit(0);
					}
				}
				}
		
	}

}
		System.out.println("no");
		}
	}
