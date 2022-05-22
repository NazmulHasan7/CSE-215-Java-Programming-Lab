package Task5;

public class Rectangle extends GeometricObject implements Comparable <Rectangle> {
	private double height , width;

	public Rectangle() {
		super();
		height = 1;
		width = 1;
	}
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}
	public Rectangle(String color, boolean filled, double height, double width) {
		super(color, filled);
		this.height = height;
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double getArea() {
		return height * width;
	}
	@Override
	public double getPerimeter() {
		return 2 * (height + width);
	}
	@Override
	public int compareTo(Rectangle o) {
		if(this.getArea() > o.getArea())
			return 1;
		else if(this.getArea() < o.getArea())
			return -1;
		else  
			return 0;
	}
	@Override
	public boolean equals(Object obj) {
		return this.compareTo((Rectangle)obj) == 0;
	}
	@Override
	public String toString() {
		return "Rectangle : " +super.toString()+ " height = " +height+ ", width = " +width+ "]";
	}
	
}
