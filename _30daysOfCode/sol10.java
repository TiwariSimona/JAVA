//Write a program that has three numbers a, b, c where a < b < c and a^2 + b^2 = c^2. There exists only one solution where it satisfies the following equation for a+ b + c = 1000. Find the product abc.

package daysOfCode;

public class sol_10 {

		public static void main(String[] args) {
		int i=0,j=0,k=0,s=1000;
		    int d=0;
		    for(i=1;i<s/3;i++)
		    {
		        for(j=i;j<s/2;j++)
		        {
		            k=s-i-j;
		            if(i*i+j*j==k*k)
		            {
		                d++;
		                break;
		            }
		        }
		        if(d>0)
		        {
		          break;
		        }
		    }
		    System.out.println(i*j*k);	
			
		}
		}


