package recursion;

public class Fibonnaci {

  int iteration;

  public Fibonnaci() {
    this.iteration = 0;
  }

  public int getFibonnaci(int num) {
    iteration++;
    if (num <= 0) return 0;
    else if(num == 1) return 1;

    return getFibonnaci(num - 1)  + getFibonnaci(num - 2);

  }

  public static void main(String[] args) {
    Fibonnaci fibonnaci = new Fibonnaci();
    System.out.println("Factorial: " + fibonnaci.getFibonnaci(6) + ", Iteration: " + fibonnaci.iteration);
  }
}
