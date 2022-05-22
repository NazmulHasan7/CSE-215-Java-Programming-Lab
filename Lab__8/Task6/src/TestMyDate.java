
public class TestMyDate {
	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(); 
		MyDate date2 = new MyDate(34355555133101L);
		
		System.out.println("Date1 - Month : "+date1.getMonth()+" Day : "+date1.getDay()+" Year : "+date1.getYear());
		System.out.println("Date2 - Month : "+date2.getMonth()+" Day : "+date2.getDay()+" Year : "+date2.getYear());
	}
	
}
