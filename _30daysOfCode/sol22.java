//Multiply two numbers with using only Bitwise Operators.

package daysOfCode;
import java.io.*;

public class sol_22 {
	
		static int russianPeasant(int a, int b)
		{
			int res = 0;
			while (b > 0)
			{
				if ((b & 1) != 0)
					res = res + a;

				a = a << 1;
				b = b >> 1;
			}
			return res;
		}
		
		public static void main (String[] args)
		{
			System.out.println(russianPeasant(18, 1));
			System.out.println(russianPeasant(20, 12));
		}
	}

	
