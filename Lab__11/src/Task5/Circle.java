package Task5;

public class Circle extends GeometricObject implements Comparable <Circle> {
	private double radius;

	public Circle() {
		super();
		radius = 1.0;
	}
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle : " +super.toString()+ " radius = " +radius+ "]";
	}
	@Override
	public int compareTo(Circle o) {
		if(this.radius > o.getRadius())
			return 1;
		else if(this.radius < o.getRadius())
			return -1;
		else 
			return 0;
	}
	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public double getPerimeter() {
		return Math.PI * radius * 2;
	}
	@Override
	public boolean equals(Object obj) {
		return this.compareTo((Circle)obj) == 0;
	}
	
}
