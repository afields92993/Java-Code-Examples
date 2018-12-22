// Class:      CS 5040/W01
// Term:       Fall 2017
// Name:       Andrew Fields
// Professor:  Dr. Haddad
// Assignment: 5 Pt. 2(Radix Sort)

import java.util.Scanner;

public class RadixSort_Andrew_Fields {
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);
    int inputs[] = new int[6];
    System.out.println("Enter 6 random unsorted numbers:");
    for(int i=0; i < inputs.length; i++){
      inputs[i] = input.nextInt();
    }  
    System.out.print("Inputs array before sorting:");
    for (int i = 0; i < inputs.length; i++){
      if (i >= 0 && i < 1){
        System.out.print(" " +inputs[i]);
      }
      else if (i >= 1){
        System.out.print(", " + inputs[i]);
      }
    }
    System.out.print("\nInputs array after sorting:");
    inputs = radixSort(inputs);
    for (int i = 0; i < inputs.length; i++){
      if (i >= 0 && i < 1){
        System.out.print(" " +inputs[i]);
      }
      else if (i >= 1) {
        System.out.print(", " +inputs[i]);
      }
    }
  }
  //Radix sort method
  public static int[] radixSort(int[] inputsArray){
    Queue_Andrew_Fields[] objects = new Queue_Andrew_Fields[10];
    for (int queueDigit = 0; queueDigit < 10; queueDigit++){
      objects[queueDigit] = new Queue_Andrew_Fields();
    }
    int digitCount = getDigitCount(inputsArray);
    for (int i =1 ;i <= digitCount; i++){
      for (int item = 0; item < inputsArray.length; item++){
        int digit = ExtractDigit(inputsArray[item], i);
        objects[digit].enqueue(new Integer(inputsArray[item]));
      }
      int item = 0;
      for (int queueNum = 0; queueNum < 10; queueNum++){
        while (!objects[queueNum].isEmpty()){
          inputsArray[item] = ((Integer)objects[queueNum].dequeue()).intValue();
          item++;
        }
      }
    }
    return inputsArray;
  }
  
  //ExtractDigit method (get digit at a given position)
  public static int ExtractDigit(int num, int position){
    return ((int) ((num % (Math.pow(10,position))) / (Math.pow(10,position-1))));      
  }

  //GetDigitCount (Get the count in the maximum value)
  public static int getDigitCount(int[] A){
    int digitCount = 0;
    for (int i=0; i<=A.length-1; i++){ 
      int count = 0;
      int num = A[i];
      while (num != 0){ 
        num = num/10;
        count++;
      }
      if (count > digitCount){ 
        digitCount = count;
      }
    }
    return digitCount;
  }
}