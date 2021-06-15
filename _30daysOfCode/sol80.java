//Given two numbers m and n , you are required to check whether they are anagram of each other or not in binary representation?

  package daysOfCode;
	import java.util.Arrays;
	import java.util.Scanner;
	import java.io.*; 
	public class sol_80 {
		 public static void main (String[] args)
		    {
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter the 1st number");
		        long a = sc.nextLong();
		        System.out.println("Enter the 2nd number");
		        long b = sc.nextLong();
		        System.out.println(check(a, b));
		    }
	    public static int length = 8;   
	    static int check(long a, long b)
	    {        
	        int i = 0;
	        long[] Abin = new long[length];
	        Arrays.fill(Abin, 0);
	        while (a > 0)
	        {
	           Abin[i] = a%2;
	            a /= 2;
	            i++;
	        }  
	        int j = 0;
	        long[] Bbin = new long[length];
	        Arrays.fill(Bbin, 0);
	        while (b > 0)
	        {
	           Bbin[j] = b%2;
	            b /= 2;
	            j++;
          }	  	      
	        Arrays.sort(Abin);
	        Arrays.sort(Bbin);	       
	        for (i = 0; i < length; i++)
	            if (Abin[i] != Bbin[i])
	                return 0; 
	        return 1;
      }
	}

