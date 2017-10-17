import java.text.*;

/**
 * WoodenBeam Class
 * Represents a wooden beam and calculates the maximum load 
 * that can be placed at the end of it
 * @author Mohamed Ibrahim 100626201
 * @version 1.00, 4 Oct 2017
 */
public class WoodenBeam{
	private double distance; // in feet, need to convert to in
	private double base; // in inches 
	private double height; // in inches
	private double I; // rectangular moment of inertia in in^4
	private double c; // in inches
	private double L; // maxLoad in lbs
	private double stress; // in lbs/in^2

	/**
	* Constructs a WoodenBeam and sets its initial values
	* @param distance sets the distance that the load is placed from the fixed end of the beam
	* @param base sets the base of the wooden beam
	* @param height sets the height of the wooden beam
	*/
	public WoodenBeam(double distance, double base, double height){
		this.distance = distance;
		this.base = base;
		this.height = height;

		I = (base*(height*height*height))/12;
		c = 0.5*height;
	}

	/**
	* Returns the distance that the load is placed from the fixed end
	* @return returns the distance in feet
	*/
	public double getDistance(){
		return distance;
	}

	/**
	* Returns the distance that the load is placed from the fixed end
	* @return returns the distance in inches
	*/
	public double getDistanceInInches(){
		return distance*12;
	}

	/**
	* Returns the base of the wooden beam 
	* @return returns the base of the wooden beam in inches
	*/
	public double getBase(){
		return base;
	}

	/**
	* Returns the height of the wooden beam 
	* @return returns the height of the wooden beam in inches
	*/
	public double getHeight(){
		return height;
	}

	/**
	* Returns the stress on the fixed end of the beam 
	* @return Returns the stress on the fixed end of the beam in lbs per square inch
	*/
	public double getStress(){
		return stress;
	}

	/**
	* Returns the rectangular moment of inertia 
	* @return Returns the rectangular moment of inertia in in^4
	*/
	public double getI(){
		return I;
	}

	/**
	* Returns the centroid value 
	* @return Returns the centroid value in inches
	*/
	public double getC(){
		return c;
	}

	/**
	* Returns the maximum weight of the load
	* @return Returns the maximum weight of the load in lbs
	*/
	public double getL(){
		return L;
	}

	/**
	* Computes the maximum weight of the load given the value of stress
	* @param stress the stress on the fixed end of the beam
	* @return returns the maximum weight of the load
	*/
	public double computeMaxLoad(double stress){
		this.stress = stress;
		L = (stress*I)/((distance*12)*c);
		return L;
	}

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("###.##");

		WoodenBeam wb1 = new WoodenBeam(8.0, 2.0, 4.0);
		WoodenBeam wb2 = new WoodenBeam(8.0, 3.0, 6.0);
		double maxLoad1 = wb1.computeMaxLoad(3000.0);
		double maxLoad2 = wb2.computeMaxLoad(3000.0);
		

		// print out details

		System.out.println("This program allows you to calculate the maximum load of a symmetrical wooden beam given the distance from the fixed end, the base and height of the beam, as well as the stress value. Below is the output for two different beams given separate values.\n\n");


		System.out.println("For Beam #1:");
		System.out.println("The length of the beam is d = " + df.format(wb1.getDistance()) + " feet which is equal to " + df.format(wb1.getDistanceInInches()) + " inches");
		System.out.println("The length of the base is b = " + df.format(wb1.getBase()) + " inches");
		System.out.println("The height of the beam is h = " + df.format(wb1.getHeight()) + " inches");
		System.out.println("The stress on the fixed end of the beam is S = " + df.format(wb1.getStress()) + " lbs per square inch");
		System.out.println("The rectangular moment of inertia is: " + df.format(wb1.getI()) + " in^4");
		System.out.println("The centroid of the beam is: " + df.format(wb1.getC()) + " inches");
		System.out.println("Using the formula L = (S*I)/(d*c) = (" + df.format(wb1.getStress()) + "*" + df.format(wb1.getI()) + ")/(" + df.format(wb1.getDistanceInInches()) + "*" + df.format(wb1.getC()) + "), the maximum load that can be placed at the end of the beam is: " + df.format(wb1.getL()) + " lbs");

		System.out.println("\nFor Beam #2:");
		System.out.println("The length of the beam is d = " + df.format(wb2.getDistance()) + " feet which is equal to " + df.format(wb2.getDistanceInInches()) + " inches");
		System.out.println("The length of the base is b = " + df.format(wb2.getBase()) + " inches");
		System.out.println("The height of the beam is h = " + df.format(wb2.getHeight()) + " inches");
		System.out.println("The stress on the fixed end of the beam is S = " + df.format(wb2.getStress()) + " lbs per square inch");
		System.out.println("The rectangular moment of inertia is: " + df.format(wb2.getI()) + " in^4");
		System.out.println("The centroid of the beam is: " + df.format(wb2.getC()) + " inches");
		System.out.println("Using the formula L = (S*I)/(d*c) = (" + df.format(wb2.getStress()) + "*" + df.format(wb2.getI()) + ")/(" + df.format(wb2.getDistanceInInches()) + "*" + df.format(wb2.getC()) + "), the maximum load that can be placed at the end of the beam is: " + df.format(wb2.getL()) + " lbs");

		
	}
}