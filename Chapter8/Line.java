public class Line{

	//Fields 
	private Point p;
	private Point q;

	//Constructors 
	Line(Point p, Point q){
		this.p = p;
		this.q = q;
	}

	Line(Point p){
		this(p, Point(0, 0));
	}
	
	Line(){
		this(Point(0, 0), Point(0, 0));
	}

	Line(int x1, int y1, int x2, int y2){
		this(Point(x1, y1), Point(x2, y2));
	}

	//Methods 
	public Point getP1(){
		return this.p;
	}

	public Point getP2(){
		return this.q;
	}

	public String toString(){
		return "[(" + this.p.x + ", " + this.p.y + "), (" + this.q.x + ", " + this.q.y + ")]";
	}

	public double getSlope(){
		if(this.p.x == this.q.x){
			throw new IllegalArgumentException;
		}

		return (this.p.y - this.q.y)/(this.p.x - this.q.x);
	}
	
	public boolean isCollinear(Point r){
		double eps = 0.0000001d;
		return 	Math.abs(this.slope() - p.slope(r)) < eps;
	}

}