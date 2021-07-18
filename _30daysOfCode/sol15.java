//Given a pole of length n and a rundown of costs of poles of length I, where 1 <= I <= n, track down the ideal method to cut the pole into more modest poles to augment benefit.

import java.util.Scanner;

public class ques15 {

	
		static int length[]={1,2,3,4,5 ,6, 7, 8};
		static int price[]= {1,5,8,9,10,17,17,20};
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Available rod lengths: {1,2,3,4,5,6,7,8}\n");
			System.out.print("Enter the required rod length: ");
			int n=sc.nextInt();
			sc.close();
			int profit[]=new int[length.length],c=0;
			for(int i=0;i<n;i++) {
				int a=length[i];
				for(int j=i;j<n;j++) {
					if(a+length[j]==n) {
						profit[c++]=price[i]+price[j];
					}
					else if(a==n){
						profit[c++]=price[i];
					}
				}
			}
			int max=0;
			for(int i=0;i<profit.length;i++) 
				if(profit[i]>max)
					max=profit[i];
			
			System.out.println("Maximum profit: "+max);
		}
	

	}


