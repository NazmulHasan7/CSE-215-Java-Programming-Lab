package Task1;
import java.util.Scanner;

public class TestTriangle {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Triangle tri = new Triangle();
		
		System.out.println("Enter three sides of Triangle : ");
		tri.setSide1(input.nextDouble());
		tri.setSide2(input.nextDouble());
		tri.setSide3(input.nextDouble());
		
		input.nextLine();
		System.out.println("Enter color : ");
		tri.setColor(input.nextLine());
		
		System.out.println("IsFilled : ");
		tri.setFilled(input.nextBoolean());
		
		System.out.println("Area : " +tri.getArea()+ "\nPerimeter : " +tri.getPerimeter()+ "\nColor : " +tri.getColor()+ "\nIsFilled? " +tri.isFilled());
		
		System.out.println("\n\n" +tri.toString());

	}

}
