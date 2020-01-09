import java.util.Scanner;
public class EmployeeSalary {

	private String employeeName;
	private int hourlyPay;
	private  double grossPay;
	private  int firstFourtyHours = 40;
	private int workedHours;
	private int excessHours;
	
	Scanner input = new Scanner(System.in);
	
	public void setEmployeeName() {
		System.out.println("Enter worker\'s name");
		this.employeeName = input.nextLine();	
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setHourlyPay() {
		System.out.println("Enter hourly pay");
		this.hourlyPay = input.nextInt();
	}
	public int getHourlyPay() {
		return hourlyPay;
	}
	
	public void setWorkedHours() {
		System.out.println("Enter  total hours worked");
		this.workedHours = input.nextInt();
	}
	public int getWorkedHours() {
		return workedHours;
	}
	public void setEmployeeSalary() {
		setEmployeeName();
		setHourlyPay();
		setWorkedHours();
	}
	
	public void displayEmployeeSalary() {
			
			if(workedHours > 40) {
				excessHours = workedHours - 40;
				grossPay = (firstFourtyHours * hourlyPay) + (excessHours * (hourlyPay/2));
				System.out.println("Hello Your details are below:");
				System.out.printf("Your name is : %s%n",employeeName);
				System.out.printf("Your Hourly Pay is : %d%n", hourlyPay);
				System.out.printf("Your Excess Hours is : %d%n", excessHours);
				System.out.printf("Your Gross Pay is : %.3f%n Thank you!!!%n", grossPay);
			}
			else {
				grossPay = workedHours * hourlyPay;
				System.out.println("Hello Your details are below:");
				System.out.printf("Your name is : %s%n",employeeName);
				System.out.printf("Your Hourly Pay is : %d%n", hourlyPay);
				System.out.printf("Your Gross Pay is : %.3f%n Thank you!!!%n", grossPay);
			}
				
	}
}

