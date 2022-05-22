import java.util.Scanner ;
public class Task3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter an integre to check palindrome : ");
		int number = input.nextInt();
		number = Math.abs(number);
		
		System.out.println(number+ " "+(isPalindrome(number)? "is Palindrome" : "is not Palindrome"));
	}
	public static int reverse (int number) {
		int rev = 0 , rem = 0 ;
		while(number!=0) {
			rem = number % 10 ;
			rev = rev*10 + rem ;
			number /= 10 ;
		}
		return rev ;
	}
	public static boolean isPalindrome (int number) {
		if(number == reverse(number))
			return true ;
		return false ; 
	}
}
