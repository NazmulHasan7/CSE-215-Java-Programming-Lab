package Task2;

public class TestPerson {
	public static void main(String[] args) {
		
		Person person = new Person("Nazmul", "Uttara 1230 , Dhaka", 
				"01724889172", "nazmul.hasan7@northsouth.edu");

			Student student = new Student("Bithi", "Uttara sector 7 , Dhaka", "01700000000", 
				"bithi085@gnail.com", 3);

			Employee employee = new Employee("Mr ABC ", "34 West street", "6189999999",
				"ABC@borthsouth.edu", "SAC 990", 60000);

			     Faculty faculty = new Faculty("Dr. XYZ", "28 Well street", "4133333333",
				 "dr.xyz@gmaill.com", "NAC 1010", 110000, "4pm to 6pm", "Professor");

			     Staff staff = new Staff("Tom", "90 Country road", "2030000000",
				 "tomcat@aol.com", "LIB 701", 65000, "Executive Assistant");

			// Invoke toString of Person, Student, Employee, Faculty and Staff
			System.out.println(person.toString());
			System.out.println(student.toString());
			System.out.println(employee.toString());
			System.out.println(faculty.toString());
			System.out.println(staff.toString());
		}
	
}

