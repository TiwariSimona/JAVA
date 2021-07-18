
//A member of CWC asks a random question from different coordinators of the club. The member of the club gets an answer from xyz kumar. Write a code that will keep track of question asked by and answer given by in the corresponding index.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ques13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total no. of questions asked : ");
		int n=sc.nextInt();
		List li=new ArrayList();
		
		for(int i=1;i<=n;i++) {
			if(i==1)
				System.out.println("Enter asker�s and coordinator�s name for "+i+"st one : ");
			else if(i==2)
				System.out.println("Enter asker�s and coordinator�s name for "+i+"nd one : ");
			else if(i==3)
				System.out.println("Enter asker�s and coordinator�s name for "+i+"rd one : ");
			else
				System.out.println("Enter asker�s and coordinator�s name for "+i+"th one : ");

			String s1=sc.next();
			String s2=sc.next();
			li.add(s1);
			li.add(s2);
		}
		System.out.println("----------------------------------------------------------");
		System.out.println("Asker                       Query Solved by");
		System.out.println("----------               ----------------------");
		for(int i=0;i<li.size();i+=2) {
			System.out.println(li.get(i)+"                            "+li.get(i+1));
		}
		System.out.println("----------------------------------------------------------");
		
	}
}
