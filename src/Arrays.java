import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * This class contains a many of the basic array functions contained within Java.
 * 
 * @author wramanand
 *
 */
public class Arrays {

  /**
   * Runs all methods within Array class.
   */
  public void arrayOps() {
    arrayValues();
    twoDArray();
    arrayList();
  }

  /**
   * Demonstrates how to find largest, smallest, and sum of values.
   */
  public void arrayValues() {
    int[] arr = new int[5];


    System.out.print("Here is a randomly generated array of 5 integers: \n");

    // Generate random integers within the array
    for (int i = 0; i < arr.length; i++) {
      Random r = new Random();
      arr[i] = r.nextInt(101);
      System.out.print(arr[i] + " ");
    }

    /**
     * Stores the smallest value of an array.
     */
    int small;

    // Decide the smallest value within the array
    // Enhanced for loop
    small = arr[0];
    for (int element : arr) {
      if (element == 0) {
        break; // use of continue to just move on to next part if element is 0
      } else if (small > element) {
        small = element;
      }
    }

    /**
     * Stores the largest value of an array.
     */
    int large;

    // Decide the largest value within the array
    large = arr[0];
    for (int j = 0; j < arr.length; j++) {
      if (large < arr[j]) {
        large = arr[j];
      }
    }

    /**
     * Stores the sum of the values of an array.
     */
    int sum;

    // Add the sum of the array
    sum = 0;
    for (int m = 0; m < arr.length; m++) {
      sum = sum + arr[m];
    }
    /**
     * Stores if the values was found within array.
     */
    boolean found;

    /**
     * Stores the index of the found value.
     */
    int index;

    found = false;
    index = 0;

    while (found == false && arr.length > index) { // Loop to find index of value 42
      if (arr[index] == 42) {
        found = true;
      } else {
        index = index + 1;
      }
    }

    if (found) {
      System.out.println("The value 42 is located at index " + index);
    } else {
      System.out.println("The value 42 was not found within the array!");
    }
    System.out.println("\nThe smallest value in this array is " + small);
    System.out.println("The largest value in this array is " + large);
    System.out.println("The sum of the values in the array is " + sum);
  }

  /**
   * Creates a 2D array the finds largest value and its coordinates within the Array.
   */
  public void twoDArray() {
    int[][] twoDArr = new int[3][6];

    /**
     * Stores the value of length of the row for the 2D array.
     */
    int row;

    /**
     * Stores the value of length of the column for the 2D array.
     * 
     */
    int col;

    row = twoDArr.length;
    col = twoDArr[0].length;
    Random r = new Random();

    /**
     * Stores the largest value with in a 2D array.
     */
    int twodLarge;

    System.out.println(
        "\nHere is a randomly generated 2D Array with " + row + " rows and " + col + " columns: ");

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        twoDArr[i][j] = r.nextInt(101);
        System.out.print(twoDArr[i][j] + " ");
      }
      System.out.println();
    }

    /**
     * Stores the coordinate of the value the row of value within twoDArr.
     */
    int rowCord = 0;

    /**
     * Stores the coordinate for column of value within twoDArr.
     */
    int colCord = 0;

    twodLarge = twoDArr[0][0];
    for (int m = 0; m < row; m++) {
      for (int n = 0; n < col; n++) {
        if (twodLarge < twoDArr[m][n]) {
          twodLarge = twoDArr[m][n];
          rowCord = m;
          colCord = n;
        }
      }
    }

    System.out.println("\nThe largest value in the array is " + twodLarge);
    System.out.println("The index for the row of this value is " + rowCord);
    System.out.println("The index for the column of this value is " + colCord);
  }

  /**
   * This method runs many functions within array list including add and remove.
   */
  public void arrayList() {
    ArrayList<String> list = new ArrayList<String>();
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);

    /**
     * Stores which value in menu user selected. Defaults to 0.
     */
    int selection = 0;

    while (selection != 3) {

      System.out.println("\n\nHere is the current name list: " + list);

      System.out.println("\n----List Options----" + "\n1. Add a name to list"
          + "\n2. Remove a name from list" + "\n3. Return to Main Menu");

      System.out.println("Please enter a selection: ");
      try {
        selection = sc.nextInt();
      } catch (Exception ex) {
        sc.next();
      }

      /**
       * Stores value for position user is trying to edit within ArrayList.
       */
      int position = 0;

      /**
       * Stores value for name user is trying to add to ArrayList.
       */
      String name = "";

      switch (selection) {
        case 1:
          try {
            System.out.println("What position would you like it to be added to?");
            position = sc.nextInt() - 1;
            sc.nextLine();
            System.out.println("What name would you like to add?");
            name = sc.nextLine();
            list.add(position, name);
          } catch (Exception ex) {
            System.out.println("Input not valid!\n" + "Returning to List Options...");
            sc.next();
          }
          break;
        case 2:
          try {
            System.out.println("What position in the list would you like to remove?");
            position = sc.nextInt() - 1;
            list.remove(position);
          } catch (Exception ex) {
            System.out.println("Input not valid!\n" + "Returning to List Options...");
            sc.next();
          }
          break;
        case 3:
          System.out.println("\n\nReturning to main menu.....");
          break;
        default:
          System.out.println("That is not valid!");
          break;
      }
    }
  }
}
