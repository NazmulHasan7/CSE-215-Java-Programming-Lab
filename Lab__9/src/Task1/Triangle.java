package Task1;

public class Triangle extends GeometricObject{
	private double side1 , side2 , side3 ;

	public Triangle() {
		super();
		side1 = side2 = side3 = 1 ;
	}
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double getSide1() {
		return side1;
	}
	public double getSide2() {
		return side2;
	}
	public double getSide3() {
		return side3;
	}
	public double getArea() {
		double S = (side1 + side2 + side3) / 2.0 ;
		return Math.sqrt(S * (S -side1) * (S -side2) * (S -side3)) ; 
	}
	public double getPerimeter() {
		return side1 + side2 + side3 ;
	}
	@Override
	public String toString() {
		return "Triangle [side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3 + "]";
	}

}
