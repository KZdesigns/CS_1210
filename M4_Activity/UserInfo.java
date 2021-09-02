/**
Creating UserInfo class.
Activity 2
@author Kyle Zimmerman - CS 1210
@version 8/31/2021
*/

public class UserInfo {

   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   // constants
   private static final int OFFLINE = 0, ONLINE = 1;
   
   // contructor
   
  /**
  Creates an intance of the UserInfo Class.
  @param firstNameIn input param assigned to firstName instance variable.
  @param lastNameIn input param assigned to lastName instance variable.
  */
   
   public UserInfo(String firstNameIn, String lastNameIn) {
      
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   
   // methods
   /**
   Sets instance status to ONLINE.
   */
   public void logOn() {
   
      status = ONLINE;
   
   }
   /**
   Sets instance status to OFFLINE.
   */
   public void logOff() {
   
      status = OFFLINE;
   
   }
   /**
   Getter method for location.
   @return location string.
   */
   public String getLocation() {
   
      return location;
   
   }
   /**
   Getter method for age.
   @return age integer.
   */
   public int getAge() {
      
      return age;
   
   }
   /**
   Setter method for age instance variable.
   @param ageIn input integer to be set to instance age variable.
   @return boolean indicating whether the age has been set or not.
   */
   public boolean setAge(int ageIn) {
   
      boolean isSet = false;
      
      if (ageIn > 0) {
         
         age = ageIn;   
         isSet = true;
      }
      
      return isSet;
   }
   /**
   Setter method for location.
   @param locationIn sets the string to instance variable location.
   */
   public void setLocation(String locationIn) {
   
      location = locationIn;
   }
   /**
   Method for formatting output when instance is converted to a string.
   @return string that displays the different fields of the instanace object.
   */
   public String toString() {
   
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
      
         output += "Offline";
      
      } else {
      
         output += "Online";
      
      }
      
      return output;
   }
}