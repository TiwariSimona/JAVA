//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder. What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20.

public class ques94 {

	public static void main(String[] args) {
		long i=21;
		while(true) {
			if(isDivisible(i)) {
				System.out.println("num:"+i);
				System.exit(1);
			}
		i++;
		}
	}

	public static boolean isDivisible(long n) {
		for(long i=2;i<=20;i++) {
			if(n%i!=0)
		
		return false;
			}
		return true;
	}

}
