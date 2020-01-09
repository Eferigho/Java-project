import java.util.Scanner;
public class DecimalEquivalent {

	public static void main(String[] args) {
		
		int modulus;
		String binary = "";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Decimal number");
		int reminder = input.nextInt();
		int decimalNumber = reminder;
		
		while(reminder >= 1) {
			modulus = reminder % 2;
			reminder = reminder / 2;
			binary =  Integer.toString(modulus) + binary;
		}
		System.out.printf(decimalNumber+" in binary is %s%n",binary);
		 
		
	}

}
