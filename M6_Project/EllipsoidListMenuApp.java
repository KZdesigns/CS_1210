import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
Program for creating the EllipsoidListMenuApp.
Project 6
@author Kyle Zimmerman - CS 1210
@version 9/10/2021
*/
public class EllipsoidListMenuApp {
      
   /**
   Driver class program for the Ellipsoid and EllipsoidList classes.
   @param args - Standard commandline arguments
   @throws FileNotFoundException when an incorrect file is provided.
   */
   public static void main(String[] args) throws FileNotFoundException {
      String initialListName = "** no list name assigned **";
      ArrayList<Ellipsoid> initialList = new ArrayList<Ellipsoid>();
      EllipsoidList test = new EllipsoidList(initialListName, initialList);
      
      System.out.println("Ellipsoid List System Menu");
      System.out.print("R - Read File and Create Ellipsoid List"
         + "\nP - Print Ellipsoid List"
         + "\nS - Print Summary"
         + "\nA - Add Ellipsoid"
         + "\nD - Delete Ellipsoid"
         + "\nF - Find Ellipsoid"
         + "\nE - Edit Ellipsoid"
         + "\nQ - Quit"
         + "\nEnter Code [R, S, A, D, F, E, or Q]:");
      Scanner userInput = new Scanner(System.in);
      char choice = userInput.nextLine().toUpperCase().charAt(0);
      
      switch (choice) {
         case 'R':
            System.out.print("File Name: ");
            String fileName = userInput.nextLine();
            test = test.readFile(fileName);
            System.out.println(test.summaryInfo());
            break;
      }
   }
}