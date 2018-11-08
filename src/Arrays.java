import java.util.Random;

public class Arrays 
{
  public void arrayOps() 
  {
    arrayValues();
    twoDArray();
  }
  
  public void arrayValues() 
  {
    int[] arr = new int[5];
    
    System.out.print("Here is a randomly generated array of 5 integers: \n"); 
    
    // Generate random integers within the array
    for (int i = 0; i < arr.length; i++) 
    {
      Random r = new Random();
      arr[i] = r.nextInt(101);
      System.out.print(arr[i] + " ");
    }
    
    // Decide the smallest value within the array
    int small = arr[0];
    for (int k = 0; k < arr.length; k++ ) 
    {
      if (small > arr[k])
        small = arr[k];
    }
    
    // Decide the largest value within the array
    int large = arr[0];
    for (int j = 0; j < arr.length; j++)
    {
      if (large < arr[j])
        large = arr[j];
    }
    
    // Add the sum of the array
    int sum = 0;
    for (int m = 0; m < arr.length; m++) 
    {
      sum = sum + arr[m];
    }
    
    System.out.println("\nThe smallest value in this array is " + small);
    System.out.println("The largest value in this array is " + large);
    System.out.println("The sum of the values in the array is " + sum);
  }
  
  public void twoDArray() {
    int[][] twoDArr = new int[3][6];
    
    int row = twoDArr.length;
    int col = twoDArr[0].length;
    Random r = new Random();
    
    System.out.println("\nHere is a randomly generated 2D Array with " + row + " rows and " + col + " columns: ");
    
    for (int i = 0; i < row; i++) 
    {
      for (int j = 0; j < col; j++) 
      {
        twoDArr[i][j] = r.nextInt(101);
        System.out.print(twoDArr[i][j] + " ");
      }
      System.out.println();
    }
    
    int rowCord = 0;
    int colCord = 0;
    int large = twoDArr[0][0];
    for (int m = 0; m < row; m++) 
    {
      for (int n = 0; n < col; n++) 
      {
        if (large < twoDArr[m][n]) {
          large = twoDArr[m][n];
          rowCord = m + 1;
          colCord = n + 1;
        }
      }
    }
    
    System.out.println("\nThe largest value in the array is " + large);
    System.out.println("The cordinate for the row of this value is " + rowCord);
    System.out.println("The coordinate for the column of this value is " + colCord);
  }
}