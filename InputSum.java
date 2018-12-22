// Class:  CS 5000
// Term:   Summer 2017
// Name:   Andrew Fields
// Instructor: Dr. He
// Assignment#: 2 (Program #5)

import java.util.Scanner; //Imports Scanner from java.util package

public class InputSum {
  public static void main(String[] args) {
    //Creates string Scanner object to determine whether to run program
    Scanner input1 = new Scanner(System.in);
    System.out.print("Run sum program? (Y = Yes; Type any other character to exit program): ");
    String s = input1.next();
    char runSumProgram = s.charAt(0);
    /*While loop (this allows for re-running the program with a different set of inputs in the same run depending 
    on the string Scanner object input...see while loop-continuation condition below)*/ 
    while (runSumProgram == 'y' || runSumProgram == 'Y') {
      //Creates integer Scanner object and reads in initial integer
      Scanner input2 = new Scanner(System.in); 
      System.out.print("Enter a positive integer (the input ends and sum calculates if you put -1): ");
      int number = input2.nextInt();
      /*If statement at the beginning to ensure that the while loop sum only calculates if first input is a 
      positive integer*/
      if (number < 0) {
        System.out.println("Entered number: " + number);
        System.out.println("Invalid input");
      }
      else {
        //Declares string to house entered number list and initializes sum as the first positive integer entered 
        String num_list = number + ", ";
        int sum = number;
        //While loop with sentinel value of -1 to add numbers to sum 
        while (number != -1) {
          System.out.print("Enter a positive integer (the input ends and sum calculates if you put -1): ");
          number = input2.nextInt();
          //If statement adds number to sum if > 0
          if (number >= 0) {
            sum += number;
            num_list = num_list + number + ", ";
          }
          /*This else statement ensures negative inputs < -1 not included in sum and notifies of invalid input 
          before proceeding to requesting the next integer input*/
          else if (number < -1) {
            sum += 0;
            num_list = num_list + number + ", ";
            System.out.println("Invalid input");
          }
          //This else statement ensures the input of sentinel value -1 is not included in the sum output
          else {
            sum += 0;
            num_list = num_list + number + " ";
          }
        }//End of inner while loop
        //Prints ALL entered numbers from while loop and the sum given the conditions of the while loop 
        System.out.println("Entered numbers: " + num_list);
        System.out.println("The Sum: " + sum);   
      }//End outer else statement
       //Requests if user would like to re-run the program using new inputs
      System.out.print("Run sum program again? (Y = Yes; Type any other character to exit program): ");
      //Takes new result of string scanner object to determine if to run the program again or exit
      String s2 = input1.next();
      runSumProgram = s2.charAt(0);
    } //End outer while loop 
  }
}      