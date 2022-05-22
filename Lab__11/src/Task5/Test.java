package Task5;

public class Test {
	public static void main(String[] args) {
		
		GeometricObject [] list = new GeometricObject[4];
		
		list[0] = new Circle(5);
		list[1] = new Circle(2);
		list[2] = new Rectangle(5, 3);
		list[3] = new Rectangle(1, 2);
		
		System.out.println("Total area : " +sumArea(list));
	
	}
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for(int i = 0 ; i < a.length ; i++) {
			sum+= a[i].getArea();
		}
		return sum;
	}

}
