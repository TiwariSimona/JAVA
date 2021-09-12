//The prime factors of 13195 are 5, 7, 13 and 29. What is the largest prime factor of the number 600851475143.

public class ques91 {

	public static void main(String[] args) {
		long n=600851475143l;
		for(int i=2;i<n;i++) {
			while(n%i==0) {
				n=n/i;
			}
		} 
		if(n>2) {
			System.out.println( "The largest prime factor of the above number is:"+n);
		}
		

	}

}
