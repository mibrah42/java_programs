public class EmployeeApp {
	public static void main(String[] args) {
		Employee mike = new Employee("Mike Harris", 44, 55999); 
		Employee sarah = new Employee("Sarah Williams", 29, 80000);

		mike.printInfo(); 
		sarah.printInfo(); 
		System.out.println("Mike's salary: " + mike.getSalary());
		mike.salaryRaise(100000);
		System.out.println("Mike's salary: " + mike.getSalary());
	}	
}
