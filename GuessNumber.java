// Class:  CS 5000
// Term:   Summer 2017
// Name:   Andrew Fields
// Instructor: Dr. He
// Assignment#: 2 (Program #4)

import java.util.Scanner; //Imports Scanner from java.util package

public class GuessNumber {
  public static void main(String[] args) {
    //Generates a random number between 1 (a) and 100 (a+b), excluding 100 (a+b)
    int number = (int)(1 + Math.random() * 99);
  
    //Creates the Scanner object
    Scanner input = new Scanner(System.in);
    
    //Game Intro Statement
    System.out.println("Welcome to the game of Guess It!");
    System.out.println("I will choose a number between 1 and 100.");
    System.out.println("You will try to guess that number. If you guess wrong, I will tell you if");
    System.out.println("you guessed too high or too low.");
    System.out.println("You have 6 tries to get the number."+"\n");
    System.out.print("OK, I am thinking of a number. Try to guess it. ");
    
    //Loop for guessing game
    int num_tries = 0;
    int guess = 0;
    do{
      num_tries++;
      System.out.print("Your guess? ");
      guess = input.nextInt();
      
      //If-Statements to determine if too high/too low/invalid input
      if (guess >= 1 && guess <= 100) {
        if (guess == number)
          System.out.println("**** CORRECT ****");
        else if (guess > number)
          System.out.println("Too high!");
        else
          System.out.println("Too low!");
      }
      else {
        System.out.println("Illegal guess. Your guess must be between 1 and 100.");
      } //End if-statement
    } while (guess != number && num_tries < 6);
    System.out.println("\n"+"You have either reached your max number of tries or guessed the number correctly already.");
    System.out.println("Therefore, the game is ending.");
    System.out.println("Good bye, it was fun. Play again soon.");
  }
}
     