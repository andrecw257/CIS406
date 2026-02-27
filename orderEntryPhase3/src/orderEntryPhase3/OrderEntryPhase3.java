// Andre Walker, CIS406, OrderEntry3 //

package orderEntryPhase3;

import java.util.Scanner;

public class OrderEntryPhase3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String cont = "Y";
		
		int totalItems = 0; 
		double totalGross = 0; 
		double totalTax = 0; 
		double totalDisc = 0; 
		double totalNet = 0;
		
		while (!cont.equalsIgnoreCase("N")) {
			
			System.out.println("Enter item number:");
			String itemNum = input.nextLine();
			
			System.out.println("Enter item description:");
			String desc = input.nextLine();
			
			System.out.print("Enter item price: ");
			double price = Double.parseDouble(input.nextLine());
			
			System.out.print("Enter quantity ordered: ");
			int qty = Integer.parseInt(input.nextLine());
			
			double gross = price * qty;
			
			System.out.print("Enter tax percent: ");
			double taxPct = Double.parseDouble(input.nextLine());
			double taxAmt = gross * (taxPct / 100);
			
			System.out.print("Enter discount percent: ");
			double discPct = Double.parseDouble(input.nextLine());
			double discAmt = gross * (discPct / 100);
			
			double net = gross + taxAmt - discAmt;
			
			System.out.println("\nItem#\tDescription\tPrice\tQty\tTax%\tTaxAmt\tDisc%\tDiscAmt\tNet");
			System.out.printf("%s\t%s\t%.2f\t%d\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\n\n",
					itemNum, desc, price, qty, taxPct, taxAmt, discPct, discAmt, net);
			
			totalItems++;
			totalGross += gross;
			totalTax += taxAmt;
			totalDisc += discAmt;
			totalNet += net;
			
			System.out.print("Do you want to enter another item (Y/N)? ");
			cont = input.nextLine();
			System.out.println();
		}
		
		System.out.println("SUMMARY TOTALS");
		System.out.println("Items\tGross\tTax\tDiscount\tNet");
		System.out.printf("%d\t%.2f\t%.2f\t%.2f\t\t%.2f\n",
				totalItems, totalGross, totalTax, totalDisc, totalNet);
		
		input.close();
			
	}

}
