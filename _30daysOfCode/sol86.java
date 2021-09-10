//Write a program to generate and show all Kaprekar numbers less than 1000.

public class Q86 {
	public static void main(String[] args) {
		System.out.println("Kaprekar numbers (1-1000):");
		for(int i=1;i<1000;i++) {
			int square=i*i;
			String s=""+square;
			if(square==1) {
				System.out.println(i);
			}
			for(int j=1;j<s.length();j++) {
				int sum=Integer.parseInt(s.substring(0, j))+Integer.parseInt(s.substring(j));
				if(sum==i && i%10!=0) {
					System.out.println(i);
					break;
				}
			}
		}
	}
}
