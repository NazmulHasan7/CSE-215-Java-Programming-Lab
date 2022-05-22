package Task3;
import java.util.Scanner;

public class Test {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		GeometricObject [] squareList = new GeometricObject [5];
		
		for(int i = 0 ;  i < 5 ; i++) {
			System.out.println("Enter square side : ");
			squareList[i] = new Square (input.nextInt());
			Square sq = (Square)squareList[i];
			
			System.out.println("Area = " +sq.getArea());
			System.out.println(sq.howToColor());
			
		}
	}

}
