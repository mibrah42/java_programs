public class Point {
	private int x;
	private int y;

	public Point(int xcoordinate, int ycoordinate) {
		this.x = xcoordinate;
		this.y = ycoordinate;
	}

	public boolean equals(Point point) {
		if(this.x == point.x && this.y == point.y){
			return true;
		} else {
			return false;
		}
	}

	// public void add(Point p) {
	// 	this.x += p.x;
	// 	this.y += p.y;
	// }

	public static void main(String[] args) {
		Point p1 = new Point(5, 7);
		Point p2 = new Point(5, 7);
		System.out.println(p1.equals(p2));
	}

}
