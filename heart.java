import java.util.*;
public class Heart{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter heart size");
        int n=sc.nextInt();
        for(int i=-3*n/2;i<=n;i++){
            for(int j=-3*n/2;j<3*n/2;j++){
                if((Math.abs(i)+Math.abs(j)<n)||((-n/2-i)*(-n/2-i))+(n/2-j)*(n/2-j)<=n*n/2||((-n/2-i)*(-n/2-i))+(-n/2-j)*(-n/2-j)<=n*n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
