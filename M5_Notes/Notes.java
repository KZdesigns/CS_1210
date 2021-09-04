import java.text.DecimalFormat;

public class Notes {

   public static void main(String[] args) {
   
      /*
      char ch1 = '1';
      char ch2 = 'a';
      char ch3 = 'A';
     
      if (ch1 < ch2) {
         System.out.println(ch1 + " < " + ch2);
      } 
      
      if (ch1 < ch3) {
         System.out.println(ch1 + " < " + ch3);
      } 
      
      if (ch2 < ch3) {
         System.out.println(ch2 + " < " + ch3);
      } 
      
      if (ch3 < ch2) {
         System.out.println(ch3 + " < " + ch2);
      }
      */
      
      double x = 1.55 + 1.55;
      double y = 1.53 + 1.52;
       
      System.out.println("x: " + x);
      System.out.println("y: " + y);
     
      double talerance = 0.1;
      
      System.out.println("round x and y to the nearest whole number and see if they are equal?");
      System.out.println();
      if (x - y < talerance) {
         System.out.println("x and y are equal");
      } else {
         System.out.println("x and y are not eqaul");
      }
     
   
   }
}