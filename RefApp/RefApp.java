public class RefApp {
	public static void main(String[] args) {
		int x = 5;
		int y = x;
		System.out.println(y); // print 5
		y=7;
		System.out.println(y); // print 7
		System.out.println(x); // 5

		StringBuffer sb1 = new StringBuffer("Hello ");
		StringBuffer sb2 = sb1;
		System.out.println(sb2); // Hello
		sb2.append("there!");
		System.out.println(sb2); // Hello there!
		System.out.println(sb1); // Hello there!
		


		// String text = "text";
		// text.indexOf("t");
		// text.substring(1);
		// text.substring(1,3);
		// text.length();

		// sb2 = new StringBuffer("Max");
	}
}