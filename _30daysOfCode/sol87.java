//Write a program to accept a float value of number and return a rounded float value.

import java.util.*;
public class Q87 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a float value: ");
		float num=sc.nextFloat();
		sc.close();
		int n=(int)num;
		if(num-n>=0.5) {
			float res=((int)(num+1));
			System.out.println("The rounded value of "+num+" is: "+res);
		}
		else {
			float res=((int)(num-1))+1;
			System.out.println("The rounded value of "+num+" is: "+res);
		}
	}
}
