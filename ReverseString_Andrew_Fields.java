// Class:      CS 5040/W01
// Term:       Fall 2017
// Name:       Andrew Fields
// Professor:  Dr. Haddad
// Assignment: 4 Pt. 2

import java.util.Scanner;

public class ReverseString_Andrew_Fields {
  public static void main (String[] args) {
      
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String inputString = input.nextLine();
    System.out.println();
    System.out.println("Input string:    "+inputString);
    reverseString(inputString);
  }
  
  //reverseString method
  public static void reverseString(String input){
    Stack_Andrew_Fields newStack = new Stack_Andrew_Fields();//Creates a stack object
    String delimited = "[ ]+";
    String[] words = input.split(delimited);
    for(int i = 0; i < words.length; i++){
      newStack.pushMethod(words[i]);
    }
    System.out.print("Reversed String: ");
    while(newStack.isEmptyMethod() != true){
      System.out.print(newStack.topMethod() + " ");
      newStack.popMethod();
    }
  }
}
    