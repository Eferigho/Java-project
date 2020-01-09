
public class SalaryCalculator {

	public static void main(String[] args) {
		
		int employeeCount = 1;
		while(employeeCount <= 3) {
			EmployeeSalary es = new EmployeeSalary();
			es.setEmployeeSalary();
			es.displayEmployeeSalary();
			employeeCount++;
		}

	}

}
