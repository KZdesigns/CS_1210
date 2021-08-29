import java.util.Scanner;
import java.text.DecimalFormat;


/**
Program for parsing ticket data.
Project_3 (Event)
@author Kyle Zimmerman - CS 1210
@version 8/28/2021
*/

public class Event {

   //Class Constants
   static final int MIN_CHARS = 26;
   
   /**
   Parses ticket input based on user input.
   @param args Command line arguements -not used.
   */

   public static void main(String[] args) {
   
      //variables
      String userInput, event, price, discount1, time, price1, 
         hour, min, date, month, day, year, section, 
         row, seat, discount, cost, prizeNumber;
      double cost1, p, d, random;
      
      //decimal formatter set up
      DecimalFormat priceFormat = new DecimalFormat("$#,##0.00");
      DecimalFormat discountFormat = new DecimalFormat("0%");
      DecimalFormat prizeFormat = new DecimalFormat("0000");
   
      //get input from user
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your event code: ");
      userInput = scan.nextLine();
      System.out.println();
      userInput = userInput.trim();
      
      //if statement to check user input
      if (userInput.length() < MIN_CHARS) {
         
         System.out.println("Invalid Event Code.");
         System.out.println("Event code must have at least 26 characters.");  
      
      } else {
      
         //parse user input using
         month = userInput.substring(0, 2);
         day = userInput.substring(2, 4);
         year = userInput.substring(4, 8);
         date = month + "/" + day + "/" + year;
         hour = userInput.substring(8, 10);
         min = userInput.substring(10, 12);
         time = hour + ":" + min;
         
         //formatting price and discount
         price = priceFormat.format((Double.parseDouble(
            userInput.substring(12, 17)) / 100));
         discount = discountFormat.format((Double.parseDouble(
            userInput.substring(17, 19)) / 100));
         
         //prepping price and discount for discounted cost
         price1 = price.replace('$', ' ');
         price1 = price1.trim();
         discount1 = discount.replace('%', ' ');
         discount1 = discount1.trim();
         
         //calculation for cost
         p = Double.parseDouble(price1);
         d = Double.parseDouble(discount1);
         d = d / 100;
         cost1 = p - (p * d);
         cost = priceFormat.format(cost1);
         
         section = userInput.substring(19, 21);
         row = userInput.substring(21, 23);
         seat = userInput.substring(23, 25);
         event = userInput.substring(25, userInput.length());
         
         //generating random number
         random = (Math.random() * 10000) + 1;
         prizeNumber = prizeFormat.format(random);
         
         //print statement
         System.out.println("Event: " + event + "   Date: " 
            + date + "   Time: " + time);  
         System.out.println("Section: " + section + "   Row: " 
            + row + "   Seat: " + seat);
         System.out.println("Price: " + price + "   Discount: " 
            + discount + "   Cost: " + cost);
         System.out.println("Prize Number: " + prizeNumber);
      }
      
   }

}

// Event: The Lion King   Date: 06/14/2021   Time: 19:30
// Section: 01   Row: 10   Seat: 12
// Price: $125.00   Discount: 15%   Cost: $106.25
// Prize Number: 3629