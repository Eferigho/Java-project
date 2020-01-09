/* This program calculates the total amount of Gas consumed by Vehicles on miles covered.
 * This program is design for drivers traveling from one location to another.  
 */
import java.util.Scanner;
public class GasMileage {
private String name;
private String location;
private String destination;
private int miles;
private int gallons;
private double averageGallons;

Scanner input = new Scanner(System.in);
public void setName() {
	System.out.println("Enter your name");
	this.name = input.nextLine();
}
public String getName() {
	return name;
}

public void setLocation() {
	System.out.println("Enter your Location");
	this.location = input.nextLine();
}
public String getLocation() {
	return location;
}

public void setDestination() {
	System.out.println("Hello Please enter your Destination");
	this.destination = input.nextLine();
}
public String getDestination() {
	return destination;
}

public void setMiles() {
	System.out.println("Enter Miles covered for your journey");
	this.miles = input.nextInt();
	
}
public int getMiles() {
	return miles;
}

public void setGallons() {
	System.out.println("Enter Numbers of Gallons used for your journey");
	this.gallons = input.nextInt();
	
}
public int getGallons() {
	return gallons;
}




public void setAverageGallons() {
	averageGallons = (double) gallons / miles;
}


public void setMileage() {
	
	setName();
	setLocation();
	setDestination();
	setMiles();
	setGallons();
	setAverageGallons();
}

public void displayMileage() {
	
	System.out.println("Your Enroute details are below:");
	System.out.printf("Your name is : %s%n",name);
	System.out.printf("You journey started from : %s%n", location);
	System.out.printf("Your Destination is : %s%n",destination);
	System.out.printf("You covered the total : %d miles to %s%n",miles,destination);
	System.out.printf("Your vehicle consumed total of %d Gallons of Gas from %s to %s%n",gallons,location,destination);
	System.out.printf("The average gallon your vehicle consumed per mile is : %.2f%n",averageGallons);
	
	
}


}
