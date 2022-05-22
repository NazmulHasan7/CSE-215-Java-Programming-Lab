
import java.util.Scanner ; 
public class Task4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integer to check palindrome : ");
		int number = input.nextInt();
		
		int temp = number ;
		int remainder = 0 , reverse = 0 ;
		while(temp!=0) {
			remainder = temp % 10 ;
			reverse = reverse * 10 + remainder ;
			temp /= 10 ;
		}
		if(reverse == number)
			System.out.println(number+" is palindrome");
		else 
			System.out.println(number+" is not palindrome");
	}
}
