// Term:   Summer 2017
// Name:   Andrew Fields
// Instructor: Dr. He
// Assignment#: 4 (Program #1)

import java.util.Scanner; //Imports Scanner from java.util package

public class LinearSearch2 {
  public static void main (String[] args) {
    //Creates Scanner object for user to input string whether to run program
    Scanner input1 = new Scanner(System.in);
    System.out.print("Run linear search on an array? ");
    System.out.print("(Y = Yes; Type any other character to exit program): ");
    String s = input1.next();
    char runProgram = s.charAt(0);
    /*While loop (this allows for re-running the program with a different set of inputs in the same run depending 
    on the string Scanner object input...see while loop-continuation condition below)*/ 
    while (runProgram == 'y' || runProgram == 'Y') {
      //Creates another Scanner object for entering the array size as integer
      Scanner input2 = new Scanner(System.in);
    
      //Scans in user input of array size
      System.out.print("Enter desired array size (integer only): ");
      int arraySize = input2.nextInt();
      
      //Creates array based on size input
      double [] numberArray = new double[arraySize];
      
      //Creates another Scanner object for entering the array numbers as doubles
      Scanner input3 = new Scanner(System.in);
      
      //Loop to read in input numbers into created array
      for (int i = 0; i < numberArray.length; i++) {
        System.out.print("Enter a number: ");
        numberArray[i] = input3.nextDouble();
      }
      
      //Creates another Scanner object for entering the key as a double
      Scanner input4 = new Scanner(System.in);
      
      //Scans in user desired target key 
      System.out.print("Enter desired target key: ");
      double arrayKey = input4.nextDouble();
      
      //Invokes linear search method
      int [] keyIndices = linearSearch(numberArray,arrayKey);
      
      //Prints keyIndices array
      System.out.print("The target key occurs at the following indices in the input array: ");
      for (int i = 0; i < keyIndices.length; i++) {
        //Ensures last index value in list doesn't have a comma after it (or if only one index return)
        if (i == keyIndices.length-1) {
          System.out.print(keyIndices[i]);
        }
        //Prints comma separated list when more than one index value
        else {
          System.out.print(keyIndices[i] + ", ");
        }
      }
      System.out.println();
      System.out.println();
      
      //Requests if user would like to re-run the program and type a new array size, values, and key
      System.out.print("Do another linear search on an array? ");
      System.out.print("(Y = Yes; Type any other character to exit program): ");
      //Takes new result of string scanner object to determine if to run the program again or exit
      String s2 = input1.next();
      runProgram = s2.charAt(0);
    }
  }
  
  //Revised linear search method
  public static int [] linearSearch(double[] list, double key) {
    int [] indices = new int[list.length];
    int n = 0;
    for (int i = 0; i < list.length; i++) {
      if (key == list[i]){
        indices[n++] = i;
      }
    }
    int [] resultKeyIndices = new int[n];
    for (int i = 0; i < n; i++) {
      resultKeyIndices[i] = indices[i];
    }
    return resultKeyIndices;
  }
}
