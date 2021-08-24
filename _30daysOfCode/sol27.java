import java.util.*;
public class Q27 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(a);
		int count=1;
		for(int i=0;i<n;i++) {
			if(a[i]>0) {
				if(a[i]!=count) {
					System.out.println("First positive missing number: "+count);
					System.exit(1);
				}
				else
					count++;
			}
		}
		System.out.println("First positive missing number: "+count);
	}
}
