// Andre Walker, CIS406, Powers Table //

package powersTable;

import java.util.Scanner;

public class PowersTable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Squares and Cubes table\n");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter an integer: "); 
			int num = sc.nextInt();
			
			String table = "";
			
			table += "\nNumber\tSquared\tCubed\n";
			table += "======\t=======\t=====\n";
			
			for (int i = 1; i <= num; i++) {
				int square = i * i;
				int cube = i * i * i;
				
				table += i + "\t" + square + "\t" + cube + "\n";
			}
			
			System.out.println(table);
			
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
			System.out.println();
		}
		
		System.out.println("Bye!!");
		sc.close();
	}

}
