import java.util.Scanner;
public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 1;
		while(count != 0) {
			System.out.println("Please enter your five(5) digit number");
			int number = input.nextInt();
			
			int numb1, numb2, numb3, numb4, numb5;
			int leastBoundary = 9999;
			int highestBoundary = 99999;
	
			if((number > leastBoundary) && (number < highestBoundary)){
		
				numb1 = (number / 10000);
			 	numb2 = (number % 10000) / 1000;
				numb3 = (number % 1000) / 100;
				numb4 = (number % 100) / 10;
				numb5 = (number % 10) / 1;
				
				if((numb1 == numb5) && (numb2 == numb4)) {
					System.out.println("The number are palindrome.");
					count = -1;
				}
				
				//System.out.printf("%d    %d    %d    %d    %d",numb1,numb2,numb3,numb4,numb5);
			} 
			else{
				System.out.printf("The number you entered is not equal to five(5) digit");
			}
			count++;
		}
	}

}
