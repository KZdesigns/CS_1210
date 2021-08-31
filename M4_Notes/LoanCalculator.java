import java.util.Scanner;

public class LoanCalculator {

   public static void main(String[] args) {
   
      double loanAmount;
      String loanType;
      Loan loan;
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter c for customer loan or e " 
         + "for employee loan: ");
      loanType = input.nextLine().toLowerCase();
      
      if (loanType.charAt(0) == 'e') {
         loan = new Loan(Loan.EMPLOYEE_ACCOUNT);
      } else {
         loan = new Loan(Loan.CUSTOMER_ACCOUNT);
      }
   
      System.out.print("Enter the aount that you wold like to borrow: ");
      loanAmount = Double.parseDouble(input.nextLine());
      
      if (loan.borrow(loanAmount)) {
         System.out.println("\n" + loan);
      } else {
         System.out.println("*** Amount exceeds limit ***");
      }
   
   }

}