// Term:   Summer 2017
// Name:   Andrew Fields
// Instructor: Dr. He
// Assignment#: 4 (Program #3)

import java.util.Scanner; //Imports Scanner from java.util package

public class SelectionSort2 {
  public static void main (String[] args) {
    //Creates Scanner object for user to input string whether to run program
    Scanner input1 = new Scanner(System.in);
    System.out.println("Input array, conduct modified selection sort, & output result array? ");
    System.out.print("(Y = Yes; Type any other character to exit program): ");
    String s = input1.next();
    char runProgram = s.charAt(0);
    /*While loop (this allows for re-running the program with a different set of inputs in the same run depending 
    on the string Scanner object input...see while loop-continuation condition below)*/ 
    while (runProgram == 'y' || runProgram == 'Y') {
      System.out.println();
      //Creates array with size of 10 
      double [] numberArray = new double[10];
      
      //Creates another Scanner object for entering the numbers 
      Scanner input2 = new Scanner(System.in);
      
      //Loop to read in input numbers into created array
      System.out.print("Enter ten numbers: ");
      for (int i = 0; i < numberArray.length; i++) {
        numberArray[i] = input2.nextDouble();
      }
      
      //Invokes modified selection sort method
      double [] sortedArray = modSelectionSort(numberArray);
      
      //Prints newly sorted array
      System.out.print("The sorted array is: ");
      for (int i = 0; i < sortedArray.length; i++) {
        System.out.print(sortedArray[i]+" "); 
      }
      
      System.out.println();
      System.out.println();
      //Requests if user would like to re-run the program and type a new array to dedupe
      System.out.println("Input another array and output result from modified selection sort? ");
      System.out.print("(Y = Yes; Type any other character to exit program): ");
      //Takes new result of string scanner object to determine if to run the program again or exit
      String s2 = input1.next();
      runProgram = s2.charAt(0);
    }
  }
  
  //Modified selection sort method
  public static double [] modSelectionSort(double [] list){
    for (int i = list.length - 1; i >= 0; i--) {
      //Find the maximum in the list 
      double currentMax = list[i];
      int currentMaxIndex = i;
      for (int j = i - 1; j >= 0; j--) {
        //Conditional that changes currentMax variable to new element if that element > currentMax
        if (currentMax < list[j]) {
          currentMax = list[j];
          currentMaxIndex = j;
        }
      }
      
      //Swap list[i] with list[currentMaxIndex] if necessary
      if (currentMaxIndex != i) {
        list[currentMaxIndex] = list[i];
        list[i] = currentMax;
      }
    }
    return list;
  }
}

    