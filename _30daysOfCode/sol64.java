//William planned to choose a four digit lucky number for his car. His lucky numbers are 3,5 and 7. Help him find the number, whose sum is divisible by 3 or 5 or 7. Provide a valid car number, Fails to provide a valid input then display that number is not a valid car number.

import java.util.*;
public class ques64 {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the car no:");
		int n=sc.nextInt();
		lucky(n);
	}
	public static void lucky(int n) {
        if(n<1000||n>9999){
        	System.out.println(n+" is not a valid car number");
        }
        else{
        	int sum=0;
        	while(n>0){
        		int rem=n%10;
        		sum+=rem;
	            n/=10;
        	}
        	if(sum%3==0||sum%5==0||sum%7==0)
        		System.out.println("Lucky Number");
        	else
        		System.out.println("Sorry its not my lucky number");
        }
	}
}
