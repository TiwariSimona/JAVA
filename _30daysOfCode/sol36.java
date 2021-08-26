//Write a program to display all the N numbers of a Catalan Number sequence.

import java.util.Scanner;

public class ques36 {
	 public   static int catalan(int x) {
		int sum=0;
		if(x<=1) { 
			return 1;
		}else {
			for(int i=0;i<x;i++) {
				sum= sum+(catalan(i)*catalan(x-i-1));
			}
			return sum;
		}
	 }
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			ques36 num=new ques36();
			System.out.println ("enter the size of num");
			int y=sc.nextInt();
			for(int i=0;i<y;i++) {
				System.out.print( num.catalan(i)+" ");
			}
		
		}
	}
