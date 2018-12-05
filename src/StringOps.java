import java.util.Scanner;

/**
 * Compares two words to see if the are the same and in the same case.
 * 
 * @author wramanand
 *
 */
public class StringOps {

  /**
   * Stores the user inputed word.
   */
  private String word1;

  /**
   * Stores another user inputed word.
   */
  private String word2;

  /**
   * Runs the comparison of the two words using a variety of String methods.
   */
  public void strComp() {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);


    System.out.println("Please enter a random word: ");
    word1 = sc.nextLine();
    System.out.println("Please enter another random word: ");
    word2 = sc.nextLine();


    if (word1.equals(word2) && word1.compareTo(word2) == 0) {
      System.out.println("You entered the same word!");
    } else if (word1.equalsIgnoreCase(word2) || word1.compareTo(word2) == 0) {
      System.out
          .println("You entered the same word but their letters are not all in the same case!");
    } else {
      System.out.println("You did not enter the same word!");
    }
  }
}
