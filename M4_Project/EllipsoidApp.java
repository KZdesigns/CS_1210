import java.util.Scanner;

public class EllipsoidApp {
   static final String ERROR_MESSAGE = "Error: axis value must be positive.";

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
   
      System.out.println("Enter label and axes a, b, c for an ellipsoid.");
      System.out.print("\tlabel: ");
      String label = scan.nextLine();
      
      System.out.print("\ta: ");
      String a = scan.nextLine();
      double a1 = Double.parseDouble(a);
      if (a1 < 1) {
         System.out.println(ERROR_MESSAGE);
         return;
      }
      
      
      System.out.print("\tb: ");
      String b = scan.nextLine();
      double b1 = Double.parseDouble(b);
      if (b1 < 1) {
         System.out.println(ERROR_MESSAGE);
         return;
      }
     
      
      System.out.print("\tc: ");
      String c = scan.nextLine();
      double c1 = Double.parseDouble(c);
      if (c1 < 1) {
         System.out.println(ERROR_MESSAGE);
         return;
      }
     
      Ellipsoid ellip = new Ellipsoid(label, a1, b1, c1);
      System.out.print("\n" + ellip);
   }

}