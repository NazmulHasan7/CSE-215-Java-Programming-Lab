package Task2;

public class Faculty extends Employee{

	private String OfficeHour ;
	private String rank ;
	
	public Faculty(String name, String address, String phone, String email, String office, double salary, String officeHour, String rank) {
		super(name, address, phone, email, office, salary);
		OfficeHour = officeHour;
		this.rank = rank;
	}
	public String getOfficeHour() {
		return OfficeHour;
	}
	public void setOfficeHour(String officeHour) {
		OfficeHour = officeHour;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "\n\nFaculty : "+super.toString()+ "\nOfficeHour : " + OfficeHour + ", \nrank : " + rank ;
	}
	
}
