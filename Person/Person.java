
public class Person {

	// Instance variables
	int age;
	String name;


	// Constructor
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	// print out the info of the instance
	public void printInfo(){
		System.out.println("name: " + name);
		System.out.println("age: " + age);
	}
	
	// change name
	public void changeName(String name, int age) {
		this.name = name;
		this.age = age;	
	}
	
	// main function, program entry point
	public static void main(String[] args){
		Person Mohamed = new Person("Mohamed", 21);
		Person Sachin = new Person("Sachin", 18);
		Person Youssef = new Person("Youssef", 24);



		Mohamed.printInfo();
		Sachin.printInfo();
		Youssef.printInfo();

		Sachin.changeName("Omar", 20);
		Sachin.printInfo();		
	}


}
