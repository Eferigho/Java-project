/* This program calculates the total amount of Gas consumed by Vehicles on miles covered.
 * This program is design for drivers traveling from one location to another.
 * This is the main class of the program.  
 */
import java.util.Scanner;
public class Mileage {

	public static void main(String[] args) {
		int totalMiles = 0;
		int totalGallons = 0;
		double averageTotalGallons = 0;

		int tripCount = 0;
		while(tripCount != -1) {
			GasMileage gm = new GasMileage();
			gm.setMileage();
			gm.displayMileage();
			totalMiles += gm.getMiles();
			totalGallons += gm.getGallons();
			averageTotalGallons = (double) totalGallons / totalMiles;
			System.out.println("Enter -1 to terminate trip");
			Scanner input = new Scanner(System.in);
			tripCount = input.nextInt();
		}
		System.out.printf("The total miles covered by all drivers is : %d%n", totalMiles);
		System.out.printf("The total gallons consumed by all drivers is : %d%n", totalGallons);
		System.out.printf("The average gallon per mile for all drivers is : %.2f%n", averageTotalGallons);
		
	}

}

