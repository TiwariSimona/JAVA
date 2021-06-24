//Write a program to print the series : 1, 2, 3, 4, 5,6 ,7, 8 ,9 ,10 , 12 , 21, 23,32,34, 43, ……. The following series will depend upon upto how many numbers user want to print the series.

package daysOfCode;
import java.util.*;
public class sol_14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        sc.close();
        if(n<=10)
        {
            for(int i=1;i<=n;i++){
               System.out.print(i+ " ");}
        }
        else
        {
            for(int i=1;i<=10;i++){
                System.out.print(i+ " ");}
            int j=11,z=10;
            while(j<=n)
            {
            
            if(j<=n)
            {
              z=z+2; 
             System.out.print(z+" ");
             j++; 
            }
            if(j<=n)
            {
             z+=9;
            System.out.print(z+" ");
            j++;
           }
           
        }}
        
    }
}

