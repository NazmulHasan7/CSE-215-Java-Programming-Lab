import java.util.Scanner ;
public class Task7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int sum = 0 , count = 0 , number ;
		double average = 0 ;
		
		System.out.print("Enter number : ");
		do {
		    number = input.nextInt();
			sum+= number ;
			count++ ; 
		}while(number!=0) ;
		
		average = (double)sum / (count-1);
		System.out.println("Sum : " +sum+ "\nAverage : " +average);
	}
}
