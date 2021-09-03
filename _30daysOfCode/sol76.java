//Maya celebrated her birthday party. After the completion of cake cutting ceremony, Maya’s mom cuts the cake into various pieces inorder to distribute it to all her friends.Given an integer n denoting the number of cuts that can be made on a birthday cake. Write a code to find the maximum number of pieces that can be formed by making n cuts.

import java.util.Scanner;

public class ques76 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of cuts: ");
	int n =sc.nextInt();
	int cake=((n*n)+n+2)/2;
	System.out.println("max pieces formed is:"+cake);

	}

}
