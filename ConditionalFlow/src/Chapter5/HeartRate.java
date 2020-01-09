package Chapter5;
import java.util.Calendar;
import java.util.Scanner;
public class HeartRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			HeartCalculator t1 = new HeartCalculator();
			String firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth;
			String dateOfBirth;
			Scanner Input = new Scanner(System.in);

			System.out.println("Please Enter your First Name");
			firstName = Input.nextLine();

			System.out.println("Please Enter your Last name");
			lastName = Input.nextLine();

			System.out.println("Enter your Day of Birth");
			dayOfBirth = Input.nextLine();
			
			System.out.println("Enter your Month of Birth");
			monthOfBirth = Input.nextLine();

			System.out.println("Enter your Year of Birth");
			yearOfBirth = Input.nextLine();

			System.out.println("\nHello "+firstName+""+lastName+" Your Details are below.");

			dateOfBirth = t1.getDateOfBirth(dayOfBirth,monthOfBirth,yearOfBirth);
			System.out.println("Your Date of Birth : "+dateOfBirth);

			int yBirth;
			try {
				yBirth = Integer.parseInt(yearOfBirth);
			}
			catch (NumberFormatException e)
			{
				yBirth = 0;
			}

			int nowYear = Calendar.getInstance().get(Calendar.YEAR);
			
			int currentAge = t1.getYourAge(yBirth,nowYear);
			System.out.println("Your current age is :\t"+currentAge);

			int maxRate = t1.maxHeartRate(currentAge);
			System.out.println("Your Maximum Heart Rate is :"+maxRate);

			double highestTargetedHeartRate = t1.getHighestTargetHeartRate(maxRate);
			System.out.println("Your Highest Targeted Heart Rate is :"+highestTargetedHeartRate);

			double lowestTargetedHeartRate = t1.getLowestTargetHeartRate(maxRate);
			System.out.println("Your Lowest Targeted Heart Rate is :"+lowestTargetedHeartRate);
			}
		}

		class HeartCalculator{
			

			public  String getDateOfBirth(String dayOfBirth, String monthOfBirth, String yearOfBirth){
				String dateOfBirth;
				dateOfBirth = dayOfBirth +"."+ monthOfBirth +"."+ yearOfBirth;
				return dateOfBirth;
			}

			public  int getYourAge(int yearOfBirth, int currentYear){
				int yourAge;
				yourAge = currentYear - yearOfBirth;
				return yourAge;
			}

			public  int maxHeartRate(int yourAge){
				int beatPerMinute, maxRate;
				beatPerMinute = 220;
				maxRate = beatPerMinute - yourAge;
				return maxRate;
			}
			
			public  double getHighestTargetHeartRate(double maxRate){
				double highestTargetRate, ReqHighestPercent;
				ReqHighestPercent = 85;
				highestTargetRate = (ReqHighestPercent / 100) * maxRate;
				return highestTargetRate;
			}

			public  double getLowestTargetHeartRate(double maxRate){
				double lowestTargetRate, ReqLowestPercent;
				ReqLowestPercent = 50;
				lowestTargetRate = (ReqLowestPercent / 100) * maxRate;
				return lowestTargetRate;
				
			}

		
	

}
