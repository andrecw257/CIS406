// Andre Walker, CIS406, Grade Converter //

package gradeConverter;

import java.util.Scanner;

public class GradConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Letter Grade Converter");
		
		String choice = "y";
		
		while (choice.equalsIgnoreCase("y")) {
			
			System.out.print("Enter numerical grade: ");
			int grade = sc.nextInt();
			
			String letter;
			
			if (grade >= 90 && grade <= 100) {
				letter = "A";
			} else if (grade >= 80 && grade <= 89) {
				letter = "B";
			} else if (grade >= 70 && grade <= 79) { 
				letter = "C"; 
			} else if (grade >= 60 && grade <= 69) { 
				letter = "D";
			} else { 
				letter = "F"; 
			
			}
		
			System.out.println("Letter grade: " + letter);
		
			System.out.print("Continue? (y/n): ");
			choice = sc.next();
		}
	
		System.out.println("Bye!!");
		sc.close();
	}
}
