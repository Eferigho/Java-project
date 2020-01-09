package Chapter5;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double empSalary;
		double empSalary1;
		double newEmpSalary;
		double newEmpSalary1;
		
		Employee employee1 = new Employee("Efe","Chris",200);
		empSalary = employee1.getMothlySalary() * 12;
		System.out.printf("Employee First Name: %s Last Name: %s Monthly Salary: %.2f%n",employee1.getFirstName(),employee1.getLastName(),employee1.getMothlySalary());
		System.out.println("Employee Yearly Salary : "+ empSalary);
		newEmpSalary = ((employee1.getMothlySalary() * 0.1) + employee1.getMothlySalary()) * 12;
		System.out.println("Employee Incremented Yearly Salary : "+ newEmpSalary);
		System.out.println();
		
		Employee employee2 = new Employee("David","Oyedepo",700);
		empSalary1 = employee2.getMothlySalary() * 12;
		System.out.printf("Employee First Name: %s Last Name: %s Monthly Salary: %.2f%n",employee2.getFirstName(),employee2.getLastName(),employee2.getMothlySalary());
		System.out.println("Employee Yearly Salary : "+ empSalary1);
		newEmpSalary1 = ((employee2.getMothlySalary() * 0.1) + employee2.getMothlySalary()) * 12;
		System.out.println("Employee Incremented Yearly Salary : "+ newEmpSalary1);
		

	}

}
