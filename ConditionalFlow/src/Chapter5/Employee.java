package Chapter5;

public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public double getMothlySalary() {
		
		return monthlySalary;
	}
	public void setMothlySalary(double monthlySalary) {
		if(monthlySalary < 0) {
			monthlySalary = 0;
		}
		this.monthlySalary = monthlySalary;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
