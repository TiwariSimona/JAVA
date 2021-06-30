//Write a program to print the following pattern:


public class sol_52 {
	
		public static void main(String args[])
		{
			int t=4;
			char ch[]={'C','W','C'};
			String s="";
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=t;j++)
				{
					System.out.print(" ");
				}
				for(int z=1;z<=1;z++)
				{
					System.out.print(ch[0]+s);
					
					System.out.print(ch[1]+s);
					System.out.print(ch[2]);
					
				}
				s+=" ";
				System.out.println();
				t--;
			}
		}
		

	}

