package Chapter5;
import java.util.Scanner;
public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number to compare");
		int inputNumber = input.nextInt();
		int counter = 1;
		int lowestNumber = inputNumber;
		while(counter < inputNumber) {
			System.out.println("Enter any number to compare");
			int inputNumber2 = input.nextInt();
			if(lowestNumber > inputNumber2) {
				lowestNumber = inputNumber2;
			}
			counter++;
			
		}
		System.out.println("The Lowest Number is : "+lowestNumber);
	}

}
