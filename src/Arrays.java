import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Arrays {

  ArrayList<String> list = new ArrayList<String>();

  public void arrayOps() {
    arrayValues();
    twoDArray();
    arrayList();
  }

  public void arrayValues() {
    int[] arr = new int[5];

    System.out.print("Here is a randomly generated array of 5 integers: \n");

    // Generate random integers within the array
    for (int i = 0; i < arr.length; i++) {
      Random r = new Random();
      arr[i] = r.nextInt(101);
      System.out.print(arr[i] + " ");
    }

    // Decide the smallest value within the array
    // Enhanced for loop
    int small = arr[0];
    for (int element: arr) {
      if (element == 1) {
    	  continue; // use of continue to just move on to next part if first element is 1
      } else if (small > element) {
        small = element;
      }
    }

    // Decide the largest value within the array
    int large = arr[0];
    for (int j = 0; j < arr.length; j++) {
      if (large < arr[j])
        large = arr[j];
    }

    // Add the sum of the array
    int sum = 0;
    for (int m = 0; m < arr.length; m++) {
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

    System.out.println(
        "\nHere is a randomly generated 2D Array with " + row + " rows and " + col + " columns: ");

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        twoDArr[i][j] = r.nextInt(101);
        System.out.print(twoDArr[i][j] + " ");
      }
      System.out.println();
    }

    int rowCord = 0;
    int colCord = 0;
    int indexRow = 0;
    int indexCol = 0;
    int large = twoDArr[0][0];
    for (int m = 0; m < row; m++) {
      for (int n = 0; n < col; n++) {
        if (large < twoDArr[m][n]) {
          large = twoDArr[m][n];
          rowCord = m + 1;
          colCord = n + 1;
          indexRow = m;
          indexCol = n;
        }
      }
    }

    System.out.println("\nThe largest value in the array is " + large);
    System.out.println("The cordinate for the row of this value is " + rowCord);
    System.out.println("The coordinate for the column of this value is " + colCord);
    System.out.println("The index of this value is " + indexRow + ", " + indexCol);
  }

  public void arrayList() {
    int selection = 0;
    Scanner sc = new Scanner(System.in);

    while (selection != 3) {
      int position = 0;
      String name = "";

      System.out.println("\n\nHere is the current name list: " + list);

      System.out.println("\n----List Options----" 
          + "\n1. Add a name to list"
          + "\n2. Remove a name from list" 
          + "\n3. Return to Main Menu");

      System.out.println("Please enter a selection: ");
      try {
    	  selection = sc.nextInt();
      } catch (Exception e) {
    	  sc.next();
      }

      switch (selection) {
        case 1:
	        try {
	          System.out.println("What position would you like it to be added to?");
	          position = sc.nextInt() - 1;
	          sc.nextLine();
	          System.out.println("What name would you like to add?");
	          name = sc.nextLine();
	          list.add(position, name);
	        }
	        catch (Exception e) {
	        	System.out.println("Input not valid!\n" + "Returning to List Options...");
	        	sc.next();
	        }
          break;
        case 2:
        	try {
	          System.out.println("What position in the list would you like to remove?");
	          position = sc.nextInt() - 1;
	          list.remove(position);
        	}
        	catch (Exception e) {
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
