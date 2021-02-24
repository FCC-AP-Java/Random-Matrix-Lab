import java.util.*;

public class RandomMatrix
{
  private int upperBound;
  private int[][] matrix;

  public RandomMatrix(int rows, int cols, int max)
  {
    matrix = new int[rows][cols];
    upperBound = max;

    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix[0].length; j++)
      {
        matrix[i][j] = (int)(Math.random() * upperBound);
      }
    }
  }

  public void print()
  {
    for (int[] row : matrix)
    {
      System.out.println(Arrays.toString(row));
    }
    System.out.println("");
  }

  public int getAmount(int given)
  {
    int counter = 0;
    for (int[] row : matrix)
    {
      for (int value : row)
      {
        if (value == given)
        {
          counter++;
        }
      }
    }
    return counter;
  }

  public int[] getRowTotals()
  {
    int[] rowTotals = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix[0].length; j++)
      {
        rowTotals[i] += matrix[i][j];
      }
    }
    return rowTotals;
  }

  public int[] getColumnTotals()
  {
    int[] columnTotals = new int[matrix[0].length];
    for (int i = 0; i < matrix.length; i++)
    {
      for (int j = 0; j < matrix[0].length; j++)
      {
        columnTotals[j] += matrix[i][j];
      }
    }
    return columnTotals;
  }

  public int getTotal()
  {
    int sum = 0;
    for (int[] row : matrix)
    {
      for (int value : row)
      {
        sum += value;
      }
    }
    return sum;
  }

  public boolean allValuesUnique()
  {
    ArrayList<Integer> convertedList = new ArrayList<Integer>();
    for (int[] row : matrix)
    {
      for (int value : row)
      {
        convertedList.add(value);
      }
    }
    Collections.sort(convertedList);
    for (int i = 1; i < convertedList.size(); i++)
    {
      if (convertedList.get(i) == convertedList.get(i - 1))
      {
        return false;
      }
    }
    return true;
  }
}