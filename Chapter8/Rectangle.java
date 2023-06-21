public class Rectangle{

	//Fields 
	int x;
	int y;
	int width;
	int height;

	//Constructor 
	Rectangle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	Rectangle(Point p, int width, int height){
		this(p.x, p.y, width, height);
	}

	//Methods 
	public int getHeight(){
		return this.height;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getX(){
		return this.x;
	}

	public int getY(){
		return this.y;
	}

	public String toString(){
		return "Rectangle[x=" + this.x + ", y=" + this.y + ", width=" this.width + " height=" + this.height + "]";
	}

	public boolean contains(int x, int y){
		return (this.x + width >= x && x >= this.x) && (this.y >= y && y >= this.y - height);
	}
	
	public boolean contains(Point r){
		return contains(r.x, r.y);
	}

	public Rectangle union(Rectangle other){
		Rectangle union;
		//Check for mutual containment 
		if(this.contains(other)){
			return this;
		}else if(other.contains(this)){
			return other;
		}
		
		//Check for Point containment 
		if(this.contains(other.x, other.y){
			union.x = this.x;
			union.y = this.y;
	
			if(this.width >= other.width){
				union.width = this.width;
			}else{
				union.width = (other.width + other.x) - this.x;
			}

			if(this.height >= other.height){
				union.height = this.height;
			}else{
				union.height = this.y - (other.height + other.y);
			}
			return union;
		}
		else if(other.contains(this.x, this.y){
			union.x = other.x;
			union.y = other.y;
	
			if(other.width >= this.width){
				union.width = other.width;
			}else{
				union.width = (this.width + this.x) - other.x;
			}

			if(other.height >= this.height){
				union.height = other.height;
			}else{
				union.height = other.y - (this.height + this.y);
			}
			return union;
		}

		//Neither point containment nor mutual containment 
		if(this.x <= other.x){
			union.x = this.x;
			union.width = this.width + other.x - (this.width) + other.width;
		}else{
			union.x = other.x;
			union.width = other.width + this.x - (other.width) + this.width;
		}

		if(this.y >= other.y){
			union.y = this.y;
			union.height = this.height + ((this.y - this.height) - other.y) + other.height;
		}else{
			union.y = other.y;
			union.height = other.height + ((other.y - other.height) - this.y) + this.height;
		}
		
		return union;
	
	}

	public Rectangle intersection(Rectangle other){

	}

	public boolean contains(Rectangle other){
		return this.contains(other.x, other.y) && other.x + other.width < this.x + this.width && other.y - other.height > this.y - this.height;
	}


}