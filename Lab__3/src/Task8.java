import java.util.Scanner ;
public class Task8 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter initial deposit amount : ");
		double amount = input.nextDouble();
		System.out.print("Enter annual percentage yield : ");
		double rate = input.nextDouble();
		System.out.print("Enter maturity period [months] : ");
		int month = input.nextInt();
		
		System.out.println("\nMonth CD Value : ");
		
		for(int i = 1 ; i <= month ; i++) {
			amount = amount + (amount * rate) / 1200.0;
			System.out.println(i+ " " +amount);
		}
	}
}
