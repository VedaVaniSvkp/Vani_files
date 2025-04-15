package tnsif.practicalquestions;

public class Circle {
	int radius;
	

	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	
	public double area() {
		double area = 3.14*(radius)*(radius);
		return area;
	}

	public static void main(String[] args) {
		Circle area1 = new Circle(25);		
		System.out.println("Area of circle: "+area1.area());
	}

}
