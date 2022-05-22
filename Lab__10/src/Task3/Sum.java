package Task3;
import java.util.Scanner ;
import java.util.ArrayList ;

public class Sum {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		ArrayList<Double> list = new ArrayList<>();
		
		System.out.println("Enter 5 values : ");
		for(int i = 0 ; i < 5 ; i++) {
			list.add(input.nextDouble());
		}
		
		System.out.println("Sum is : " +sum(list));

	}
	public static double sum(ArrayList<Double> list) {
		double sum = 0 ;
		for(int i = 0 ; i < 5 ; i++) {
			sum+= list.get(i); 
		}
		return sum ;
	}
	
}
