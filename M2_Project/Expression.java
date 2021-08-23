import java.util.Scanner;

/**
    * Simple program to print a result of a calculation.
    * Project_2(Expression)
    * @author Kyle Zimmerman - CS 1210
    * @version 8/23/2021
    */

public class Expression {

/**
     * Prints the result of the calculation and takes in user input.
     * @param args Command line arguments –not used.
     */

   public static void main(String[] args) {
   
      Scanner scan = new Scanner(System.in);
      double x, y, result;
        
      System.out.println("result = (10x + 32.6) (5y - 1.567) / xy");
      System.out.print("\tx = ");
      x = scan.nextDouble();
      System.out.print("\ty = ");
      y = scan.nextDouble();
        
      if (x * y == 0) {
        
         System.out.println("result is \"undefined\"");
         
      } else {
         
         result = ((10 * x) + 32.6) * ((5 * y) - 1.567) / (x * y);
         System.out.println("result = " + result);
        
      }
   
   }

}