import java.util.*;
import java.lang.Math;

public class Triangle {
    int intB, intA, intH;
    double doubleB, doubleA, doubleH;

    public Triangle(String a, String b){
        this.intB = Integer.parseInt(b); /*convert b to int*/;
        this.intA = Integer.parseInt(a);/*convert a to int*/;
        this.doubleB = Double.parseDouble(b);/*convert b to double*/;
        this.doubleA = Double.parseDouble(a);/*convert a to double*/;
    }
    public double stringToDouble(String str){
        // parse string to double
        return Double.parseDouble(str);
    }
    public int stringToInt(String str){
        // parse string to int
        return Integer.parseInt(str);
    }
    public double pythagoreanDouble(){
        // use the math library to find the height of a right triangle 
	    // using the pythagorean formula
        this.doubleH = Math.sqrt(Math.pow(this.doubleA,2) + Math.pow(this.doubleB,2));
        return this.doubleH;
    }
    public int pythagoreanInt(){
        // use the math library to find the height of a right triangle 
	    // using the pythagorean formula
        this.intH = (int)(Math.sqrt(Math.pow(this.intA,2) + Math.pow(this.intB,2)));
        return this.intH;

    }
    public void areaTriangleInt(){
        // get the height
        // calculate area

        int area = (int)(0.5 * this.intB * pythagoreanInt());

        System.out.println("Int Area of Triangle: " + area);
        System.out.println("Int Height of Triangle: " + this.intH);
    }
    public void areaTriangleDouble(){
        // get the height
        // calculate area
        double area = 0.5 * this.doubleB * pythagoreanDouble(); 

        System.out.println("Double Area of Triangle: " + area);
        System.out.println("Double Height of Triangle: " + this.doubleH);
    }

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input the length: ");
        // use the scanner to get a string a
        String a = input.nextLine();

        System.out.println("Input the base: ");
        // use the scanner to get a string b
        String b = input.nextLine();


        Triangle tri = new Triangle(a,b);
        tri.areaTriangleDouble();
        tri.areaTriangleInt();
    }
}
