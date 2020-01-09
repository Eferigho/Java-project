import java.util.Scanner;
public class Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int count = -1;
		while(count < 0){
			System.out.println("Enter any number");
			int n = input.nextInt();
			if((n == 1) || (n == 2)) {
				
				System.out.println("Perfect you got it!!!");
				count = 0;
			}
			
		}
	}

}
