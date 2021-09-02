import java.util.Scanner;

public class EllipsoidApp {
   static final String ERROR_MESSAGE = "Error: axis value must be positive.";

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
   
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      System.out.print("\tlabel: ");
      String label = scan.nextLine();
      
      System.out.print("\ta: ");
      String aIn = scan.nextLine();
      double a = Double.parseDouble(aIn);
      if (a < 1) {
         System.out.println(ERROR_MESSAGE);
         return;
      }
      
      
      System.out.print("\tb: ");
      String bIn = scan.nextLine();
      double b = Double.parseDouble(bIn);
      if (b < 1) {
         System.out.println(ERROR_MESSAGE);
         return;
      }
     
      
      System.out.print("\tc: ");
      String cIn = scan.nextLine();
      double c = Double.parseDouble(cIn);
      if (c < 1) {
         System.out.println(ERROR_MESSAGE);
         return;
      }
     
      Ellipsoid ellip = new Ellipsoid(label, a, b, c);
      System.out.print("\n" + ellip);
   }

}