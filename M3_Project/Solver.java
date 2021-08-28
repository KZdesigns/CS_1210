import java.util.Scanner;
import java.text.DecimalFormat;

/**
Program calculates the value of a given equation.
Project_3 (Solver)
@author Kyle Zimmerman - CS 1210
@version 8/28/2021
*/

public class Solver {

/**
Calculates the value of the a given equation based on user input.
@param args Command line arguements -not used.
*/

   public static void main(String[] args) {
      
      //setting up variables
      double x, numerator, denominator, result;
      String userInput, resultStr, formattedResult;
      int midPoint, left, right;
      DecimalFormat df = new DecimalFormat("#,##0.0####");
      
      //taking userinput
      System.out.print("Enter a value for x: ");
      Scanner scan = new Scanner(System.in);
      userInput = scan.nextLine();
      
      //setting the user input to a double
      x = Double.parseDouble(userInput);
      
      //calculation
      numerator = Math.sqrt(Math.abs((Math.pow(x, 4) * 11)
         + (Math.pow(x, 3) * 9) + (Math.pow(x, 2) * 7) + (5 * x) + 4));
      denominator = ((2 * x) + 4);
      result = numerator / denominator;
      
      //finding characters to left and right
      resultStr = Double.toString(result);
      midPoint = resultStr.indexOf(".");
      left = resultStr.substring(0, midPoint).length();
      right = resultStr.substring(midPoint + 1, resultStr.length()).length();
   
      //formatted result
      formattedResult = df.format(result);
   
      //printing statments
      System.out.println("Result: " + result);
      System.out.println("# of characters to left of decimal point: " + left);
      System.out.println("# of characters to right of decimal point: " + right);
      System.out.println("Formatted Result: " + formattedResult);
      
   }

}