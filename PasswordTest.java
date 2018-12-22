// Class:  CS 5000
// Term:   Summer 2017
// Name:   Andrew Fields
// Instructor: Dr. He
// Assignment#: 3 (Program #2)

import java.util.Scanner; //Imports Scanner from java.util package

public class PasswordTest {
  public static void main(String[] args) {
    //Creates string Scanner object to determine whether to run program
    Scanner input1 = new Scanner(System.in);
    System.out.print("Enter a password? (Y = Yes; Type any other character to exit program): ");
    String s = input1.next();
    char runProgram = s.charAt(0);
    /*While loop (this allows for re-running the program with a different input in the same run depending 
    on the string Scanner object input...see while loop-continuation condition below)*/ 
    while (runProgram == 'y' || runProgram == 'Y') {
      //Creates the Scanner object to enter a password
      Scanner input2 = new Scanner(System.in);
    
      //Prompts user to enter a password and states requirements to be valid 
      System.out.println("Enter a valid password (at least 8 characters, at least one lower case letter, ");
      System.out.println("at least one upper case letter, at least one digit, and at least one character ");
      System.out.print("that is neither a letter nor a digit): ");
      String password = input2.nextLine();
      System.out.println();
      System.out.println();
    
      //Prints entered password
      System.out.println("Entered Password: "+password);
    
      //Tests for meeting password length requirement first
      if (password.length() < 8) {
        System.out.println("Verdict: "+"\t\t\t"+"Invalid");
      }
      else {
        //Initializes count variables for parsing requirements
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int digitCount = 0;
        int symbolCount = 0;
        int nullCount = 0;
        //For loop that parses entered password
        for (int counter = 0; counter < password.length(); counter++) {
          //Chooses character at counter (parser)
          char ch = password.charAt(counter);
          //Adds character to count of lower case characters (if conditional)
          if (Character.isLowerCase(ch)) {
            lowerCaseCount++;
          }
          //Adds character to count of upper case characters (if conditional)
          else if (Character.isUpperCase(ch)) {
            upperCaseCount++;
          }
          //Adds character to count of digits (if conditional)
          else if (Character.isDigit(ch)) {
            digitCount++;
          }
          //Adds character to count of characters that is neither a letter nor digit (if conditional) 
          else if (!(Character.isLetterOrDigit(ch))) {
            symbolCount++;
          }
          /*Null case count (placeholder for close of if-else statement since all previous 
          elses had specific requirements that needed to be spelled out)*/ 
          else {
            nullCount++;
          }
        }
        //If-Else to ensure password requirements meet and displays verdict 
        if(lowerCaseCount < 1 || upperCaseCount < 1 || digitCount < 1 || symbolCount < 1) {
          System.out.println("Verdict: "+"\t\t\t"+"Invalid");
        }
        else {
          System.out.println("Verdict: "+"\t\t\t"+"Valid");
        }
      }
      //Requests if user would like to re-run the program and type a new password to validate
      System.out.print("Enter another password? (Y = Yes; Type any other character to exit program): ");
      //Takes new result of string scanner object to determine if to run the program again or exit
      String s2 = input1.next();
      runProgram = s2.charAt(0);
    }
  }
}