public class Rectangle{
 
    int x,y,w,h;
   
    // Constructor
    public Rectangle(int x, int y, int w, int h){
    	this.x = x;
    	this.y = y;
    	this.w = w;
    	this.h = h;
    }

	// A shift of the initial 5,5 to the new x,y positions  
    public void translate(int x, int y){
    	this.x += x;
    	this.y += y;
    }

	// Calculate and return the area of the rectangle
    public int area(){
    	return w * h;
    }

	// Calculate and return the perimeter of the rectangle
    public int getPerimeter(){
    	return (w*2)+(h*2);
    }

	// Retun the width of the rectangle
    public int getWidth(){
    	return w;
    }

	// Return the height of the rectangle
    public int getHeight(){
    	return h;
    }

	// Return the x coordinate of the rectangle
    public int getX(){
    	return x;
    }

	// return the y coordinate of the rectangle
    public int getY(){
    	return y;
    }

	// This is the main() method, entry point to the program
    public static void main(String[] args){
      //initialize Rectangle object
      Rectangle box = new Rectangle(5,5,5,5);

      //translation
      System.out.println("Location: " + box.getX() + ", " + box.getY());
      box.translate(5,5);
      System.out.println("Location after Shift: " + box.getX() + ", " + box.getY());

      //general info
      System.out.println("Height: " + box.getHeight());
      System.out.println("Width: " + box.getWidth());
      System.out.println("Area: " + box.area());
      System.out.println("Perimeter: " + box.getPerimeter());
      // Rectangle squareOne;
      // squareOne.translate(5,5);
      // System.out.println("x: " + squareOne.getX());
      // System.out.println("y: " + squareOne.getY());
    }
}