//Find the 15th term of the series.

public class Q66 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=15;
		System.out.print("15th term of the series 0,0,7,6,14,12,21,18,28,… is : ");
		if(a%2==0) {
			a=((a/2)-1)*6;
			System.out.print(a);
		}
		else {
			a=((a-1)/2)*7;
			System.out.print(a);
		}
	}
}
