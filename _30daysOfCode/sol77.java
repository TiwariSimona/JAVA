//Given an array a[] of size n and a number num ,write a program to find if there exists a pair of elements in the array whose difference is num.

import java.util.Scanner;

public class D30Q77 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n=sc.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter element at position " + i);
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter num : ");
        int num=sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                int temp=Math.abs(arr[i]-arr[j]);
                if(temp==num) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

}
