import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
Program for creating the EllipsoidLisApp.
Project 4
@author Kyle Zimmerman - CS 1210
@version 9/6/2021
*/
public class EllipsoidListApp {
   
   /**
   Read in data from a file and creates and stores Ellipsoid Objects.
   @param args - Standard commandline arguments
   @throws FileNotFoundException when an incorrect file is provided.
   */
   public static void main(String[] args) 
      throws FileNotFoundException {
   
      ArrayList<Ellipsoid> myList = new ArrayList<Ellipsoid>();
       
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = scan.nextLine();
      
      Scanner scanFile = new Scanner(new File(fileName)).useDelimiter("\n");
      String ellipsoidListName = scanFile.nextLine();
      
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
      System.out.println("\n" + ellipsoidListName);
      
      int index = 0;
      
      while (index <= myList.size() - 1) {
         Ellipsoid myEllipsoid = myList.get(index);
         System.out.println("\n" + myEllipsoid);
         index++;
      }
     
      System.out.println("\n\n" + eList.summaryInfo()); 
   }
}