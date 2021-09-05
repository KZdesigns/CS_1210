import java.util.ArrayList;
import java.text.DecimalFormat;

public class EllipsoidList {

   private String listName = "";
   private ArrayList<Ellipsoid> ellipsoidList = new ArrayList<Ellipsoid>();
   
   public EllipsoidList(String listNameIn, ArrayList<Ellipsoid> ellipsoidListIn) {
   
      listName = listNameIn;
      ellipsoidList = ellipsoidListIn;
   
   }
   
   public String getName() {
      return listName;
   }
   
   public int numberOfEllipsoids() {
      if (ellipsoidList.size() <= 0) {
         return 0;
      } else {
         return ellipsoidList.size();
      }
   }
   
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
   
   public double totalSurfaceArea() {
      int index = 0;
      double saTracker = 0;
      
      if (ellipsoidList.size() <= 0) {
         return 0;
      } else {
         while(index <= ellipsoidList.size() - 1) {
            Ellipsoid ellipsoid = ellipsoidList.get(index);
            saTracker += ellipsoid.surfaceArea();
            index++;
         }
      }
   
      return saTracker; 
   }
   
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
   
   public double averageSurfaceArea() {
      int index = 0;
      double saTracker = 0;
      double average = 0;
      
      
      if (ellipsoidList.size() <= 0) {
         return 0;
      } else {
         while(index <= ellipsoidList.size() - 1) {
            Ellipsoid ellipsoid = ellipsoidList.get(index);
            saTracker += ellipsoid.surfaceArea();
            index++;
         }
      }
      
      average = saTracker / ellipsoidList.size();
      return average;
   
   }
   
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
         + "Total Surface Area: " + df.format(totalSurfaceArea) + " square units\n"
         + "Average Volume: " + df.format(volumeAverage) + " cubic units\n"
         + "Average Surface Area: " + df.format(surfaceAreaAverage) + " square units";
      
      return output;
   }
}

/**
  Ellipsoid ex1 = new Ellipsoid("ex1", 1,2,3);
 Ellipsoid ex2 = new Ellipsoid("ex2", 2.3,5.5,7.4);
 Ellipsoid ex3 = new Ellipsoid("ex3", 123.4,234.5,345.6);
 ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
 myList.add(ex1);
 myList.add(ex2);
 myList.add(ex3);
 EllipsoidList testList = new EllipsoidList("TEST", myList);
 testList
 
 */