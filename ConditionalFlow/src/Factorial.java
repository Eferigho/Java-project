import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number to calculate the factorial");
		int n = input.nextInt();
		int m = n;
		long factorial = 1;
		while(n >= 1) {
			factorial = factorial * n;
			n = n-1;
		}
		System.out.printf("The factorial of %d is %d",m,factorial);
		
	}

}
