public class TriangleTest {
	public static void main(String[] args) {
		Triangle tri = new Triangle("5","5");
		System.out.println(tri.intA + " " + tri.intB);
		System.out.println(tri.doubleA + " " + tri.doubleB);
		System.out.println(tri.pythagoreanDouble());
		tri.areaTriangleDouble();
	}
}
