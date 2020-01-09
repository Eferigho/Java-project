import java.util.Scanner;
public class SalesCommissionCalculator {

	public static void main(String[] args) {
		double firstItem = 239.99, secondItem = 129.75, thirdItem = 99.95, fourthItem = 350.89;
		int totalItems = 0;
		double grossItems = 0;
		int weeklyPay = 200;
		int itemCount = 1;
		int value;
		System.out.println("This program calculate Sales Commission for Salespersons at 9% per week.");
		Scanner input = new Scanner(System.in);
		while(itemCount != 0) {
			System.out.println("Enter 1 for first Item = 239.99, 2 for second Item = 129.75, 3 for third Item = 99.95, 4 for fourth Item = 350.89 or 0 to terminate calculator");
			value = input.nextInt();
			if(value == 1) {
				grossItems += firstItem;
				totalItems++;
			}
			else if (value == 2) {
				grossItems += secondItem;
				totalItems++;
			}
			else if (value == 3) {
				grossItems =+ thirdItem;
				totalItems++;
			}
			else if (value == 4) {
				grossItems += fourthItem;
				totalItems++;
			}
			else {
				itemCount = 0;
			}
			
		}
		double totalGrossItems = (grossItems * 0.9) + weeklyPay;
		System.out.println("The total number of Items sold is : "+totalItems);
		System.out.printf("Total gross Items is : %.2f%n%n",grossItems);
		System.out.printf("Your total earning for the week is : %.2f",totalGrossItems);

	}

}
