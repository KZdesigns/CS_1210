/**
Creating UserInfo class.
Activity 2
@author Kyle Zimmerman - CS 1210
@version 8/31/2021
*/
public class UserInfoDriver {

/**
Creates two instance of the UserInfo class and calls it methods.
@param args Command line arguements -not used.
*/

   public static void main(String[] args) {
   
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);
      
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}