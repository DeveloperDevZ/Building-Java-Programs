public class Circle{
	//Fields 
	private double radius;

	//Constructors 
	public Circle(double radius){
		this.radius = radius;
	}
	
	public(){
		this(0);
	}
	
	//Methods
 	public getArea(){
		return Math.PI*radius*radius;
	}	
 
	public getPerimeter(){
		return 2.0*Math.PI*radius;
	}

	public boolean equals(Shape s){
		return (s instanceOf Circle) ? (this.radius - s.radius < 0.00001d) : false; 
	}
}