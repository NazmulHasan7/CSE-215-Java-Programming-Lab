
public class TestRectangle {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(3.5,35.9);
		r1.width = 4 ;
		r1.height = 40 ;
		  
		System.out.println("Area of rectangle 1 is :" +r1.getArea()+ "\nPerimeter of rectangle 1 : " +r1.getPerimeter());
		System.out.println("\nArea of rectangle 2 is :" +r2.getArea()+ "\nPerimeter of rectangle 2 : " +r2.getPerimeter());	
	}
}
