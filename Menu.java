
import java.util.Scanner;

public class Menu {
  public String options() {

    // user menu:
    // type + to add book to list,
    // type V to view list,
    // type A to sort by author,
    // type T to sort by Title

    System.out.println("Main Menu ");
    System.out.println("Type + to add a new book");
    System.out.println("Type V to view list of books");
    System.out.println("Type T to sort list by book title");
    System.out.println("Type A to sort list by author");
    try (Scanner commandIn = new Scanner(System.in)) {
      String userCommand = commandIn.nextLine();
      return userCommand;
    }
  }

}
