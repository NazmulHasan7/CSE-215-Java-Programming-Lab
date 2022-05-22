package Task2;

public class Employee extends Person {
	private String office ;
	private double salary ;
	private MyDate dateHired ;
	
	public Employee(String name, String address, String phone, String email, String office, double salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = new MyDate();
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDateHired() {
		return dateHired.getMonth() + "/" + dateHired.getDay() 
		 + "/" + dateHired.getYear();
	}
	@Override
	public String toString() {
		return "\n\nEmployee : " +super.toString()+ "\noffice : " + office + ", \nsalary : " + salary + ", \ndateHired :" + getDateHired();
	}

}
