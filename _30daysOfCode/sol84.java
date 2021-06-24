//Print the following pattern.

package daysOfCode;
public class sol_84 {
    public static void main(String args[])
    {
        int t=5;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=t;j++)
            {
                System.out.print("    ");}
                for(int z=1;z<=i;z++)
                {
                    System.out.print(z+"       ");

                }
                System.out.println();
                t--;
            }
        }
    }
