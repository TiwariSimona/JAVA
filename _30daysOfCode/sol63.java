//Calculate the total fare of your ride in taxi. The taxi has a base fee of P40.00 for the first 250 meters. An additional P2.50 is added for every succeeding 200 meters. Compute and print the total fare that you would need to pay.

import java.util.Scanner;

public class ques63 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance");
		double d=sc.nextDouble();
		fare(d);
	}
	public static void fare(double d) {
		if(d>250) {
			double fun=2.5*((d-250)/200)+40;
			System.out.println(fun);
		}
		else {
			int p=40;
			System.out.println(p);
		}
	}
}
