//Program to calculate circular primes below one million

package daysOfCode;
import java.util.*;
public class sol_99 {
public static void main(String[] args) {
        int count = 0; 
        int prime_count=0;
  
      for (long i = 2; i < 1000000; i++) {
          if(isprime(i)){
              prime_count++;
            String num=i+"";
            boolean a = false;
            String temp = num;
            for (int j = 0; j < num.length(); j++) {
                temp = temp.charAt(temp.length() - 1) + temp;
                temp = temp.substring(0, temp.length() - 1);
            if(!isprime(Long.parseLong(temp))){
                a=false;
               break; 
            }else{
                a=true;
            }
            }
            if (a) {
                count++;
            }
      }  
        }
        System.out.println("prime count is : "+prime_count);
        System.out.println("THE ANSWER IS :" + count);
    }
    static boolean isprime(long num){
            
            boolean prime = true;
            if (num == 2) {
                prime = true;
            } else if (num % 2 == 0) {
                prime = false;
            } else {
                for (int j = 3; j <= Math.sqrt(num); j++) {
                    if (num % j == 0) {
                        prime = false;
                    }
                }
            }
      return prime; 
    }
}
