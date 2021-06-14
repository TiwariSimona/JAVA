//Given two long integers numbers min and max find and print a typical part n/d to such an extent that min<=d<=max and |n/d-pi| is negligible if there are a few divisions having an insignificant distance to pi pick the one with the littlest denominator.

package daysOfCode;

import java.util.Scanner;

public class sol_3 {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the value of n");
			int n=sc.nextInt();
			  int a = 0, b = 1, c = 1, d = 2, i;
			  int e=0;
			  System.out.print(a + " " + b + " " + c+" "+d);
			  
			  for (i = 4; i <= n; i++) {
			   e =  b +c+d;
			   System.out.print(" " + e);
			   b = c;
			   c = d;
			   d = e;
			  }
			  }

	}
