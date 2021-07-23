/*
This is a program which takes several inputs such as car loan amount, the loan length, interest rate and down payment to calculate the monthly payments of the loan repayment.
*/

public class CarLoan {
	public static void main(String[] args) {	
    int carLoan = 10000;
    int loanLength = 3;
   int interestRate = 5;
   int downPayment = 2000;

    if ((loanLength <= 0) || (interestRate <= 0)){
      System.out.println("Error! Please enter valid car loan");
    } else if (downPayment >= carLoan){
      System.out.println("Down payment is not less than car price");
    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = (monthlyBalance * interestRate) / 100;
      int monthlyPayments = monthlyBalance + interest;
      System.out.println(monthlyPayments);
    }
	}
}
