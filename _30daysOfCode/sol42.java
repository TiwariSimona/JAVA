//Print the following pattern

package daysOfCode;

public class sol_42 {
	    public static void main(String args[])
	    {
	        int t=5;int m=0;
	        for(int i=1;i<=5;i++)
	        {m=1;
	            for(int j=1;j<t;j++)
	            {
	                System.out.print("    ");
	                m++;
	            }
	            
	            for(int z=1;z<=i;z++)
	            {
	                System.out.print(m+"       ");
	                m=m+2;
	            }
	            t--;
	            System.out.println();
	        }
	    }
	    }
	    


