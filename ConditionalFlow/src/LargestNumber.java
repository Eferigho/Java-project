import java.util.Scanner;
public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb, numb1, numb2, numb3, numb4, numb5, numb6, numb7, numb8, numb9;
		int count = 1;
		Scanner input = new Scanner(System.in);
		while(count <= 10) {
			System.out.println("Enter  First Number");
			numb = input.nextInt();
			count++;
			
			System.out.println("Enter Second Number");
			numb1 = input.nextInt();
			count++;
			
			System.out.println("Enter Third Number");
			numb2 = input.nextInt();
			count++;
			
			System.out.println("Enter Fourth Number");
			numb3 = input.nextInt();
			count++;
			
			System.out.println("Enter Fifth Number");
			numb4 = input.nextInt();
			count++;
			
			System.out.println("Enter Sixth Number");
			numb5 = input.nextInt();
			count++;
			
			System.out.println("Enter Seventh Number");
			numb6 = input.nextInt();
			count++;
			
			System.out.println("Enter Eighth Number");
			numb7 = input.nextInt();
			count++;
			
			System.out.println("Enter Ninth Number");
			numb8 = input.nextInt();
			count++;
			
			System.out.println("Enter Tenth Number");
			numb9 = input.nextInt();
			count++;
			
			int largestNumber = 0;
			
			if(largestNumber < numb) {
				largestNumber = numb;
				
			}
			if (largestNumber < numb1) {
				largestNumber = numb1;
				
			}
			if (largestNumber < numb2) {
				largestNumber = numb2;
				
			}
			if (largestNumber < numb3) {
				largestNumber = numb3;
				
			}
			if (largestNumber < numb4) {
				largestNumber = numb4;
				
			}
			if (largestNumber < numb5) {
				largestNumber = numb5;
				
			}
			if (largestNumber < numb6) {
				largestNumber = numb6;
				
			}
			if (largestNumber < numb7) {
				largestNumber = numb7;
			}
			if (largestNumber < numb8) {
				largestNumber = numb8;
				
			}
			if (largestNumber < numb9) {
				largestNumber = numb9;
			}
			System.out.println("The Largest Number is : "+ largestNumber);
			
		}
	}

}
