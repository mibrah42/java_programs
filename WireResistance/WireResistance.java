import java.util.Scanner;
import java.text.*;

/**
 * WireResistance Class
 * Represents a wire and computes its resistance
 * whether it is a copper wire or an aluminum wire
 * @author Mohamed Ibrahim 100626201
 * @version 1.00, 4 Oct 2017
 */
public class WireResistance {
	private double length;
	private double diameter;
	private int wireGauge;

	/**
	* Converts millimeters to meters
	* @param value the value (in mm) that you want to convert to meters 
	* @return returns the conversion in meters
	*/
	public double convertMillimeterToMeter(double value){
		return value * 0.001;
	}

	/**
	* Converts inches to meters
	* @param value the value (in inches) that you want to convert to meters 
	* @return returns the conversion in meters
	*/
	public double convertInchesToMeter(double value){
		return value * 0.0254;
	}
	
	/**
	* Computes the diameter of the wire given the wire gauge value
	* @param wireGauge the value of the American wire gauge (AWG)
	* @return returns the diameter of the wire
	*/
	public double computeDiameter(int wireGauge){
		double diameter_mm = 0.127*Math.pow(92,((36.0-wireGauge)/39.0));
		diameter = convertMillimeterToMeter(diameter_mm);
		return diameter;
	}

	/**
	* Computes the resistance of a copper wire given its length and wire gauge value
	* @param length the length of the wire
	* @param wireGauge the value of the American wire gauge (AWG)
	* @return returns the resistance of a copper wire
	*/
	public double computeCopperWireResistance(double length, int wireGauge){
		this.wireGauge = wireGauge;
		this.length = convertInchesToMeter(length);
		diameter = computeDiameter(wireGauge);
		double p = 1.678E-8;
		double R = (4*p*this.length)/((Math.PI)*(Math.pow(diameter, 2)));
		return R;
	}

	/**
	* Computes the resistance of an Aluminum wire given its length and wire gauge value
	* @param length the length of the wire
	* @param wireGauge the value of the American wire gauge (AWG)
	* @return returns the resistance of an aluminum wire
	*/
	public double computeAluminumWireResistance(double length, int wireGauge){
		this.wireGauge = wireGauge;
		this.length = convertInchesToMeter(length);
		diameter = computeDiameter(wireGauge);
		double p = 2.82E-8;
		double R = (4*p*this.length)/((Math.PI)*(Math.pow(diameter, 2)));
		return R;
	}


	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.###");
		WireResistance wire = new WireResistance();

		
		System.out.println("This program allows you to calculate the resistance of a copper and an aluminum wire. To compute the resistances, please provide the values for the American wire gauge (AWG) as well as the length of the wire.\n");
		System.out.print("Enter the wire gauge: ");
		Scanner scan = new Scanner(System.in);
		int AWG = scan.nextInt();

		System.out.print("Enter the wire length in inches: ");
		double length = scan.nextDouble();

		if(AWG <= 0 || length <= 0){
			System.out.println("Your entry is invalid. (You cannot type 0 or negative numbers)");
			System.exit(0);
		}

		double copperResistance = wire.computeCopperWireResistance(length, AWG);
		double aluminumResistance = wire.computeAluminumWireResistance(length, AWG);
		System.out.println("The resistance of a " + df.format(length) + " inch piece of " + AWG + " gauge copper wire is " + df.format(copperResistance) + " Ohms.");
		System.out.println("The resistance of a " + df.format(length) + " inch piece of " + AWG + " gauge aluminum wire is " + df.format(aluminumResistance) + " Ohms.");
	}
}