import java.util.Scanner ;
public class Task9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of sides : ");
		int num = input.nextInt();
		System.out.print("Enter the side : ");
		double side = input.nextDouble();
		
		System.out.println("The area of the pentagon : " +area(num,side));		
	}
	public static double area (int n, double side) {
		return (n*side*side)/(4*Math.tan(Math.PI/n)) ;
    }
}