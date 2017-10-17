/**
 * PrintVoltageWater Class
 * Prints a table showing the meter voltage in relation
 * to water temperatures from 0 to 100 degrees Celsius in 
 * increments of 10
 * @author Mohamed Ibrahim 100626201
 * @version 1.00, 4 Oct 2017
 */
public class PrintVoltageWater {
	public static void main(String[] args) {
		double Ro = 50.0;
		double k = 0.5;
		double R;
		double vm;
		int T;
		String space;

		System.out.println("This program prints out a table showing the meter voltage corresponding to water temperatures ranging from 0 to 100 degrees celcius. The left column contains the temperature values in increments of 10 degrees, while the right column contains the corresponding meter voltage.\n");
		System.out.printf("    T\t  vm\n");
		System.out.println("  ----- ------");

		for(int i = 0; i <= 100; i += 10){
			T = i;
			R = Ro + k*T;
			vm = (R/(75+R))*20;

			System.out.printf("%5d%8.2f\n", T, vm);
		}
	}
}
