import java.util.*;
//WAP to find roots of any quadratic equation.

public class Q46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coefficient of x^2: ");
        double a=sc.nextDouble();
        System.out.println("Enter the coefficient of x: ");
        double b=sc.nextDouble();
        System.out.println("Enter the constant: ");
        double c=sc.nextDouble();
        double d=(b*b)-(4*a*c); double dd=Math.pow(Math.abs(d), 0.5)/(2*a);
        double d1=Math.abs(dd);  
        double s=-b/(2*a);
        if(d<0) {
        	System.out.print("root1= " + s + "+");
        	System.out.printf("%.3f",d1);
        	System.out.print("i");
        	System.out.println();
        	System.out.print("root1= " + s + "-");
        	System.out.printf("%.3f",d1);
        	System.out.print("i");
        }
        else if(d>0) {
        	System.out.print("root1= " + s + "+");
        	System.out.printf("%.3f",d1);
        	System.out.print("i");
        	System.out.println();
        	System.out.print("root1= " + s + "-");
        	System.out.printf("%.3f",d1);
        	System.out.print("i");
        }
        else System.out.println(s);
    }
}
