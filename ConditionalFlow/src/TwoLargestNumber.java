import java.util.Scanner;

public class TwoLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int largestNumber = 2;
		int secondLargestNumber = 1;
		int count = 1;
		
		while(count <= 10) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter  Number");
			int numb = input.nextInt();
				
			if( numb > largestNumber) { 
				largestNumber = numb;
			}
			
			else if((numb > secondLargestNumber )&& (numb != largestNumber)) {
				
				secondLargestNumber = numb;	
				
			 }
			
			 count++;
	}
	
		System.out.println("The Largest Number is : "+ largestNumber);
		System.out.println("The Second Largest Number : "+ secondLargestNumber);
}
}
