//Design a pizza counter management system which will take the order from the user and present the bill after calculating the quantity and price of each item ordered by user.

import java.util.*;
public class Q17 {
	final static int cp=350, cbp=420, dcmp=440, mgcbp=510, coke=35,water=40;
	public static void main(String[] args) {
		
		System.out.println("1.Cheese Pizza: Rs."+cp);
		System.out.println("2.Chicken Burst Pizza: Rs."+cbp);
		System.out.println("3.Double Cheese Mixed Pizza: Rs."+dcmp);
		System.out.println("4.Mushroom Grilled Cheese Burst Pizza: Rs."+mgcbp);
		System.out.println("5.Coke (300ml): Rs."+coke);
		System.out.println("6.Mineral Water: Rs."+water);
		
		input();
	}
	
	public static void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("\nHow many dishes you want to take: ");
		int n=sc.nextInt();
		int order[]=new int[n];
		int quan[]=new int[n];
		System.out.print("Enter the item number you want to take: ");
		for(int i=0;i<n;i++) { 
			order[i]=sc.nextInt();
		}
		System.out.print("Enter the corresponding quantity: ");
		for(int i=0;i<n;i++) { 
			quan[i]=sc.nextInt();
		}
		sc.close();
		int price[]=new int[n];
		for(int j=0;j<n;j++) {
			if(order[j]==1)
				price[j]=cp;
			else if(order[j]==2)
				price[j]=cbp;
			else if(order[j]==3)
				price[j]=dcmp;
			else if(order[j]==4)
				price[j]=mgcbp;
			else if(order[j]==5)
				price[j]=coke;
			else if(order[j]==6)
				price[j]=water;
			else
				price[j]=0;
		}
		calculate(quan,price,n);
	}
	
	public static void calculate(int quan[],int price[],int n) {
		int total[]=new int[1];
		for(int j=0;j<n;j++) 
			total[0]+=price[j]*quan[j];
		System.out.println("\nThanks for visiting here");
		System.out.println("Bill Generated...");
		System.out.println("Please pay Rs. "+total[0]+" through any mode");
	}
}
