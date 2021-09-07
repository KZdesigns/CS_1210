/**
Creating NumberOperations class.
Activity 5
@author Kyle Zimmerman - CS 1210
@version 9/6/2021
*/
public class NumberOperations {

   private int number;
   
   /**
   Constructor method for creating an instance of a NumberOperations.
   @param numberIn an integer that is assigend to the number instance variable.
   */
   public NumberOperations(int numberIn) {
      
      number = numberIn;
   
   }
   
   /**
   Method for getting the value from the object.
   @return number an integer represting the number variable.
   */
   public int getValue() {
   
      return number;
   
   }
   
   /**
   Method of determining the odd numbers under the given number.
   @return output String which reps. the odd numbers under the given number.
   */
   public String oddsUnder() {
      String output = "";
      int i = 0;
      
      while (i < number) {
         if (i % 2 != 0) {
            output += i + "\t";
         }
       
         i++;
      }
      return output;
   
   }
   
   /**
   Method for showing numbers less then the given number that are powers of two.
   @return a string that shows the list of numbers. 
   */
   public String powersTwoUnder() {
      String output = "";
      int powers = 1;
      
      while (powers < number) {
         output += powers + "\t";
         powers = powers * 2;
      }
      return output;
   }
   
   /**
   Method to compare two numbers and see which is greater.
   @param compareNumber a number that is being compared.
   @return an integer indicating whether the number is greater.
   */
   public int isGreater(int compareNumber) {
   
      if (number > compareNumber) {
         return 1;
      } else if (number < compareNumber) {
         return -1;
      } else {
         return 0;
      }
   }
   
   /**
   Method used for printing the object as a string.
   @return number a string representing the number.
   */
   public String toString() {
   
      return number + "";
   
   }

}