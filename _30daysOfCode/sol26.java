//Write a program to input a number and check and print whether it is a Pronic number or not. (Pronic number is the number which is the product of two consecutive integers).

package cwcquestion30days;
import java.util.*;
public class ques26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(i*(i+1)==n) {
				System.out.println("is a pronic number");
				System.exit(1);
			}
		}
System.out.println("not a pronic number");
	}

}
