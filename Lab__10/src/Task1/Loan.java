package Task1 ;

public class Loan {
	private double annualInterestRate ;
	private int numberOfYears ;
	private double loanAmount ;
	private java.util.Date loanDate ;
	
	public Loan() {
		super();
		loanDate = new java.util.Date(); 
	}
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
		super();
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public int getNumberOfYears() {
		return numberOfYears;
	}
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public java.util.Date getLoanDate() {
		return loanDate;
	}
	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200 ;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1- (1/ Math.pow(1 + monthlyInterestRate, numberOfYears * 12))) ;
		return monthlyPayment ;
	}
	public double getTotalPayment() {
		return getMonthlyPayment() * numberOfYears * 12 ;
	}
	@Override
	public String toString() {
		return "Loan [annualInterestRate = " + annualInterestRate + ", numberOfYears = " + numberOfYears + ", loanAmount = "
				+ loanAmount + ", loanDate = " + loanDate + "]";
	}

}
