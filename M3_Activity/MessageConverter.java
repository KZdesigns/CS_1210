import java.util.Scanner;

/**
* Taking in user input and calling various string methods.
* Activity_3
* @author Kyle Zimmerman - CS 1210
* @version 8/27/2021
*/

public class MessageConverter {

/**
     * Using the string class and its methods.
     * @param args Command line arguements -not used.
    */

   public static void main(String[] args) {
      
      //variable setup
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType;
      String result = "";
      
      //requesting input
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      
      //requesting output type
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last characters"
         + "\nEnter your choice: ");
         
      outputType = Integer.parseInt(userInput.nextLine());
      
      //set up if statement for actions
      if (outputType == 0) { // as is
         result = message;
      }
      else if (outputType == 1) { // trimmed
         result = message.trim();
      }
      else if (outputType == 2) { // lower case
         result = message.toLowerCase();
      }
      else if (outputType == 3) { // UPPER CASE
         result = message.toUpperCase();
      }
      else if (outputType == 4) { // vowels replaced
         result = message.replace('a', '_');
         result = result.replace('e', '_');
         result = result.replace('i', '_');
         result = result.replace('o', '_');
         result = result.replace('u', '_');
      }
      else if (outputType == 5) { // without first and last char
         result = message.substring(1, message.length() - 1);
      }
      else { // invalid input
         result = "Error: Invalid choice input.";
      }
      
      System.out.println("\n" + result);
   
   
   }

}

/* the reason why the 'A' does not get replaced when try
   the input "A message" is because in the if else statement
   for outputType 4 there is no statment to replace capital vowels
*/
