package graph;

public class DepthFirstSearch {

  public static int getBiggestRegion(int[][] matrix) {
    int maxRegion = 0;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        int size = getRegionSize(matrix, i, j);
        maxRegion = Math.max(size, maxRegion);
      }
    }
    return maxRegion;
  }

  private static int getRegionSize(int[][] matrix, int row, int column) {

    if (row < 0 || row >= matrix.length || column < 0 || column >= matrix[row].length) {
      return 0;
    }

    if (matrix[row][column] == 0) {
      return 0;
    }

    matrix[row][column] = 0;
    int size = 1;
    for (int i = row - 1; i <= row + 1; i++) {
      for (int j = column - 1; j <= column + 1; j++) {
        if (i != row || j != column) {
          size += getRegionSize(matrix, i, j);
        }
      }
    }

    return size;
  }

  public static void main(String[] args) {
    int[][] matrix = {
      {0, 0, 0, 1, 1, 0, 0},
      {0, 1, 0, 0, 1, 1, 0},
      {1, 1, 0, 1, 0, 0, 1},
      {0, 0, 0, 0, 0, 1, 0},
      {1, 1, 0, 0, 0, 0, 0},
      {0, 0, 0, 1, 0, 0, 0}
    };

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println("Biggest Region Size: " + getBiggestRegion(matrix));

  }


}
