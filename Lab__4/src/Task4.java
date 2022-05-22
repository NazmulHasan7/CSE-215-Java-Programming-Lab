import java.util.Scanner ; 
public class Task4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter three numbers : ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		displaySortedNumbers(number1,number2,number3);
	}
	public static void displaySortedNumbers(double num1,double num2,double num3) {
		if(num1 >num2 && num1 > num3) {
			if(num2 > num3) 
				System.out.println("Sorted numbers : " +num1+ " " +num2+ " " +num3);
			else 
				System.out.println("Sorted numbers : " +num1+ " " +num3+ " " +num2);
		}
		else if(num2 >num1 && num2 > num3) {
			if(num1 > num3) 
				System.out.println("Sorted numbers : " +num2+ " " +num1+ " " +num3);
			else 
				System.out.println("Sorted numbers : " +num2+ " " +num3+ " " +num1);
		}
		else {
			if(num1 > num2) 
				System.out.println("Sorted numbers : " +num3+ " " +num1+ " " +num2);
			else 
				System.out.println("Sorted numbers : " +num3+ " " +num2+ " " +num1);
		}
	}
}
