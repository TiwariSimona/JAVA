//WAP to Print the pattern given below:

package daysOfCode;
public class sol_54 {
	    public static void main(String args[])
	    {
	        int m=5;
	        String s="";
	        for(int i=1;i<=3;i++)
	        {System.out.print(s);
	            for(int j=1;j<=m;j++ )
	            {
	            System.out.print("*");     
	           }
	           m-=2;
	           System.out.println();
	           s=s+" "; 
	        }
	    System.out.print(" ");
	    int m1=3;
	    for(int i=1;i<=2;i++)
	    {
	for(int j=1;j<=m1;j++)
	{
	    System.out.print("*");
	}
	    m1+=2;
	System.out.println();
	    }
	}    
	}


