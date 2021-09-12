//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class D30Q92 {
    public static void main(String[] args) {
        int ss1=0;int s2=0;
        for(int i=1;i<=100;i++){
            ss1=ss1+(i*i);
            s2=s2+i;
        }
        int ss2=s2*s2;
        
        System.out.println(Math.abs(ss1-ss2));
    }
}
