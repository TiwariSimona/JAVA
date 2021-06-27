//WAP to print following triangle:

package daysOfCode;

public class sol_49 {
	
	    public static void main(String args[])
	        {
	            int t=8;
	            String s=" ";
	            for(int i=1;i<=5;i++)
	            {
	                for(int j=1;j<=t;j++)
	                {
	                    System.out.print(" ");
	                }
	                for(int z=1;z<=i;z++)
	                {
	                    System.out.print("*"+" ");
	                   
	                }
	                t-=2;
	                System.out.println();
	            }
	        }
	    }

