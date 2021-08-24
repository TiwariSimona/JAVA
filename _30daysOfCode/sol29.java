//Display the following series. Also calculate its sum 0.5 +0.55 + 0.555 + ---------- + n terms.

import java.util.*;
public class ques29 {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number: ");
	int n=sc.nextInt();
    double sum=0;
    double result=0;
	for(int i=0;i<n;i++) {
	sum=(sum*0.1+0.5);
	result=result+sum;
	System.out.print(sum+" +");
				}
	System.out.println();
	System.out.print(result);	
	}
}
