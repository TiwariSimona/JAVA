//WAP to check if a number is Armstrong number or not.

package daysOfCode;

import java.util.*;
public class sol_47 {
    public static void main(String args[])
    {
Scanner sc=new Scanner (System.in);
int n=sc.nextInt();
int d=n;
int r,sum=0;
while(d!=0)
{
r=d%10;
sum=sum+(r*r*r);
d/=10;
}
if(sum==n)
{
    System.out.println(n+ "  is a armstrong no" );

}
else
{
    System.out.println(n+ "  is not  a armstrong no" );
}
    }
    
}

