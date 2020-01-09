package Chapter5;
import java.util.Scanner;
public class SecondLagest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int largest = 2, i = 1;
		int secondLargest = 1;
		
		while(i <= 5) {
			System.out.println("Enter Any number");
			int numb = input.nextInt();
			if(largest < numb ) {
					secondLargest = largest;
					largest = numb;
			}
			else if(secondLargest < numb) {
				
				secondLargest = numb;
			}
			i++;
		}
		System.out.printf("The largest Number is : %d and the second Largest is : %d",largest,secondLargest);
	}

}
