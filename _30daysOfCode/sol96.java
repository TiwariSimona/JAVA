//Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.

public class ques96 {

	public static void main(String[] args) {
		 long result = 0L; 
		    long modulo = 10000000000L; 
		    for (int i = 1; i <= 1000; i++)
		     { long temp = i; 
		     for (int j = 1; j < i; j++) {
		      temp *= i; 
		       temp %= modulo; } 
		        result += temp; 
		        result %= modulo; } 
		 System.out.println(result);
		   
		    }
		}	
