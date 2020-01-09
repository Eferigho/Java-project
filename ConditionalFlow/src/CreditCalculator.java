import java.util.Scanner;
public class CreditCalculator {

	public static void main(String[] args) {
		
				Scanner input = new Scanner(System.in);
				System.out.println("Number for Customer OR -1 to end program");
				int i = input.nextInt();
				while(i != -1) {
					System.out.println("Enter the customer Account Number");
					int accountNumber = input.nextInt();
					
					System.out.println("Enter the Account Balance of the customer at the beginning of the Month");
					int balanceBeginOfMonth = input.nextInt();
					
					System.out.println("Enter total of all items charged by the customer this month");
					int totalItemsThisMonth = input.nextInt();
					
					System.out.println("enter total of all credits applied to the customer’s account this month");
					int totalCreditsThisMonth = input.nextInt(); 
					
					System.out.println("Enter customer allowed credit limit");
					int allowedCreditLimit = input.nextInt();
					
					int balance = (balanceBeginOfMonth + totalItemsThisMonth) - allowedCreditLimit;
					System.out.println("Your new balance is : "+ balance);
					if(balance > allowedCreditLimit) {
						System.out.println("Credit limit exceeded");
						System.out.println("Number for Customer OR -1 to end program");
						i = input.nextInt();
					
				    }
					else {
						System.out.println("Number for Customer OR -1 to end program");
						i = input.nextInt();
					}
					
				}
			

		

		// TODO Auto-generated method stub

	}

}
