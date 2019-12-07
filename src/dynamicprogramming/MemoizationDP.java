package dynamicprogramming;

public class MemoizationDP {

  int iteration;

  public int getFactorial(int num) {
    int[] dp = new int[num+1];
    iteration = 0;
    return getFactorialRec(dp, num);
  }

  private int getFactorialRec(int[] dp, int num) {
    iteration++;
    if (num == 0) return 1;
    dp[num] = getFactorialRec(dp, num - 1) * num;
    return dp[num];
  }

  public int getFibonnaci(int num) {
    int[] dp = new int[num+1];
    iteration = 0;
    return getFibonnaciRec(dp, num);
  }

  private int getFibonnaciRec(int[] dp, int num) {
    iteration++;
    if (num == 0) return 0;
    else if (num == 1) return 1;
    if (dp[num] == 0) {
      dp[num] = getFibonnaciRec(dp, num - 1) + getFibonnaciRec(dp, num - 2);
    }
    return dp[num];
  }


  public static void main(String[] args) {
    MemoizationDP memoizationDP = new MemoizationDP();
    System.out.println("Factorial: " + memoizationDP.getFactorial(6) + ", Iteration: " + memoizationDP.iteration);
    System.out.println("Fibonnaci: " + memoizationDP.getFibonnaci(6) + ", Iteration: " + memoizationDP.iteration);
  }

}
