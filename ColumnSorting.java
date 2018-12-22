// Term:   Summer 2017
// Name:   Andrew Fields
// Instructor: Dr. He
// Assignment#: 4 (Program #4)

import java.util.Scanner; //Imports Scanner from java.util package

public class ColumnSorting {
  public static void main (String[] args) {
    //Creates Scanner object for user to input string whether to run program
    Scanner input1 = new Scanner(System.in);
    System.out.print("Run a column sort of a 3x3 matrix? ");
    System.out.print("(Y = Yes; Type any other character to exit program): ");
    String s = input1.next();
    char runProgram = s.charAt(0);
    /*While loop (this allows for re-running the program with a different set of inputs in the same run depending 
    on the string Scanner object input...see while loop-continuation condition below)*/ 
    while (runProgram == 'y' || runProgram == 'Y') {
      //Initializes a 3x3 matrix array
      double [][] matrix = new double[3][3];
      
      //Scans in user inputs for the 3x3 matrix 
      Scanner input2 = new Scanner(System.in);
      for (int i = 0; i < matrix.length; i++) {
        System.out.print("Please enter a 3 element row for a 3x3 matrix: ");
        for (int j = 0; j < matrix[i].length; j++) {
          matrix[i][j] = input2.nextDouble();
        }
      }
      System.out.println();
      
      //Prints original array
      System.out.print("The original array is : ");
      System.out.println();
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
          System.out.printf("%-7.4f", matrix[i][j]); 
        }
        System.out.printf("\n");
      }
      System.out.println();
      System.out.println();
      
      //Invokes sortColumns method on 3x3 matrix
      double [][] sortMatrix = sortColumns(matrix);
      
      //Prints newly sorted array
      System.out.print("The column-sorted array is : ");
      System.out.println();
      for (int i = 0; i < sortMatrix.length; i++) {
        for (int j = 0; j < sortMatrix[i].length; j++) {
          System.out.printf("%-7.4f", sortMatrix[i][j]); 
        }
        System.out.printf("\n");
      }

      
      System.out.println();
      System.out.println();
      
      //Requests if user would like to re-run the program and type a new 3x3 matrix to column sort
      System.out.println("Run another column sort on an input 3x3 matrix? ");
      System.out.print("(Y = Yes; Type any other character to exit program): ");
      
      //Takes new result of string scanner object to determine if to run the program again or exit
      String s2 = input1.next();
      runProgram = s2.charAt(0);
    }
  }
  
  //sortColumns method
  public static double [][] sortColumns(double[][] m) {
    
    //Creates array to copy input array into
    double [][] sortArray = new double [m.length][m[0].length];
    
    //Copies in input array to new array
    for (int i = 0; i < m.length; i++) {
      for (int j = 0; j < m[i].length; j++) {
        sortArray[i][j] = m[i][j];
      }
    }
    
    for (int j = 0; j < sortArray[0].length; j++) {
      for (int i = 0; i < sortArray.length - 1; i++) {
        //Initializes variables for storing current min value and index 
        double min = sortArray[i][j];
        int minIndex = i;
        
        //For loop to find the min in the column 
        for (int k = i + 1; k < sortArray.length; k++) {
          if (min > sortArray[k][j]) {
            min = sortArray[k][j];
            minIndex = k;
          }
        }
        
        //Conditional to swap min with current minIndex if necessary 
        if (minIndex != i) {
          sortArray[minIndex][j] = sortArray[i][j];
          sortArray[i][j] = min;
        }
      }
    }
    
    return sortArray;
  }
}