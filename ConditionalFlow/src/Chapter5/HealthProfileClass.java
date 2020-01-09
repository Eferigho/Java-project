package Chapter5;
import java.util.Calendar;
import java.util.Scanner;
public class HealthProfileClass {

	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String gender;
	private String day;
	private String month;
	private String year;
	private double height;
	private double weight;
	private int yourAge;
	private int yearOfBirths;
	private int maxHeartRate;
	Scanner input = new Scanner(System.in);
	
	public HealthProfileClass(String firstName, String lastName, String gender, String dateOfBirth, double height,double weight) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.height = height;
		this.weight = weight;
	}
	
	public void setFirstName() {
		System.out.println("-------------------------------");
		System.out.println("|Patient Health Privacy System |");
		System.out.println("-------------------------------");
		System.out.println("Enter your First Name");
		this.firstName = input.nextLine();
		setLastName();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName() {
		System.out.println("Enter your Last Name");
		this.lastName = input.nextLine();
		setGender();
	}
	public String getLastName() {
		return lastName;
	}
	public void setGender() {
		System.out.println("Enter your Gender");
		this.gender = input.nextLine();
		
		
	}
	public String getGender() {
	   
		return this.gender;
	}
	public void setDateOfBirth() {
		System.out.println("Enter Your Day of birth");
		setDay(input.nextLine());
		System.out.println("Enter Your Month of birth");
		setMonth(input.nextLine());
		System.out.println("Enter Your Year of birth");
		setYear(input.nextLine());
		this.dateOfBirth = getDay()+"/"+getMonth()+"/"+getYear();
		setCurrentAge();
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getDay() {
		return day;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public String getMonth() {
		return month;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getYear() {
		return year;
	}
	public void setCurrentAge() {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		yearOfBirths = Integer.parseInt(this.year);
		yourAge = currentYear - yearOfBirths;
		setHeight();
	}
	public int getCurrentAge() {
		return yourAge;
	}
	
	public int MaxHeartRate() {
		this.maxHeartRate =  220 - this.yourAge ;
		return maxHeartRate;
	}
	public double highestTargetedRate() {
		double highestTargetedRate = 0.85 * maxHeartRate;
		return highestTargetedRate;
	}
	public double lowestTargetedRate() {
		double lowestTargetedRate = 0.5 * maxHeartRate;
		return lowestTargetedRate;
	}
	
	public void setHeight() {
		System.out.println("Enter your Height in Inches");
		this.height = input.nextDouble();
		setWeight();
	}
	public double getHeight() {
		return height;
	}
	public void setWeight() {
		System.out.println("Enter your Weight in Pounds");
		this.weight = input.nextDouble();
		displayHealthProfile();
	}
	public double getWeight() {
		return weight;
	}
	public double bmi () {
		double bmi = this.weight / (this.height * 2);
		return bmi;
	}
	public void displayHealthProfile() {
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.printf("Hello %s  %s your Health Profile Details:%n",firstName,lastName);
		System.out.println();
		System.out.printf("First Name: %s Last Name: %s Gender: %s%n", firstName,lastName,this.gender);
		System.out.println();
		System.out.printf("Date of birth: %s Your Current Age: %d Your Maximum Heart Rate: %d%n", dateOfBirth,yourAge,MaxHeartRate());
		System.out.println();
		double highestTargetedRate = highestTargetedRate();
		double lowestTargetedRate = lowestTargetedRate();
		double bmi = bmi();
		System.out.printf("Your Highest Targeted Heart Rate is:  %.2f   Lowest Targeted Heart Rate is:  %.2f  and your Body Mass Index (BMI) is: %.2f%n",highestTargetedRate,lowestTargetedRate,bmi );
		System.out.println("-------------");
		System.out.println("|Thank You!!!|");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
		
	}
}
