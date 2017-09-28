
public class DefApp {
	int x; // 0
	float f; // 0.0
	double d; // 0.0
	boolean isOk; // false
	char c; // ' '
	String s; // null

	public void printInfo(){
		System.out.println(x);
		System.out.println(f);
		System.out.println(d);
		System.out.println(isOk);
		System.out.println(c);
		System.out.println(s);
	}

	public static void main(String[] args) {
		DefApp Defaults = new DefApp();
		Defaults.printInfo();
	}
}