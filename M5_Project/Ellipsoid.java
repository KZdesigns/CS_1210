import java.text.DecimalFormat;

/**
Creating Ellipsoid class.
Project 5
@author Kyle Zimmerman - CS 1210
@version 9/6/2021
*/


public class Ellipsoid {

   //fields - instance variables
   private String label = "";
   private double a = 0;
   private double b = 0;
   private double c = 0;
   
   
   /**
   Creates an instanace of an ellipsoid.
   @param labelIn input param that is assigned to label.
   @param aIn input param that is assigned to A axis.
   @param bIn input param that is assigned to B axis.
   @param cIn input param that is assigned to C axis.
   */
   public Ellipsoid(String labelIn, double aIn, double bIn, double cIn) {
      setLabel(labelIn);
      setA(aIn);
      setB(bIn);
      setC(cIn);
   }
   
   /**
   Method for getting the label.
   @return label string.
   */
   public String getLabel() {
      return label;
   }
   
   /**
   Method for setting the label.
   @param labelIn input param that is set to the label variable.
   @return isSet a boolean indicating that a the label has been set. 
   */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
   
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
     
      return isSet;   
   }
   
   /**
   Method for getting the A side.
   @return a side which is double representing the length.
   */
   public double getA() {
      return a;
   }
    
    /**
    Method for setting the a side.
    @param aIn which is a double that represents the a side
    @return isSet a boolean indicating whether the variable has been set.
    */
   public boolean setA(double aIn) {
      boolean isSet = false;
      
      if (aIn > 0) {
         a = aIn;
         isSet = true;
      }
      
      return isSet; 
   }
   
   /**
   Method for getting the b side.
   @return b a double indicating the length of side b.
   */
   public double getB() {
      return b;
   }
   
    /**
    Method for setting the b side.
    @param bIn which is a double that represents the b side
    @return isSet a boolean indicating whether the variable has been set.
    */
   public boolean setB(double bIn) {
      boolean isSet = false;
      
      if (bIn > 0) {
         b = bIn;
         isSet = true;
      }
      
      return isSet; 
   }
   
   /**
   Method for getting the C side.
   @return c a double indicating the length of side c.
   */
   public double getC() {
      return c;
   }
   
    /**
    Method for setting the c side.
    @param cIn which is a double that represents the c side
    @return isSet a boolean indicating whether the variable has been set.
    */
   public boolean setC(double cIn) {
      boolean isSet = false;
      
      if (cIn > 0) {
         c = cIn;
         isSet = true;
      }
      
      return isSet; 
   }
   
    /**
    Method for calculating the volume of the ellipsoid.
    @return v which stand the volume of the given ellipsoid.
    */
   public double volume() {
      double v = (4 * Math.PI * a * b * c) / 3;
      return v;
   }
   
   /**
   Method for calculating the surface area of the ellipsoid.
   @return sf which stand the surface area of the given ellipsoid.
   */
   public double surfaceArea() {
      double sf = 4 * Math.PI * Math.pow((Math.pow(a * b, 1.6) 
         + Math.pow(a * c, 1.6) + Math.pow(b * c, 1.6)) / 3, (1 / 1.6));
      return sf;
   }
   
   /**
   Method that is used to return the string description of this object.
   @return output represents the string of rep. of the ellipsoid object.
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0.0###");
      String output = "Ellipsoid " + "\"" + label + "\"" + " with axes "
         + "a = " + a + ", b = " + b + ", c = " + c + " units has:\n"
         + "\tvolume = " + df.format(volume()) + " cubic units\n"
         + "\tsurface area = " + df.format(surfaceArea()) 
         + " square units";     
      return output;
   }
}