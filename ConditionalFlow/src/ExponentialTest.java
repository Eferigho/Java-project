import java.util.Scanner;
public class ExponentialTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your base number");
		int base = input.nextInt();
		System.out.println("Enter your power number");
		int power = input.nextInt();
		Exponential exp = new Exponential();
		
		exp.setExponential(base, power);
		
		System.out.println(exp.getExponential());
	}

}
