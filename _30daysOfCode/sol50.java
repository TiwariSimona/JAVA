//Write a program to find the maximum number of distinct prime factors a number has in a given range and print the max number of factors.

package daysOfCode;
import java.util.*;
public class sol_50 {
	
	
	    public static void main(String args[])
	    {
	    	System.out.println("input first interger and ");
	    	System.out.println("input second integer");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	boolean res;
	ArrayList<Integer> ob =new ArrayList<Integer>(b-a+1);
	ArrayList<Integer> ob1=new ArrayList<Integer>(b-a+1);
	int c=0,c1=0,max1=0,num=Integer.MAX_VALUE;
	for(int i=a;i<=b;i++)
	{
	    c=0;
	    ob1.add(i);
	    for(int j=2;j<=i;j++)
	    {
	        res=prime(j);
	        if(res==true && (i%j==0))
	        {
	        c++;
	         max1=Math.max(max1,c);
	         c1=c;
	       }

	    }
	    ob.add(c1);
	    System.out.println("no of distinct prime factors of  "+ i+ "  is " +c1);
	}

	    
	  int s=0;  

	for(int i=0;i<ob.size();i++)
	{
	    if(ob.get(i)>s)
	    {
	        s=ob.get(i);
	    }
	}

	int n1=ob.indexOf(s);
	System.out.print(ob1.get(n1));


	}
	    public static  boolean prime(int n)
	    {
	        for(int i=2;i<=Math.sqrt(n);i++)
	        {
	         if(n%i==0)
	            return false;
	        }
	        return true;
	    }
	    
	}


