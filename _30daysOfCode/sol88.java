//Write a program to generate random integers in a specific range.

import java.util.*;
public class Q88 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        int number = a + (int)(Math.random() * b);
        System.out.println(number);

    }
}
