// Term:   Summer 2017
// Name:   Andrew Fields
// Instructor: Dr. He
// Assignment#: 3 (Program #5)

public class CrapsGame {
  public static void main (String[] args) {
    //Initializes roll variables by calling the rollDie() method twice and sums the rolls
    int first_roll = rollDie();
    int second_roll = rollDie();
    int sum_rolls = first_roll+second_roll;
    //Prints the results of the rolls 
    System.out.println("You rolled "+first_roll+" + "+second_roll+" = "+sum_rolls);
    //Conditional for winning on the first rolls (natural)
    if (sum_rolls == 7 || sum_rolls == 11) {
      System.out.println("You win");
    }
    //Conditional for losing on the first rolls (craps)
    else if (sum_rolls == 2 || sum_rolls == 3 || sum_rolls == 12) {
      System.out.println("You lose");
    }
    //Conditional if neither win nor lose on the first rolls (point established)
    else {
      //Establish and print the point 
      System.out.println("point is "+sum_rolls);
      //Initialize next roll variables
      int next_first_roll = 0;
      int next_second_roll = 0;
      int next_sum_rolls = 0;
      //Loop conditional for continuing rolling until next roll sum is 7 or matches the point
      while (next_sum_rolls != 7 && next_sum_rolls != sum_rolls) {
        next_first_roll = rollDie();
        next_second_roll = rollDie();
        next_sum_rolls = next_first_roll + next_second_roll;
        System.out.println("You rolled "+next_first_roll+" + "+next_second_roll+" = "+next_sum_rolls);
      }
      //Conditional if the next roll sum eventually reaches a 7 first (lose)
      if (next_sum_rolls == 7) {
        System.out.println("You lose");
        sum_rolls = 0;
      }
      //Conditional if the next roll sum eventually reaches the point first (win)
      else {
        System.out.println("You win");
        sum_rolls = 0;
      }
    }
  }
  
  //Method that generates and returns a random integer between 1 and 6 
  public static int rollDie () {
    return (int)(1 + Math.random() * 6);
  }
} 