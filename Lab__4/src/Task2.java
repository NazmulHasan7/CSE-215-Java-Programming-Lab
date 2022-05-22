import java.util.Scanner ;
public class Task2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter number : ");
		int number = input.nextInt();
		
		System.out.print("Sum of digits for " +number+ " is " +sumDigits(number));
	}
   public static int sumDigits (int n) {
	   int sum = 0 ;
	   while(n!=0) {
		   sum+= (n % 10) ;
		   n /= 10 ;
	   }
	   return sum ;
   }
}
