//Write a program to differentiate an equation and integrate it back to prove the differentiation. Also ask the user if he/she wants to solve the differentiated equation for any values of x. If yes then print the value else terminate the program.

import java.util.*;
public class Q16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the equation (x and/or y)terms: ");
		String s=sc.nextLine();
		s=s.toLowerCase();
		int i=0, count=1;
		while(i<s.length()) {
			if(s.charAt(i)=='+') {
				if(!s.substring(i,s.length()).equals(" "))
					count++;
			}
			i++;
		}
		String terms[]=new String[count];
		int c1=0,index=0;
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)=='+') {
				terms[index++]=s.substring(c1,j);
				c1=j+1;
			}
		}
		terms[count-1]=s.substring(c1);
		String ans="", integration="";
		for(int j=0;j<count;j++) {
			String var="";
			if(j!=count-1) {
				String varFind=terms[j];
				for(int c=0;c<varFind.length();c++) {
					if(varFind.charAt(c)=='x')
						var="x";
					else if(varFind.charAt(c)=='y')
						var="y";
				}
				String res=diff(terms[j]);
				ans=ans.concat(res+" + ");
				integration=integration.concat(inte(res,var)+" + ");
			}	
			else {
				String varFind=terms[j];
				for(int c=0;c<varFind.length();c++) {
					if(varFind.charAt(c)=='x')
						var="x";
					else if(varFind.charAt(c)=='y')
						var="y";
				}
				String res=diff(terms[j]);
				ans=ans.concat(diff(terms[j]));
				integration=integration.concat(inte(res,var));
			}	
		}
		System.out.println("Derivative: "+ans);
		System.out.println("After integration, we got: "+integration);
		System.out.print("Do you want to solve the differential equation for any value of x and y (Y/N): ");
		char opt=sc.next().charAt(0);
		if(opt=='y' || opt=='Y') {
			System.out.print("Enter the value of x and y: ");
			int x=sc.nextInt();
			int y=sc.nextInt();
			sc.close();
			double res=0;
			int c2=0, term=1;
			for(int t=0;t<ans.length();t++) {
				if(ans.charAt(t)=='+') {
					res=res+solve(ans.substring(c2, t), x, y);
					c2=t+1;                                                  //check
					term=term+1;
				}
				else continue;
			}
			if(term==1) {
				res+=solve(ans,x,y);
				System.out.println("Value for differential equation: "+res);
			}
			else {
				System.out.println("Value for differential equation: "+res);
			}
		}
		else
			System.exit(0);
	}
	public static String diff(String s) {
		int coeff=1, pow=1, i=0;
		s=s.trim();
		String var="";
		while(i<s.length()) {
			if(s.charAt(i)=='x' || s.charAt(i)=='y') {
				var=""+s.charAt(i);
				if(s.subSequence(0, i).equals(" "))
					coeff=1;
				else
					coeff=Integer.parseInt(s.substring(0,i));
				if(s.substring(i+1,s.length()).equals(" ") || s.substring(i+1,s.length()).equals(""))
					pow=1;
				else
					pow=Integer.parseInt(s.substring(i+2));
			}
			i++;
		}
		if(var=="") 
			return "0";
		int coef=pow*coeff;
		int power=pow-1;
		if(power==0) 
			return ""+coef;
		else if(power==1)
			return coef+var;
		else
			return coef+var+"^"+power;
	}
	public static String inte(String s, String variable) {
		s=s.trim();
		String var="";
		int i=0, coeff=1,pow=1;
		while(i<s.length()) {
			if(s.charAt(i)=='x' || s.charAt(i)=='y') {
				var=""+s.charAt(i);
				if(s.subSequence(0, i).equals(" "))
					coeff=1;
				else
					coeff=Integer.parseInt(s.substring(0,i));
				if(s.substring(i+1,s.length()).equals(" ") || s.substring(i+1,s.length()).equals(""))
					pow=1;
				else
					pow=Integer.parseInt(s.substring(i+2));
			}
			i++;
		}
		int power=pow+1;
		double coef= ((double)coeff)/power;
		if(var.equals(""))
			return s+variable;
		if(power==0)
			return "0";
		return coef+var+"^"+power;
	}
	public static double solve(String s, int x, int y) {
		s=s.trim();
		double coef=1;
		int pow=1;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='x') {
				if(s.substring(0, i).equals("") || s.substring(0, i).equals(" "))
					coef=1;
				else
					coef=Double.parseDouble(s.substring(0, i));
				if(s.substring(i+1).equals("") || s.substring(i+1).equals(" "))
					pow=1;
				else
					pow=Integer.parseInt(s.substring(i+2));                                                               
				return (double)coef* (double)Math.pow(x,pow);
			}
			else if(s.charAt(i)=='y') {
				if(s.substring(0, i).equals(""))
					coef=1;
				else
					coef=Double.parseDouble(s.substring(0, i));
				if(s.substring(i+2).equals(""))
					pow=1;
				else
					pow=Integer.parseInt(s.substring(i+2));
				return coef* (double)Math.pow(y,pow);
			}
		}
		return 0;
	}
}
