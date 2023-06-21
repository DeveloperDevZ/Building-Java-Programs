public Triangle implements Shape{
	//Fields 
	private double a;
	private double b;
	private double c;

	//Constructors 
	public Triangle(double a, double b, double c){
		this.a = a;
		this.b = b; 
		this.c = c;
	}

	public Triangle(){
		this(0, 0, 0);
	}
	//Methods
	public getArea(){
		double s = this.getPerimeter()/2.0;
		return 1/2.0(s*(s - a)*(s - b)*(s - c));
	} 
	
	public getPerimeter(){
		return a + b + c;
	}

	public boolean equals(Shape s){
		return s instanceOf Triangle ? (this.a == s.a || this.a == s.b || this.a == s.c) && (this.a*this.b*this.c == s.a*s.b*s.c) && this.getPerimeter == s.getPerimeter;
	}
	
}