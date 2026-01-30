// Andre Walker CIS406  Travel Time Converter //

package travelTimeConverter;

import java.util.Scanner;

public class TravelTimeConverter {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to the Travel Time Calculator\n");
		System.out.print("Enter miles: ");
		double miles = s.nextDouble();
		System.out.print("Enter miles per hour: ");
		double mph = s.nextDouble();
		double time = miles / mph;
		int h = (int)time, m = (int)Math.round((time - h) * 60);
		System.out.println("\nEstimated travel time\n---------------------");		
		System.out.println("Hours: " + h + "\nMinutes: " + m + "\n\nBye!!");
		s.close();

	}

}
