
import java.util.Scanner;

public class Main {

  // construct list
  // get title & Author from user
  // save to list
  // display list

  public static void main(String[] args) {
    Book bookList = new Book();
    Menu menuList = new Menu();

    // user menu:
    // type + to add book to list,
    // type V to view list,
    // type A to sort by author,
    // type T to sort by Title

    String menuCommand = menuList.options();
    // bookList.runCommand(menuCommand);
    System.out.println(menuCommand); // **Prints the command the user entered. */

    if (menuCommand == "+") {
      // check:
      System.out.println("In the IF statement!");

      // Ask User for book/author
      String title = bookList.getBook();
      String author = bookList.getAuth();
      // add to hashList
      bookList.set(title, author);
    } else if (menuCommand == "V") {
      bookList.printList();
    } else if (menuCommand == "T") {
      System.out.println(bookList.keys());
    } else if (menuCommand == "A") {
      System.out.println(bookList.values());
    }

    // // add books to list
    // bookList.set("Harry Potter", "J.K. Rowling");
    // bookList.set("The Lion, The Witch, and The Wardrobe", "C.S. Lewis");
    // bookList.set("Alice in Wonderland", "Lewis Carroll");
    // bookList.set("The Hobbit", "J.R.R. Tolken");
    // bookList.set("Lord of the Rings", "J.R.R. Tolken");
    //
    // // print list of books
    // bookList.printList();
    // // sort list by book title
    // System.out.println(bookList.keys());
    // // sort list by author
    // System.out.println(bookList.values());
    //
    // ***********
    // String menuCommand = menuList.options();
    // bookList.runCommand(menuCommand);

    // search Book Title to find Author
    // System.out.println(bookList.get("Harry Potter"));
    // System.out.println(bookList.get("Tuesday"));

  }
}
