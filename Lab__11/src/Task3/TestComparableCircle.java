package Task3;

public class TestComparableCircle {
	public static void main(String[] args) {
		
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(5);
		Circle c3 = new Circle(10);
		
		System.out.println("Circle1 equals to Circle2 ? " +c1.equals(c2));
		System.out.println("Circle1 equals to Circle3 ? " +c1.equals(c3));
		System.out.println("Circle2 equals to Circle3 ? " +c2.equals(c3));
	}

}
