public class EnumTest {
	Day day;

	public EnumTest(Day day){
		this.day = day;
	}

	public static void main(String[] args) {
		// EnumTest monday = new EnumTest(Day.Monday);

		// if (monday = Day.Monday){
		// 	System.out.println("The day is monday");
		// }

		for(Day d: Day.values()){
			System.out.println(d);
		}
	}
}