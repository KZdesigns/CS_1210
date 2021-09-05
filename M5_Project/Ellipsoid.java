import java.text.DecimalFormat;

public class Ellipsoid {

   //fields - instance variables
   private String label = "";
   private double a = 0;
   private double b = 0;
   private double c = 0;
   
   
   //constructor
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn) {
      setLabel(labelIn.trim());
      setA(aIn);
      setB(bIn);
      setC(cIn);
   }
   
   //methods
   public String getLabel() {
      return label;
   }
   
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
   
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
     
      return isSet;   
   }
   
   public double getA() {
      return a;
   }
    
   public boolean setA(double aIn) {
      boolean isSet = false;
      
      if (aIn > 0) {
         a = aIn;
         isSet = true;
      }
      
      return isSet; 
   }
   
   public double getB() {
      return b;
   }
   
   public boolean setB(double bIn) {
      boolean isSet = false;
      
      if (bIn > 0) {
         b = bIn;
         isSet = true;
      }
      
      return isSet; 
   }
   
   public double getC() {
      return c;
   }
   
   public boolean setC(double cIn) {
      boolean isSet = false;
      
      if (cIn > 0) {
         c = cIn;
         isSet = true;
      }
      
      return isSet; 
   }
   
   public double volume() {
      double v = (4 * Math.PI * a * b * c) / 3;
      return v;
   }
   
   public double surfaceArea() {
      double sf = 4 * Math.PI * Math.pow((Math.pow(a * b, 1.6) 
         + Math.pow(a * c, 1.6) + Math.pow(b * c, 1.6)) / 3, (1 / 1.6));
      return sf;
   }
   
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      String output = "Ellipsoid " + "\"" + label + "\"" + " with axes "
         + "a = " + a + ", b = " + b + ", c = " + c + " units has:\n"
         + "\t volume = " + df.format(volume()) + " cubic units\n"
         + "\t surface area = " + df.format(surfaceArea()) 
         + " sqaure units";     
      return output;
   }
}