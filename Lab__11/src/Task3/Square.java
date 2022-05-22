package Task3;

public class Square extends GeometricObject implements Colorable{
	private double side;

	public Square() {
		super();
		side = 1.0;
	}
	public Square(double side) {
		super();
		this.side = side;
	}
	public Square(String color, boolean filled, double side) {
		super(color, filled);
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	@Override
	public String toString() {
		return "Square : " +super.toString()+ " side = " +side+ "]";
	}
	@Override
	public double getArea() {
		return side * side;
	}
	@Override
	public double getPerimeter() {
		return side * 4;
	}
	@Override
	public String howToColor() {
		return " Color all four sides.";
	}
	
}
