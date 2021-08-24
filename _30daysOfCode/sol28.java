import java.util.*;
public class ques28 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double sum=0; int j=0;
		for(int i=1;i<=n;i++) {
			
			
		sum=sum+ Math.pow(i, n-j);
		j++;
		System.out.print(sum+" +");
				
			}
			
		}
	}
