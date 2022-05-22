public class Account {
	
	private int id = 0;
	private double balance = 0 ;
	private double annualInterestRate = 0 ;
	private java.util.Date dateCreated = new java.util.Date();
	
	public Account() {
		dateCreated = new java.util.Date() ;
	}
	public Account(int newId , double newBalance) {
		id = newId ;
		balance = newBalance ;
	}
	public int getId() {
		return id;
	}
	public void setId(int newId) {
		id = newId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100.0) / 12.0 ;
	}
	public double getMonthlyInterest () {
		return balance * getMonthlyInterestRate() ;
	}
	public void withdraw (double amount) {
		balance-= amount ;
	}
	public void deposit (double amount) {
		balance+= amount ;
	}
	public String getDateCreated () {
		return dateCreated.toString();
	}
}