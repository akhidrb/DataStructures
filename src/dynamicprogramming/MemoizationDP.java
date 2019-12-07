package dynamicprogramming;

public class MemoizationDP {

  int iteration = 0;

  public int getFactorial(int num) {
    int[] dp = new int[num+1];
    return getFactorialRec(dp, num);
  }

  private int getFactorialRec(int[] dp, int num) {
    iteration++;
    if (num == 0) return 1;
    dp[num] = getFactorialRec(dp, num - 1) * num;
    return dp[num];
  }

  public static void main(String[] args) {
    MemoizationDP memoizationDP = new MemoizationDP();
    System.out.println("Fact: " + memoizationDP.getFactorial(8));
    System.out.println("Iteration: " + memoizationDP.iteration);

//    for (int i = 5; i >= 1; i--) {
//      System.out.println("Get Factorial of " + i + ": " + getFactorial(i));
//    }
  }

}
