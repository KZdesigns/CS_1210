import java.util.Scanner;   
/**
   * Calculating square acres, yards, feet, inches based on user input.
   * Project_2 (SquareUnits)
   * @author Kyle Zimmerman - CS 1210
   * @version 8/23/2021
*/

public class SquareUnits {

 //Constants               
   static final int MAX_INPUT = 1000000000;
   static final int ACRES_DIVISOR = 6272640;
   static final int YARDS_DIVISOR = 1296;
   static final int FEET_DIVISOR = 144;


/**
   * Calculates the square outputs based on user input.
   * @param args Command line arguements -not used.
*/



   public static void main(String[] args) {
   
   //variables
      int userInput, maxAcres, inchesRemaining, maxYards, maxFeet, maxInches;
   
   //user input
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter the area in square inches: ");
      userInput = scan.nextInt();
      
   //if statement
      if (userInput > MAX_INPUT) {
         System.out.println("Limit of 1,000,000,000 square inches exceeded!");
         
      } else {
      
      //calculations
         maxAcres = userInput / ACRES_DIVISOR;
         inchesRemaining = userInput - (maxAcres * ACRES_DIVISOR);
      
         maxYards = inchesRemaining / YARDS_DIVISOR;
         inchesRemaining = inchesRemaining - (maxYards * YARDS_DIVISOR);
      
         maxFeet = inchesRemaining / FEET_DIVISOR;
         inchesRemaining = inchesRemaining - (maxFeet * FEET_DIVISOR);
      
         maxInches = inchesRemaining; //for readability
      
      //print statements
         System.out.println("Number of Units:");
         System.out.println("\tAcres: " + maxAcres);
         System.out.println("\tSquare Yards: " + maxYards);
         System.out.println("\tSquare Feet: " + maxFeet);
         System.out.println("\tSquare Inches: " + maxInches);
      
      }
   }

}