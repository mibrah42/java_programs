public class InterestApp {
	public static void main(String[] args) {
		int year = 0;
		double investment = 10000;

		while(investment< 20000){
			year++;
			double interest = investment*0.05;
			investment = investment + interest;
		}

		System.out.println("it would take " + year + " years to double your initial investment. but shopify stocks!");
	}
}