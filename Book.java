
import java.util.ArrayList;
import java.util.Scanner;

public class Book {
  private int size = 7;
  private Node[] dataMap;
  // public String task;
  // public int date;

  // constructor method
  // {
  // "key" = "title",
  // "value" = "author",
  // "next" = null
  // }
  class Node {
    String key;
    String value;
    Node next;

    Node(String key, String value) {
      this.key = key;
      this.value = value;
    }
  }

  public Book() {
    dataMap = new Node[size];

  }

  // Ask user for new Book
  public String getBook() {
    System.out.println("Book Title: ");
    Scanner scBook = new Scanner(System.in);
    String bookTitle = scBook.nextLine();
    return bookTitle;
  }

  public String getAuth() {
    System.out.println("Author: ");
    Scanner scAuth = new Scanner(System.in);
    String bookAuth = scAuth.nextLine();
    return bookAuth;
  }

  // print list of Books + Authors
  public void printList() {
    for (int i = 0; i < dataMap.length; i++) {
      System.out.println(i + ":");
      Node temp = dataMap[i];
      while (temp != null) {
        System.out.println('"' + temp.key + '"' + " —" + temp.value);
        temp = temp.next;
      }
    }
  }

  // Hash Method, private will only be used by other hash methods within the class
  // Assign and return KEY an index address
  private int hash(String key) {
    // return hash integer
    int hash = 0;
    // get key and put it into a char array
    char[] keyChars = key.toCharArray();
    for (int i = 0; i < keyChars.length; i++) {
      // use ascii char values to assign number
      int asciiValue = keyChars[i];
      hash = (hash + asciiValue * 23) % dataMap.length;
    }
    return hash;
  }

  // Set Book:Author (Key:Value)
  public void set(String key, String value) {
    int index = hash(key);
    Node newNode = new Node(key, value);
    if (dataMap[index] == null) {
      dataMap[index] = newNode;
    } else {
      Node temp = dataMap[index];
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  // Search for Author Get Value(Author) from input Book Title(key)
  public String get(String key) {
    int index = hash(key);
    Node temp = dataMap[index];
    while (temp != null) {
      if (temp.key == key)
        return temp.value;
      temp = temp.next;
    }
    return null;
  }

  // create list of all Book Titles(keys)
  public ArrayList keys() {
    ArrayList<String> allKeys = new ArrayList<>();
    for (int i = 0; i < dataMap.length; i++) {
      Node temp = dataMap[i];
      while (temp != null) {
        allKeys.add(temp.key);
        temp = temp.next;
      }
    }
    return allKeys;
  }

  // create list of all Authors(values)
  public ArrayList values() {
    ArrayList<String> allValues = new ArrayList<>();
    for (int i = 0; i < dataMap.length; i++) {
      Node temp = dataMap[i];
      while (temp != null) {
        allValues.add(temp.value);
        temp = temp.next;
      }
    }
    return allValues;
  }

}
