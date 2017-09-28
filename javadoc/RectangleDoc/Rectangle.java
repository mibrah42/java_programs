/**
 * Rectangle Class
 *
 * @author Mohamed S. Ibrahim
 * @version 1.00, 27 Sep 2017
 */
public class Rectangle{
  int x,y,w,h;
    /**
     * Constructor method <br>
     * Initializes values to a Rectangle instance
     *
     * @param x integer variable representing position on x-axis
     * @param y integer variable representing position on y-axis
     * @param w integer variable representing width of rectangle
     * @param h integer variable representing height of rectangle
     */
    public Rectangle(int x, int y, int w, int h){
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
    }

    /**
     * Translate rectangle method <br>
     * Translates an instance of a Rectangle using the values provided through parameters 
     *
     *@param x integer variable representing translation on x-axis
     *@param y integer variable representing translation on y-axis
     */
    public void translate(int x, int y){
      this.x += x;
      this.y += y;
    }

    /**
     * Area method
     * Returns area of a Rectangle instance
     */
    public int area(){
      return this.w * this.h;
    }

     /**
     * getPerimeter method
     * returns perimeter of a Rectangle instance
     */
    public int getPerimeter(){
      return 2 * (this.w + this.h);
    }

    /**
     * getWidth method
     * returns the width of a Rectangle instance
     */
   public int getWidth(){
      return this.w;
    }

    /**
     * getHeight method
     * returns height of a Rectangle instance
     */
    public int getHeight(){
      return this.h;
    }

    /**
     * getX method
     * returns the x position of the top left corner of a rectangle instance
     */
    public int getX(){
      return this.x;
    }

    /**
     * getY method
     * returns the y position of the top left corner of a rectangle instance
     */
    public int getY(){
      return this.y;
    }
}