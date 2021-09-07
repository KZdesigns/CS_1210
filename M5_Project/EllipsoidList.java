import java.util.ArrayList;
import java.text.DecimalFormat;

/**
Creating EllipsoidList class.
Project 4
@author Kyle Zimmerman - CS 1210
@version 9/6/2021
*/

public class EllipsoidList {

   private String listName = "";
   private ArrayList<Ellipsoid> ellipsoidList = new ArrayList<Ellipsoid>();
   
   /**
   Constructor method used to create an instance of EllipsoidList.
   @param listNameIn a string the reps. the name of the list.
   @param ellipsoidListIn a generic ArrayList for storing ellipsoid objects.
   */
   public EllipsoidList(String listNameIn, 
      ArrayList<Ellipsoid> ellipsoidListIn) {
   
      listName = listNameIn;
      ellipsoidList = ellipsoidListIn;
   
   }
   
   /**
   Method for returning the list name.
   @return a string for the list name.
   */
   public String getName() {
      return listName;
   }
   
   /**
   Method counting the number of ellipsoid objects in the arraylist.
   @return an integer representing the size of the list.
   */
   public int numberOfEllipsoids() {
      if (ellipsoidList.size() <= 0) {
         return 0;
      } else {
         return ellipsoidList.size();
      }
   }
   
   /**
   Method to calculate the total volume of the list.
   @return volumeTracker a double variable that is the total volume.
   */
   public double totalVolume() {
      int index = 0;
      double volumeTracker = 0; 
      
      
      if (ellipsoidList.size() <= 0) {
         return 0;
      } else {
         while (index <= ellipsoidList.size() - 1) {
            Ellipsoid ellipsoid = ellipsoidList.get(index);
            volumeTracker += ellipsoid.volume();
            index++;
         }
      }
      
      return volumeTracker; 
   }
   
   /**
   Method to calculate the total surface area of the list.
   @return saTracker a double variable that is the total surface area.
   */
   public double totalSurfaceArea() {
      int index = 0;
      double saTracker = 0;
      
      if (ellipsoidList.size() <= 0) {
         return 0;
      } else {
         while (index <= ellipsoidList.size() - 1) {
            Ellipsoid ellipsoid = ellipsoidList.get(index);
            saTracker += ellipsoid.surfaceArea();
            index++;
         }
      }
   
      return saTracker; 
   }
   
   /**
   Method calculates the average volume of the list of objects.
   @return average a double representing the average volume of the list.
   */
   public double averageVolume() {
      int index = 0;
      double volumeTracker = 0; 
      double average = 0;
      
      if (ellipsoidList.size() <= 0) {
         return 0;
      } else {
         while (index <= ellipsoidList.size() - 1) {
            Ellipsoid ellipsoid = ellipsoidList.get(index);
            volumeTracker += ellipsoid.volume();
            index++;
         }
      }
      
      average = volumeTracker / ellipsoidList.size();
      return average;       
   }
   
   /**
   Method calculates the average surface area of the list of objects.
   @return average a double representing the average surface area of the list.
   */
   public double averageSurfaceArea() {
      int index = 0;
      double saTracker = 0;
      double average = 0;
      
      
      if (ellipsoidList.size() <= 0) {
         return 0;
      } else {
         while (index <= ellipsoidList.size() - 1) {
            Ellipsoid ellipsoid = ellipsoidList.get(index);
            saTracker += ellipsoid.surfaceArea();
            index++;
         }
      }
      
      average = saTracker / ellipsoidList.size();
      return average;
   
   }
    /**
    Method representing the object as a string.
    @return a string representation of the EllipsoidList object.
    */
   public String toString() {
      int index = 0;
      String output = "";
      
      while (index <= ellipsoidList.size() - 1) {
         Ellipsoid curEllip = ellipsoidList.get(index);
         output += curEllip + "\n\n";
         index++; 
      }
      output = listName + "\n\n" + output;
      return output;
   }
   
    /**
    Method that displays a summary of information about the EllipsoidList.
    @return a string representation of the EllipsoidList object.
    */
   public String summaryInfo() {
      String output = "";
      int index = 0;
      DecimalFormat df = new DecimalFormat("#,##0.0##");
      
      double totalVolume = 0;
      double totalSurfaceArea = 0;
      double volumeAverage = 0;
      double surfaceAreaAverage = 0;
      
      while (index <= ellipsoidList.size() - 1) {
         Ellipsoid el = ellipsoidList.get(index);
         totalVolume += el.volume();
         totalSurfaceArea += el.surfaceArea();
         index++;
      } 
      
      volumeAverage = totalVolume / ellipsoidList.size();
      surfaceAreaAverage = totalSurfaceArea / ellipsoidList.size();
      
      output = "----- Summary for Ellipsoid Test List -----\n"
         + "Number of Ellipsoid Objects: " + ellipsoidList.size()
         + "\nTotal Volume: " + df.format(totalVolume) + " cubic units\n"
         + "Total Surface Area: " 
            + df.format(totalSurfaceArea) + " square units\n"
         + "Average Volume: " + df.format(volumeAverage) + " cubic units\n"
         + "Average Surface Area: " 
            + df.format(surfaceAreaAverage) + " square units";
      
      return output;
   }
}