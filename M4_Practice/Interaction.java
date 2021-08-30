public class Interaction {

   public static void main(String[] args) {
   
      Person p1 = new Person("Kyle", 27, 0);
      System.out.println(p1.getName());
      System.out.println(p1.getAge());
      System.out.println(p1.getGender());
      
      p1.birthday();
      
      System.out.println("Happy Birthday " + p1.getName() + "!");
      System.out.println("Your are now " + p1.getAge());
   }
}