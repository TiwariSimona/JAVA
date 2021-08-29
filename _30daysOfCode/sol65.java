//The number will be unique if it is positive integer and there are no repeated digits in the number. In other words, a number is said to be unique if and only if the digits are not duplicate. For example, 20, 56, 9863, 145, etc. are the unique numbers while 33, 121, 900, 1010, etc. are not unique numbers

import java.util.*;
public class Q65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your number: ");
        String a=sc.next();
        int count=0;
        Integer s=Integer.parseInt(a); 
        System.out.println(s);
        char arr[]=new char[a.length()];
        for(int i=0;i<a.length();i++) {
        	arr[i]=a.charAt(i);
        	System.out.print(arr[i]+"");
        }        
        for(int i=0;i<a.length();i++) {
        	for(int j=0;j<i;j++) {
        		if(arr[i]==arr[j]) {
        			count=1;
        			break;
        		}
        	}
        }
        if(count==0) System.out.println(" Unique ");
        else System.out.println(" Not unique ");
    }
}
