//Write a program Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array. It is not allowed to give array length.

import java.util.*;
public class Q72 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ind[] = new int[n];
        System.out.println("Enter thr index of corresponding elements: ");
        for (int i = 0; i < n; i++) {
            ind[i] = sc.nextInt();
        }
        int fnl[] = new int[n];
        for (int i = 0; i < n; i++) {
            fnl[ind[i]] = arr[i];
        }
        Arrays.sort(ind);
        System.out.print("arr[]   = ");
        for (int i = 0; i < n; i++) {
            if (i == 0)
                System.out.print("[" + fnl[i] + ", ");
            else if (i == n - 1)
                System.out.print(fnl[i] + "]");
            else
                System.out.print(fnl[i] + ", ");
            
        }
        System.out.println();
        System.out.print("index[] = ");
        for (int i = 0; i < n; i++) {
            if (i == 0)
                System.out.print("[" + ind[i] + ", ");
            else if (i == n - 1)
                System.out.print(ind[i] + "]");
            else
                System.out.print(ind[i] + ", ");
           
        }
        System.out.println();
    }
}
