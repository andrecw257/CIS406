// Andre Walker CIS406 Phase 2: Calculations of Data //

package orderEntryPhase2;

import java.util.Scanner;

public class OrderEntryPhase2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter item number (alphanumeric): ");
		String itemNumber = input.nextLine();
		
		System.out.print("Enter item description (alphanumeric): ");
		String itemDescription = input.nextLine();
		
		System.out.print("Enter item price (decimal): ");
		double itemPrice = input.nextDouble();
		
		System.out.print("Enter quantity ordered (integer): ");
		int quantity = input.nextInt();
		
		double grossAmount = itemPrice * quantity;
		
		System.out.print("Enter tax percentage (decimal): ");
		double taxPercent = input.nextDouble();
		double taxAmount = grossAmount * (taxPercent / 100);
		
		System.out.print("Enter discount percentage (decimal): ");
		double discountPercent = input.nextDouble();
		double discountAmount = grossAmount * (discountPercent / 100);
		
		double netAmount = grossAmount + taxAmount - discountAmount;
		
		System.out.println("Item Number\tDescription\tPrice\t\tQty\tTax %\tTax Amt\t\tDisc %\tDisc Amt\tNet Amt");
		System.out.println(itemNumber + "\t\t" 
		+ itemDescription + "\t\t"
		+ itemPrice + "\t\t" 
		+ quantity + "\t" 
		+ taxPercent + "\t" 
		+ taxAmount + "\t\t" 
		+ discountPercent + "\t" 
		+ discountAmount + "\t\t" 
		+ netAmount);
		
		input.close();
	}

}
