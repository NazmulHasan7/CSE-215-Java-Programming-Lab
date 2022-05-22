package NSU;
import java.util.GregorianCalendar;
public class MyDate {

	private int  year, month, day;
	
	public MyDate() {
		super();
		GregorianCalendar cal = new GregorianCalendar();
		year = cal.get(GregorianCalendar.YEAR);
		month = cal.get(GregorianCalendar.MONTH);
		day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	}
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public MyDate(long elaspedTime) {
		super();
		setDate(elaspedTime);
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
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTimeInMillis(elaspedTime);
		year = cal.get(GregorianCalendar.YEAR);
		month = cal.get(GregorianCalendar.MONTH);
		day = cal.get(GregorianCalendar.DAY_OF_MONTH);
	}

}
