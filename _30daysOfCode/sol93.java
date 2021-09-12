//2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.What is the sum of the digits of the number 2^1000.

import java.math.BigInteger;
public class Q93 {
    
    public static void main(String[] args) {
    	BigInteger a=new BigInteger("1");
    	BigInteger b=new BigInteger("0");
    	BigInteger c=new BigInteger("0");
        for(int i=1;i<=15;i++){
        	a=a.multiply(BigInteger.valueOf(2));
        }
       
        BigInteger cout=BigInteger.ZERO;       
        while(a!=BigInteger.valueOf(0)){
            b=b.add(a.mod(BigInteger.valueOf(10)));
           
        	a=a.divide(BigInteger.valueOf(10));
        	
        }
        System.out.println("Sum of digits are = "+b);
    }
}
