public class Employee {
	String name;
	int age;
	private double salary;

	/** 
	*@param name Employee Name
	*@param age Employee Age 
	*@param salary Employee salary 
	*/

	public Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public void printInfo(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}

	public double getSalary(){
		return salary;
	}

	public void salaryRaise(double salary){
		this.salary = salary;
	}

	// public static void main(String[] args) {
	// 	Employee mike = new Employee("Mike Harris", 44, 55999); 
	// 	Employee sarah = new Employee("Sarah Williams", 29, 80000);

	// 	mike.printInfo(); 
	// 	sarah.printInfo(); 
	// 	System.out.println("Mike's age: " + sarah.getSalary());
	// }


}
