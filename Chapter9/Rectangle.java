public class Rectangle implements Shape{
	//Fields
	private double width;
	private double height;

	//Constructors 
	public Rectangle(double width, double height){
		this.width = width;
		this.height = height;
	}

	public Rectangle(){
		this(0, 0);
	}
	
	//Methods 
	public double getArea(){
		return this.width*this.height;
	}
	
	public double getPerimeter(){
		return 2.0*(this.width + this.height);
	}

	public boolean equals(Shape s){
		return s instanceOf Rectangle ? (this.width - s.width < 0.00001d && this.height - s.height < 0.00001d) : false;
	}

}