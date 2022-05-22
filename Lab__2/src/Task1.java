
import java.util.Scanner ;
public class Task1 {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a : ");
		double a = input.nextDouble();
		System.out.print("Enter b : ");
		double b = input.nextDouble();
		System.out.print("Enter c : ");
		double c = input.nextDouble();
		
		double discriminant = ((b*b) - (4*a*c)) ;
		
		if(discriminant > 0) {
			double r1 = (-b + Math.sqrt(discriminant))/(2*a);
			double r2 = (-b - Math.sqrt(discriminant))/(2*a);
			System.out.println("Root 1 : " +r1+ "\nRoot 2 : "+r2);
		}
		else if (discriminant < 0) {
			System.out.println("There is no real root.");
		}
		else 
			System.out.println("Root : " +(-b/(2*a)));
	}
}
