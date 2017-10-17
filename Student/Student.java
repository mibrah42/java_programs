public class Student {
	private String name;
	private int student_id;
	private static int id=101;


	public void setName(String studentName){
		this.name = studentName;
	}

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	public Student(String name){
		this.name = name;
		student_id = id;
		id++;
	}

	public void printInfo(){
		System.out.println("Student name: " + name);
		System.out.println("Student id: " + student_id);
	}

	public static void main(String[] args) {
		Student mike = new Student("mike");
		Student emily = new Student("emily");
		Student mohamed = new Student("Mohamed");
		Student omar = new Student("Omar");

		mike.printInfo();
		emily.printInfo();
		mohamed.printInfo();
		omar.printInfo();
	}

}