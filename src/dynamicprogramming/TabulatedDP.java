package dynamicprogramming;

public class TabulatedDP {

  public static int getFactorial(int num) {
    int[] dp = new int[num+1];
    dp[0] = 1;
    for (int i = 1; i <= num; i++) {
      dp[i] = dp[i - 1] * i;
    }
    return dp[num];
  }

  public static void main(String[] args) {
    for (int i = 10; i > 1; i--) {
      System.out.println("Get Factorial of " + i + ": " + getFactorial(i));
    }
  }

}
