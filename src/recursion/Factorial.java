package recursion;

public class Factorial {

  int iteration;

  public Factorial() {
    this.iteration = 0;
  }

  public int getFactorial(int num) {
    iteration++;
    if (num == 0) return 1;

    return getFactorial(num - 1)  * num;

  }

  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    System.out.println("Factorial: " + factorial.getFactorial(6) + ", Iteration: " + factorial.iteration);
  }
}
