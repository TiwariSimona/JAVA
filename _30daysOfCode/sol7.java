//Calculate the area of a Circle inscribed in a Square.

package daysOfCode;
import java.io.*;
import java.util.Scanner;

public class sol_7 {
	 static double PI = 3.14;   
	    static double areaOfInscribedCircle(float a)
	    {
	        return ( PI / 4 ) * a * a;
	    }	 
	    public static void main (String[] args)
	    {
	    	Scanner sc= new Scanner(System.in);
	    	System.out.println("enter side of square");
	        float a = sc.nextFloat();     
	        System.out.println("Area of an inscribed" + " circle: " + areaOfInscribedCircle(a));
	    }
	}
