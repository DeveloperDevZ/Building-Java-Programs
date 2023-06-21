public class Point{
	//Fields 
	int x; 
	int y;

	//Constructor 
	public Point(int x, int y){
		setLocation(x, y);
	}
		
	public Point(){
		this(0, 0);
	}

	//Instance Methods 
	public double distanceFromOrigin(){
		return Math.sqrt(x*x + y*y);
	}
	
	public void translate(int dx, int dy){
		this.x += dx;
		this.y += dy;
	}

	public String toString(){
		return "(" + this.x + ", " + y + ")";
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}
	
	public setLocation(int x, int y){
		this.x = x;
		this.y = y;
	}

	//Additional Methods
 
	public int quadrant(){
		if(y >= 0){
			if(x >= 0){
				return 1;
			}	
			return 2;
		}else{
			if(x >= 0){
				return 4;
			}
			return 3;	
		}
	}

	public void flip(){
		int temp = -this.x;
		this.x = -this.y;
		this.y = temp;
	}
	
	public int manhattanDistance(Point other){
		return (int) Math.sqrt(this.x*this.x + this.y*this.y);
	}
	
	public boolean isVertical(Point other){
		return this.x == other.x;
	}

	public double slope(Point other){
		if(this.x == other.x){
			throw new IllegalArgumentException("Infinite Slope");
		}
		return ((this.y - other.y)*1.0)/((this.x - other.x)*1.0);
	}

	public boolean isCollinear(Point p, Point q){
		double eps = 0.00000001d;
		return Math.abs(slope(p, this) - slope(q, this)) < eps;  
	}

	public int compareTo(Point other){
		if(this.y != other.y){
			return this.y - other.y;
		}else{
			return this.x - other.x;
		}
	}

	
}
