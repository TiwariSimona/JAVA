//Write a program to take N numbers as input. Then display only prime - palindromes using method overloading concept.

import java.util.Scanner;

public class ques62 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		paliprime(n);
	}
	
	public static void paliprime(int n) {
		for (int i= 2;i<=n;i++){
			boolean isPrime = true;
			for (int j=2; j<=i/2; j++){
				if (i%j==0){
					isPrime = false;
	                break;
	                }
				}
			if(isPrime==true && pali(i))
				System.out.println(i);
		}
	}
	public static boolean pali(int n) {
		int s=n;
		String rev="";
		while(s>0) {
			int rem=s%10;
			s/=10;
			rev+=rem;
		}
		int res=Integer.parseInt(rev);
		if(res==n)
			return true;
		else
			return false;	
	}
}
