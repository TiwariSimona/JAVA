//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17. Find the sum of all the primes below two million.ś

package daysOfCode;

public class sol_95 {
	

		public static void main(String[] args) {
		    long start = System.nanoTime();

		    long sum = 0;

		    for (int i = 2; i < 2000000; i++) {
		        boolean isPrime = true;

		        if ((i % 2 == 0 || i % 3 == 0) && (i!=2 || i!=3 || i!=5)) {
		            isPrime = false;
		        } else {
		            for (int j = 5; j <= Math.sqrt(i); j = j + 6) {
		                if (i % j == 0 || i % (j + 2) == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		        }

		        if (isPrime == true) {
		            sum += i;
		        }
		    }

		    System.out.println(sum);
		    long end = System.nanoTime();
		    System.out.println(end - start);
		}
}
