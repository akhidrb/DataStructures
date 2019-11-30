package dynamicprogramming;

public class MemoizationDP {

  public static int getFactorial(int num) {
    int[] dp = new int[num+1];
    return getFactorialRec(dp, num);
  }

  public static int getFactorialRec(int[] dp, int num) {
    if (num == 0) return 1;
    dp[num] = getFactorialRec(dp, num - 1) * num;
    return dp[num];
  }

  public static void main(String[] args) {
    for (int i = 5; i >= 1; i--) {
      System.out.println("Get Factorial of " + i + ": " + getFactorial(i));
    }
  }

}
