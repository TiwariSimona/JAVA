//WAP to Minimize given integer by swapping pairs of unequal bits(0,1) in its binary representation.

package daysOfCode;
import java.util.Scanner;
public class sol_45 {
	

	  public static int findMinNum(int num){
		                     
		   String binaryNumber = Integer.toBinaryString(num);
		   String minBinaryNumber = "";
		   int count0 = 0, count1 = 0;
		   int N = binaryNumber.length();
		        for (int i = 0; i < N; i++) {
		               if (binaryNumber.charAt(i) == '1') {
		                count1++;
		                }
		               else {
		                count0++;
		               }
		         }
		         for (int i = 0; i < count1; i++) {
		               minBinaryNumber += '0';
		         }
		        for (int i = 0; i < count0; i++) {
		           minBinaryNumber += '1';
		          }
		         return Integer.parseInt(
		           minBinaryNumber, 2);
	  }
		        public static void main(String[] args)
		            {
		        	System.out.println("enter number");
		        	Scanner sc=new Scanner(System.in);
		                int N = sc.nextInt();
		                System.out.println(findMinNum(N));
	                     }
}
