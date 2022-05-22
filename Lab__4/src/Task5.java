import java.util.Scanner ;
public class Task5 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the amount invested : ");
		double amount = input.nextDouble();
		System.out.print("Enter annual interest rate : ");
		double rate = input.nextDouble();
		
		double total = 0 ;
		System.out.println("Years Future Value : ");
		for(int years = 1 ; years <= 30 ; years++) {
			System.out.println(years+ "  " +futureInvestmentValue(amount,rate/1200,years));
		}// monthly rate = ( annual rate / 12 * 100.0) 
	}
	public static double futureInvestmentValue(double investmentAmount ,double monthlyInterestRate, int years) {
		return investmentAmount*(Math.pow((1 + monthlyInterestRate),(years*12)));
	}
}
