package Task1;
import java.util.Scanner ;

public class TestTriangle {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter side1 - side2 - side 3 - Color - isFilled ? \n");
		
		Triangle triangle1 = new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
		input.nextLine();
		triangle1.setColor(input.nextLine());
		triangle1.setFilled(input.nextBoolean());
		
		input.close();
		System.out.println("Triangle   : " +triangle1.toString());
		System.out.println("Created on : " +triangle1.getDateCreated());
		System.out.println("Is Filled? : " +triangle1.isFilled());
		System.out.println("Color      : " +triangle1.getColor());
		System.out.println("Area       : " +triangle1.getArea());
		System.out.println("Preimeter  : " +triangle1.getPerimeter());
	}

}
