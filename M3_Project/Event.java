import java.util.Scanner;
import java.text.DecimalFormat;

/**
Program for parsing ticket data.
Project_3 (Event)
@author Kyle Zimmerman - CS 1210
@version 8/28/2021
*/

public class Event {

   static final int MIN_LENGTH = 26;
   
   /**
   Parses ticket input based on user input.
   @param args Command line arguements -not used.
   */

   public static void main(String[] args) {
   
      //variables
      String event, month, day, year, date, hour, min, time, 
         section, row, seat, price, discount, cost, prize;           
      double priceNum, discountNum, costNum, prizeNum;
   
      //getting input from user
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your event code: ");
      String userInput = scan.nextLine().trim();
      System.out.println();
      
      //if statement
      if (userInput.length() < MIN_LENGTH) {
      
         System.out.println("Invalid Event Code.\n"
            + "Event code must have at least 26 characters.");
      
      } else {
         
         event = userInput.substring(25, userInput.length());
         month = userInput.substring(0, 2);
         day = userInput.substring(2, 4);
         year = userInput.substring(4, 8);
         date = month + "/" + day + "/" + year;
         hour = userInput.substring(8, 10);
         min = userInput.substring(10, 12);
         time = hour + ":" + min;
         section = userInput.substring(19, 21);
         row = userInput.substring(21, 23);
         seat = userInput.substring(23, 25);
         
         //setup formatters
         DecimalFormat dfPrice = new DecimalFormat("$#,##0.00");
         DecimalFormat dfDiscount = new DecimalFormat("0%");
         DecimalFormat dfPrize = new DecimalFormat("0000");
         
         //price
         price = userInput.substring(12, 17);
         priceNum = Double.parseDouble(price);
         priceNum = priceNum / 100;
         price = dfPrice.format(priceNum);
         
         //discount
         discount = userInput.substring(17, 19);
         discountNum = Double.parseDouble(discount);
         discountNum = discountNum / 100;
         discount = dfDiscount.format(discountNum);
         
         //cost
         costNum = priceNum - (priceNum * discountNum);
         cost = dfPrice.format(costNum);
         
         //prize number
         prizeNum = (Math.random() * 10000) + 1;
         prize = dfPrize.format(prizeNum);
         
         
         //print statements
         System.out.print("Event: " + event + "   Date: " 
            + date + "   Time: " + time + "\n"
            + "Section: " + section + "   Row: " 
            + row + "   Seat: " + seat + "\n"
            + "Price: " + price + "   Discount: " 
            + discount + "   Cost: " + cost + "\n"
            + "Prize Number: " + prize); 
      }
      
   }

}