import java.text.DecimalFormat;

public class Ellipsoid {

   //fields - instance variables
   private String label = "";
   private double a = 0;
   private double b = 0;
   private double c = 0;
   
   
   //constructor
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn) {
      setLabel(labelIn);
      setA(aIn);
      setB(bIn);
      setC(cIn);
   }
   
   //methods
   public String getLabel() {
      return label;
   }
   
   public void setLabel(String labelIn) {
      label = labelIn;  
   }
   
   public double getA() {
      return a;
   }
    
   public void setA(double aIn) {
      a = aIn; 
   }
   
   public double getB() {
      return b;
   }
   
   public void setB(double bIn) {
      b = bIn;
   }
   
   public double getC() {
      return c;
   }
   
   public void setC(double cIn) {
      c = cIn; 
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