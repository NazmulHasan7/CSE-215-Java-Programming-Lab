import java.util.Scanner ;
public class Task4 { 
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in) ;
		System.out.print("Enter an integer to get factors : ");
		int number = input.nextInt();
		
		System.out.print("Factors are : ");
		int index = 2 ;
		while(number/index != 1) {
			if(number % index == 0) {
				System.out.print(index+ " ");
				number /= index ;
			}
			else 
				index++;
		}
		System.out.print(number);
	}
}
