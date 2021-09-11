import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
Creating EllipsoidList class.
Project 6
@author Kyle Zimmerman - CS 1210
@version 9/10/2021
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
    @return output a string representation of the EllipsoidList object.
    */      
   public String summaryInfo() {
      DecimalFormat df = new DecimalFormat("#,##0.0##");
    
      String output = "----- Summary for Ellipsoid Test List -----\n"
         + "Number of Ellipsoid Objects: " + ellipsoidList.size()
         + "\nTotal Volume: " + df.format(totalVolume()) + " cubic units\n"
         + "Total Surface Area: " 
           + df.format(totalSurfaceArea()) + " square units\n"
         + "Average Volume: " + df.format(averageVolume()) + " cubic units\n"
         + "Average Surface Area: " 
           + df.format(averageSurfaceArea()) + " square units";
   
      return output;
   }
   
   /**
   Returns the ellipsoidList field.
   @return ArrayList field.
   */
   public ArrayList getList() {
      return ellipsoidList;
   }
   
   /**
   Reads in file name creating ellipsoid objects and 
   storing them in an Array list, and returning an EllipsoidList object.
   @param fileNameIn a string the reps a file name.
   @return an EllipsoidList object based on the information in the file.
   @throws FileNotFoundException when an incorrect file is provided.
   */
   public EllipsoidList readFile(String fileNameIn) 
      throws FileNotFoundException {
      
      Scanner scanFile = new Scanner(new File(fileNameIn));
      String ellipsoidListName = scanFile.nextLine();
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
      
      while (scanFile.hasNext()) {
         String label = scanFile.nextLine();
         String a = scanFile.nextLine();
         String b = scanFile.nextLine();
         String c = scanFile.nextLine();
         
         double a1 = Double.parseDouble(a);
         double b1 = Double.parseDouble(b);
         double c1 = Double.parseDouble(c);
          
         Ellipsoid e = new Ellipsoid(label, a1, b1, c1);
        
         myList.add(e);  
      }
      scanFile.close();
      
      EllipsoidList eList = new EllipsoidList(ellipsoidListName, myList);
      return eList;
   }
   
   /**
   Creates new ellipsoid object and adds to the ArrayList within
   the EllipsoidList Object.
   @param labelIn string reps the label of the ellipsoid
   @param aIn double reps A side.
   @param bIn double reps side B.
   @param cIn double reps side C.
   */
   public void addEllipsoid(String labelIn, double aIn, 
      double bIn, double cIn) {
      Ellipsoid newEllipsoid = new Ellipsoid(labelIn, aIn, bIn, cIn);
      ellipsoidList.add(newEllipsoid);
   }
   
   /**
   Takes in a string reps a label, and finds that 
   ellipsoid object in the list and returns it to the user.
   @param labelIn reps the string label to be searched.
   @return ellipsoid object represent byt the toString method.
   */
   public Ellipsoid findEllipsoid(String labelIn)  {
      
      for (Ellipsoid ellipsoid : ellipsoidList) {
         if (ellipsoid.getLabel().equalsIgnoreCase(labelIn)) {
            return ellipsoid;
         }
          
      }
      return null;
   }
   
   /**
   Deletes an ellipsoid object with that matches the label input.
   @param labelIn string reps the label of the ellipsoid to be deleted.
   @return the matching ellipsoid object or null.
   */
   public Ellipsoid deleteEllipsoid(String labelIn) {
         
      for (Ellipsoid ellipsoid : ellipsoidList) {
         int index = 0;
         if (ellipsoid.getLabel().equalsIgnoreCase(labelIn)) {
            ellipsoidList.remove(index);
            return ellipsoid;
         }
         index++; 
      }
      return null;
   }
   
   /**
   Edits the exsisting ellipsoid if found in the list.
   @param labelIn reps the label to match in the current list.
   @param aIn reps the a side.
   @param bIn reps the b side.
   @param cIn reps the c side.
   @return edited ellipsoid object or null if label not found.
   */
   public Ellipsoid editEllipsoid(String labelIn, double aIn,
       double bIn, double cIn) {
   
      for (Ellipsoid ellipsoid : ellipsoidList) {
         if (ellipsoid.getLabel().equalsIgnoreCase(labelIn)) {
            ellipsoid.setA(aIn);
            ellipsoid.setB(bIn);
            ellipsoid.setC(cIn);
            return ellipsoid;
         }
      }
      return null;
   }    
}