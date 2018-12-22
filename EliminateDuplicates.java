// Term:   Summer 2017
// Name:   Andrew Fields
// Instructor: Dr. He
// Assignment#: 4 (Program #2)

import java.util.Scanner; //Imports Scanner from java.util package

public class EliminateDuplicates {
  public static void main (String[] args) {
    //Creates Scanner object for user to input string whether to run program
    Scanner input1 = new Scanner(System.in);
    System.out.println("Input array and output result array without duplicates? ");
    System.out.print("(Y = Yes; Type any other character to exit program): ");
    String s = input1.next();
    char runProgram = s.charAt(0);
    /*While loop (this allows for re-running the program with a different set of inputs in the same run depending 
    on the string Scanner object input...see while loop-continuation condition below)*/ 
    while (runProgram == 'y' || runProgram == 'Y') {
      System.out.println();
      //Creates array with size of 10 
      int [] numberArray = new int[10];
      
      //Creates another Scanner object for entering the numbers 
      Scanner input2 = new Scanner(System.in);
      
      //Loop to read in input numbers into created array
      System.out.print("Enter ten numbers (integers only): ");
      for (int i = 0; i < numberArray.length; i++) {
        numberArray[i] = input2.nextInt();
      }
      
      //Invokes eliminateDuplicates method
      int [] dedupedArray = eliminateDuplicates(numberArray);
      
      //Prints deduped array
      System.out.print("The distinct numbers are: ");
      for (int i = 0; i < dedupedArray.length; i++) {
        System.out.print(dedupedArray[i]+" "); 
      }
      System.out.println();
      System.out.println();
      //Requests if user would like to re-run the program and type a new array to dedupe
      System.out.println("Input another array and output result array without duplicates? ");
      System.out.print("(Y = Yes; Type any other character to exit program): ");
      //Takes new result of string scanner object to determine if to run the program again or exit
      String s2 = input1.next();
      runProgram = s2.charAt(0);
    }
  }
  
  //eliminateDuplicates method
  public static int [] eliminateDuplicates(int[] list) {
    //Creates temp array to store unique values
    int [] tempArray = new int[list.length];
    //Initializes dedupeArraySize counter variable
    int dedupeArraySize = 0;
    //Loop to step through each element in imported list array
    for (int i = 0; i < list.length; i++) {
      //Initialized duplicate test variable 
      boolean duplicate = false;
      //Loop for temp array to determine if unique value or duplicate
      for (int j = 0; j < list.length; j++) {
        //Condition if a duplicate value
        if (tempArray[j] == list[i]) {
          duplicate = true;
        }
      }
      //Adds element to temp array and increases size by 1 if is unique value
      if(!duplicate) {
        tempArray[dedupeArraySize++] = list[i];
      } 
    }
    //Creates deduped array from temp array values
    int [] dedupeArray = new int[dedupeArraySize];
    for (int i = 0; i < dedupeArraySize; i++) {
      dedupeArray[i] = tempArray[i];
    }
    
    return dedupeArray; 
  }    
}
