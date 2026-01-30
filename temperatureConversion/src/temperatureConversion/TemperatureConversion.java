// Andre Walker CIS406 TemperatureConversion //


package temperatureConversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Welcome to the Temperature Converter\n");
		
		
		System.out.print("Enter degrees in Fahrenheit: ");
		double f = s.nextDouble();
		System.out.println("Degrees in Celsius: " + ((f - 32) * 5 / 9) + "\n");
		
		
		System.out.print("\nEnter degrees in Celsius: ");
		double c = s.nextDouble();
		System.out.println("Degrees in Fahrenheit: " + (c * 9 / 5 + 32) + "\n");
		
		System.out.println("\nBye!!");
		s.close();
	}

}
