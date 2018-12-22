// Class:  CS 5000
// Term:   Summer 2017
// Name:   Andrew Fields
// Instructor: Dr. He
// Assignment#: 3 (Program #3)

public class Diamonds {
  public static void main (String[] args) {
    
    //Asterisk triangle nested loops (upper part of diamond)
    for (int x = 1; x < 9; x += 2) {
      for (int y = 9; y >= x; y -= 2) {
        System.out.print(" "); 
      }
      for (int z = 1; z <= x; z++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    //Inverted asterisk triangle nested loops (lower part of diamond)
    for (int x = 1; x <= 9; x += 2) {
      for (int y = 1; y <= x; y += 2) {
        System.out.print(" ");
      }
      for (int z = 9; z >= x; z--) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    //Lines to separate the shapes
    System.out.println();
    System.out.println();
    
    //Inverted asterisk triangle nested loops (upper part of hourglass)
    for (int x = 1; x < 9; x += 2) {
      for (int y = 1; y <= x; y += 2) {
        System.out.print(" ");
      }
      for (int z = 9; z >= x; z--) {
        System.out.print("*");
      }
      System.out.println();
    } 
    
    //Asterisk triangle nested loops (lower part of hourglass)
    for (int x = 1; x <= 9; x += 2) {
      for (int y = 9; y >= x; y -= 2) {
        System.out.print(" "); 
      }
      for (int z = 1; z <= x; z++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}