import java.util.ArrayList;

/**
Temperatures class will hold a set of integer calues 
represenitng daily temperatures.
Activity 6
@author Kyle Zimmerman - CS 1210
@version 9/9/2021
*/

public class Temperatures {

   private ArrayList<Integer> temperatures = new ArrayList<Integer>();
   
   /**
   Constructor method used to make an instnace of temperatures.
   @param temperaturesIn a list of input temperatures.
   */
   public Temperatures(ArrayList<Integer> temperaturesIn) {
      
      temperatures = temperaturesIn;
      
   }
   
   /**
   Method returns the low temperature.
   @return low which represents the lowest int in the list.
   */
   public int getLowTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int low = temperatures.get(0);
      for (int i = 1; i < temperatures.size(); i++) {
         if (temperatures.get(i) < low) {
            low = temperatures.get(i);
         }
      }
      
      return low;
   }
   
   /**
   Method return the larget int from the list of temperatures.
   @return high an int representing the largest temp.
   */
   public int getHighTemp() {
      if (temperatures.isEmpty()) {
         return 0;
      }
      
      int high = temperatures.get(0);
      for (Integer temp : temperatures) {
         if (temp > high) {
            high = temp;
         }
      }
      
      return high;
   }
   
   /**
   Method the represent the object as a string.
   @return a string that shows the temp list and high and low values.
   */
   public String toString() {
      return "\tTemperatures: " + temperatures
         + "\n\tLow: " + getLowTemp()
         + "\n\tHigh: " + getHighTemp();
   }
   
   public int lowerMinimum(int lowIn) {
      return lowIn < getLowTemp() ? lowIn : getLowTemp();
   }
   
   public int higherMaximum(int highIn) {
      return highIn > getHighTemp() ? highIn : getHighTemp();
   }
   
   
   

}