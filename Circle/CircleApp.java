public class CircleApp {
	
	public static void main(String[] args) {
		Circle c = new Circle(5.5);
		double area = c.getArea();
		System.out.println("The area is " + area);

		System.out.println("The diamete is: " + c.getDiameter());
		System.out.println("The circumference is: " + c.getCircumference());	
	}


}
