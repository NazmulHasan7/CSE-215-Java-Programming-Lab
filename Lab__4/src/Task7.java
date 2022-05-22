import java.util.Scanner ;
public class Task7 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter three sides of triangle : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if(!isValid(a,b,c)) {
			System.out.println("Wrong input.");
			System.exit(1);
		}
		System.out.println("Area of the triangle : " +area(a,b,c));
	}
	
	public static boolean isValid(double side1, double side2, double side3) {
		if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
			return true ;
		}
		return false ; 
	}
	
	public static double area (double side1, double side2, double side3) {
		double s = side1 + side2 + side3 ;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area ;
	}
}
