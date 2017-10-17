public class EnumTest {
	private Day day;

	public EnumTest(Day day){
		this.day = day;
	}

	public static void main(String[] args) {
		EnumTest dayOfWeek = new EnumTest(Day.Friday);

		switch(dayOfWeek.day) {
			case Monday :
				System.out.println("the week just started");
				break;
			case Tuesday : case Wednesday : case Thursday :
				System.out.println("Waiting for firday...");
				break;
			case Friday :
				System.out.println("ITS FRIDAYYYY, lets pray Jumaaaah!");
		}
		// if (monday = Day.Monday){
		// 	System.out.println("The day is monday");
		// }

		// for(Day d: Day.values()){
		// 	System.out.println(d);
		// }
	}
}