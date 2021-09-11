import java.util.ArrayList;
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
         + "\nQ - Quit");
      
      char choice = 'Q';
            
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         Scanner userInput = new Scanner(System.in);
         choice = userInput.nextLine().toUpperCase().charAt(0);
      
         switch (choice) {
            case 'R':
               System.out.print("\tFile Name: ");
               String fileName = userInput.nextLine();
               test = test.readFile(fileName);
               System.out.println("\tFile read in and"
                  + " Ellipsoid List created\n");
               break;
            case 'P':
               System.out.print(test);
               break;
            case 'S':
               System.out.print("\n" + test.summaryInfo() + "\n\n");
               break;
            case 'A':
               System.out.print("\tlabel: ");
               String newLabel = userInput.nextLine();
               System.out.print("\ta: ");
               String newA = userInput.nextLine();
               Double a1 = Double.parseDouble(newA);
               System.out.print("\tb: ");
               String newB = userInput.nextLine();
               Double b1 = Double.parseDouble(newB);
               System.out.print("\tc: ");
               String newC = userInput.nextLine();
               Double c1 = Double.parseDouble(newC);
               test.addEllipsoid(newLabel, a1, b1, c1);
               System.out.println("\t*** Ellipsoid added ***\n");
               break;
            case 'D':
               System.out.print("\tLabel: ");
               String label = userInput.nextLine();
               Ellipsoid deleted = test.deleteEllipsoid(label);
               if (deleted == null) {
                  System.out.print("\t\"" + label + "\"" + " not found\n\n");
               } else {
                  System.out.print("\t\"" + deleted.getLabel() 
                     + "\"" + " deleted\n\n");
               }
               break;
            case 'F':
               System.out.print("\tlabel: ");
               label = userInput.nextLine();
               Ellipsoid found = test.findEllipsoid(label);
               if (found == null) {
                  System.out.print("\t\"" + label + "\"" + " not found\n\n");
               } else {
                  System.out.print(found + "\n\n");
               }
               break;
            case 'E':
               System.out.print("\tlabel: ");
               label = userInput.nextLine();
               System.out.print("\ta: ");
               newA = userInput.nextLine();
               a1 = Double.parseDouble(newA);
               System.out.print("\tb: ");
               newB = userInput.nextLine();
               b1 = Double.parseDouble(newB);
               System.out.print("\tc: ");
               newC = userInput.nextLine();
               c1 = Double.parseDouble(newC);
               Ellipsoid edited = test.editEllipsoid(label, a1, b1, c1);
               if (edited == null) {
                  System.out.println("\t\"" + label + "\"" + " not found\n");
               } else {
                  System.out.println("\t\"" + edited.getLabel() 
                     + "\"" + " successfully edited\n");
               }
               break;
            case 'Q':
               break;
            default:
               System.out.println("*** invalid code ***");      
         }
      
      
      } while (choice != 'Q');
   }
}