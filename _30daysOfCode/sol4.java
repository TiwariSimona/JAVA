//Given four points in the plane, write a program to check if they are the vertices of a rectangle.

package daysOfCode;
import java.util.Scanner;
public class sol_4 {

    public static void main(String args[])
       {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int n_squ = n*n;  
 
        String str_n = Integer.toString(n);  
        String squr = Integer.toString(n_squ);  
 
        if(squr.endsWith(str_n))  
            System.out.println("The number is a vertex of rectangle");
        else
            System.out.println("The number is not a vertex of rectangle");
    }
}
