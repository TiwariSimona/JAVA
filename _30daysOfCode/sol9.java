//Find the sum of the digits in the number 100!

package daysOfCode;
import java.util.*;

public class sol_9 {
	static ArrayList<Integer> v=new ArrayList<Integer>();
	static void multiply(int x)
	{
	 int carry = 0;
	 int size = v.size();
	 for (int i = 0 ; i < size ; i++)
	 {
	     int res = carry + v.get(i) * x;

	     v.set(i,res % 10);
	     carry = res / 10;
	 }
	 while (carry != 0)
	 {
	     v.add(carry % 10);
	     carry /= 10;
	 }
	}
	static int findSumOfDigits(int n)
	{
	 v.add(1);
	
	 for (int i=1; i<=n; i++)
	     multiply(i);

	 int sum = 0;
	 int size = v.size();
	 for (int i = 0 ; i < size ; i++)
	     sum += v.get(i);
	 return sum;
	}
	public static void main(String[] args)
	{
	 int n = 1000;
	 System.out.println(findSumOfDigits(n));
	}
}
