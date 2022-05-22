import java.util.Calendar ;
import java.util.GregorianCalendar ; //importing GregorianCalender class

public class MyDate {
	private int year ;
	private int month ;
	private int day ;
	
	public MyDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		year = calendar.get(GregorianCalendar.YEAR);
		month = calendar.get(GregorianCalendar.MONTH);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
	public MyDate(long elaspedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elaspedTime);
		year = calendar.get(GregorianCalendar.YEAR);
		month = calendar.get(GregorianCalendar.MONTH);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	public void setDate(long elaspedTime) {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elaspedTime);
		year = calendar.get(GregorianCalendar.YEAR);
		month = calendar.get(GregorianCalendar.MONTH);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
}
