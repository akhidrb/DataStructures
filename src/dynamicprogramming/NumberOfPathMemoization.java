package dynamicprogramming;


public class NumberOfPathMemoization {

  int iteration;

  public int getNumberOfPaths(int[][] grid) {
    iteration = 0;
    return getNumberOfPaths(grid, 0, 0);
  }

  private int getNumberOfPaths(int[][] grid, int row, int col) {
    iteration++;
    if(!isValidPoint(grid, row, col)) return 0;
    if(row == grid.length - 1 && col == grid[row].length - 1) return 1;
    return getNumberOfPaths(grid, row + 1, col) + getNumberOfPaths(grid, row, col + 1);
  }

  public int getNumberOfPathsMem(int[][] grid) {
    iteration = 0;
    return getNumberOfPathsMem(grid, 0, 0);
  }

  private int getNumberOfPathsMem(int[][] grid, int row, int col) {
    iteration++;
    if(!isValidPoint(grid, row, col)) return 0;
    if(row == grid.length - 1 && col == grid[row].length - 1) return 1;
    if (grid[row][col] == 0) {
      grid[row][col] = getNumberOfPathsMem(grid, row + 1, col) + getNumberOfPathsMem(grid, row, col + 1);
    }
    return grid[row][col];
  }

  private boolean isValidPoint(int[][] grid, int row, int col) {
    if (row < 0 || col < 0 || row >= grid.length || col >= grid[row].length) {
      return false;
    }
    Point[] points = getBombPoints();
    for (int i = 0; i < points.length; i++) {
      if (row == points[i].row && col == points[i].column) {
        return false;
      }
    }

    return true;
  }

  private Point[] getBombPoints() {
    Point[] points = {
        new Point(1, 2),
        new Point(1, 6),
        new Point(2, 4),
        new Point(3, 0),
        new Point(3, 2),
        new Point(3, 5),
        new Point(4, 2),
        new Point(5, 3),
        new Point(5, 4),
        new Point(5, 6),
        new Point(6, 1),
        new Point(6, 5)
    };
    return points;
  }

  class Point {
    int row;
    int column;
    Point(int row, int column) {
      this.row = row;
      this.column = column;
    }
  }

  public static void main(String[] args) {
    int[][] grid = new int[8][8];
    NumberOfPathMemoization paths = new NumberOfPathMemoization();
    System.out.println("Paths: " + paths.getNumberOfPaths(grid) + ", Iteration: " + paths.iteration);
    System.out.println("Paths Mem: " + paths.getNumberOfPathsMem(grid) + ", Iteration: " + paths.iteration);
  }
}
