//In the United Kingdom the currency is made up of pound (£) and pence (p).

public class ques97 {
		public interface Solution{
public String run();
	}
		public final static class p031 implements Solution {
			 
			 public static void main(String[] args) {
			  System.out.println(new p031().run());
			 }
			  private static final int TOTAL = 200;
			 private int[] COINS = {1, 2, 5, 10, 20, 50, 100, 200};
			 
			 public String run() {
			  int[][] ways = new int[COINS.length + 1][TOTAL + 1];
			  ways[0][0] = 1;
			  for (int i = 0; i < COINS.length; i++) {
			   for (int j = 0; j <= TOTAL; j++)
ways[i + 1][j] = ways[i][j] + (j >= COINS[i] ? ways[i + 1][j - COINS[i]] : 0);
			  }
  return Integer.toString(ways[COINS.length][TOTAL]);
			 }		 
			}
	}
