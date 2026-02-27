// Andre Walker CIS406 Interest Rate Calculator //

package interestRateCalculatorPart1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class InterestRateCalculatorPart1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat money = new DecimalFormat("$###,###.00");
		DecimalFormat percent = new DecimalFormat("0.##");
		
		System.out.println("Welcome to the Interest Calculator");
		
		char cont = 'y';
		
		while (cont == 'y' || cont == 'Y') {
			
			System.out.print("Enter loan amount: ");
			double loanAmount = input.nextDouble();
			
			System.out.print("Enter interest rate: ");
			double rate = input.nextDouble();
			
			double interest = calculateInterest(loanAmount, rate / 100);
			
			System.out.println();
			System.out.println("Loan amount: " + money.format(loanAmount));
			System.out.println("Interest rate: " + percent.format(rate) + "%");
			System.out.println("Interest: " + money.format(interest));
			System.out.println();
			
			System.out.print("Continue? (y/n): ");
			cont = input.next().charAt(0);
			System.out.println();
		}
		
		System.out.println("Bye!!!");
	}
	
	public static double calculateInterest(double loan, double rate) {
		return loan * rate;
	}

}
