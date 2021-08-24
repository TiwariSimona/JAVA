import java.util.*;
public class ques25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[32];
		int ar[]=new int[32];
		int p=0,i=a.length-1;
		
		while(n>0) {
			p=n%2;
			n/=2;
			a[i--]=p;
		}
		System.out.println("Binary equivalent:");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]);}
		System.out.println();
		System.out.println("which bit to toggle");
		int k=sc.nextInt();
		for(int j=0;j<a.length;j++) {
			a[k]=a[j]^1;
			System.out.print(ar[k]);}
		}
	
}
	


