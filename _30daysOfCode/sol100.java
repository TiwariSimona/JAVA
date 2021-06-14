//Find the sum of all numbers, less than one million, which are palindromic in base 10 and base  2

package daysOfCode;
import java.util.*;

public class sol_100 {	
	static String integer_to_string(int n, int base)
	{
		String str="";
		while (n > 0) {
			int digit = n % base;
			n /= base;
			str+=(char)(digit+'0');
		}
		return str;
	}
	static int isPalindrome(int i, int k)
	{
		int temp = i;
		int m = 0;
		while (temp > 0) {
			m = temp % 10 + m * 10;
			temp /= 10;
		}
		if (m == i) {
			String str = integer_to_string(m, k);
			StringBuilder sb = new StringBuilder(str);
			String str1=sb.reverse().toString();
			if (str.equals(str1)) {
				return i;
			}
		}
		return 0;
	}
	static void sumPalindrome(int n, int k){
		
		int sum = 0;
		for (int i = 1; i < n; i++) {
			sum += isPalindrome(i, k);
		}
		System.out.println("Total sum is "+sum);
	}

	public static void main(String[] args)
	{
		int n = 100;
		int k = 2;

		sumPalindrome(n, k);
	}
	}
	


