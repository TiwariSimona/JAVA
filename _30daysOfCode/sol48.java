//Compute x^y using only bit-wise operators.

package daysOfCode;

import java.util.Scanner;

class q48 
{
  public static void main(String[] args) 
  {
   double x=2.0;
   int y=3;
   System.out.println(power(x,y));
  }

public static double power(double x, int y)
{
double result = 1.0;
long p = y;
if (y < 0) 
{
p = -p;
x = 1.0/ x ;
}
while (p != 0) 
{
if ((p & 1) != 0) 
{
result *= x;
}
x *= x ;
p= p>>1 ;
}
return result ;
}}
