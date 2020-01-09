import java.util.Scanner;
public class BinaryEquivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int numb1, numb2, numb3, numb4, numb5, numb6, numb7, numb8, numb9, numb10;
		int least = 0;
		int high = 1111111111;	
		int result;
		int count = 0;
		while(count != -1) {
			System.out.println("Enter any binary number for convertion");
			int number = input.nextInt();
			
			if ((number >= least) && (number <= high)) {
				
				numb1 = (number / 1000000000);
				numb2 = (number % 1000000000) /1000000;
				numb3 = (number % 100000000) /1000000;
				numb4 = (number % 10000000) /100000;
				numb5 = (number % 1000000) /100000;
				numb6 = (number % 100000) /10000;
			 	numb7 = (number % 10000) / 1000;
				numb8 = (number % 1000) / 100;
				numb9 = (number % 100) / 10;
				numb10 = (number % 10) / 1;
				result = ( (numb10*1) + (numb9*2) + (numb8*4) + (numb7*8) + (numb6*16) + (numb5*32) + (numb4*64) + (numb3*128) + (numb2*256) + (numb1*512));
				System.out.printf("The Equivalent of %d in decimal is : %d%n",number,result);
				count++;
			}
			
		}
	}

}
