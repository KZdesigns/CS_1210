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
      
      /*
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
      */
      
      /*
      int total, num1, num2;
      
      num1 = 13;
      num2 = 12;
      
      total = num1 % num2;
      System.out.println(total);
      */
      String name;
      
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter your name: ");
      name = scan.nextLine();
      
      System.out.println("Hello " + name + "!");
    
   }


}