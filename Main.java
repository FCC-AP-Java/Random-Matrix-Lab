import java.util.*;

class Main {
  public static void main(String[] args) 
  {
    RandomMatrix matrix1 = new RandomMatrix(5,2,25);

    System.out.println("Matrix of values:");
    matrix1.print();

    System.out.println("Count of given value: " + matrix1.getAmount(4) + "\n");

    System.out.println("Array of sums of rows: " + Arrays.toString(matrix1.getRowTotals()) + "\n");

    System.out.println("Array of sums of columns: " + Arrays.toString(matrix1.getColumnTotals()) + "\n");

    System.out.println("Total of all values: " + matrix1.getTotal() + "\n");

    System.out.println("Are all values unique?: " + matrix1.allValuesUnique());
  }
}