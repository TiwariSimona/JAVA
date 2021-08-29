//Write a program to display square root of a N numbers using newton’s method

import java.util.*;
class Ques61
{
    static double sqRoot(double num, double l)
    {
        double val = num;
     
        double root;
    
        int count = 0;
     
        while (true)
        {
            count++;
   
            root = 0.5 * (val + (num / val));
     
            if (Math.abs(root - val) < l)
                break;
    
            val = root;
        }
     
        return root;
    }
  
    public static void main (String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of num");
        double num = sc.nextDouble();
        double l = 0.00001;
     
        System.out.println(sqRoot(num, l));
    }
}
 
