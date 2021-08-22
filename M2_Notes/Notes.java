import java.util.Scanner;


public class Notes {

   public static void main(String[] args) {
   /*
   
      int count = 0;
      
      int total = count++;
      
      // prints total which is equal to 0
      System.out.println(total);
      
    */
    
    /*
      int count = 0;
      
      int total = ++count;
      
      // prints total which is equal to 1
      System.out.println(total);
      
     */
     
      /*
      double change = 1.85;
      int money = (int) change;
      
      System.out.println(money);
      System.out.println(change);
      */
      
      String name;
      int age;
      int birth_year;
      final int CURRENT_YEAR = 2021;
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please type your name and age below:");
      name = scan.nextLine();
      age = scan.nextInt();
      
      
      birth_year = CURRENT_YEAR - age;
      
      
      System.out.println("Hi " + name + " were born in " + birth_year + ".");
      
      
      
      
      
      
      
      
      
   
   }


}