package Task2;

public class Student extends Person {
	private int status ;

	public Student(String name, String address, String phone, String email, int status) {
		super(name, address, phone, email);
		this.status = status;
	}
	public String getStatus() {
		switch(status) {
		case 1 : return "FRESHMAN" ;
		case 2 : return "JUNIOR" ; 
		case 3 : return "SENIOR" ; 
		case 4 : return "SOMPHOMORE" ; 
		default : return "NOT FOUND" ;
		}
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "\n\nStudent : " +super.toString()+ " \nstatus : " +getStatus();
	}
	
}
