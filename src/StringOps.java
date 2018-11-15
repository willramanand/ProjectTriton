import java.util.Scanner;

public class StringOps {

  public void strComp() {
    Scanner sc = new Scanner(System.in);

    String word1;
    String word2;

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
