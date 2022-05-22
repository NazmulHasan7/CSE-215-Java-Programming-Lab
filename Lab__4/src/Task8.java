import java.util.Scanner ;
public class Task8 {
	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	System.out.print("Enter milliseconds : ");
	long millisecond = input.nextLong();
	
	System.out.println("Hours : Minutes : Seconds : " +convertMillis(millisecond));
	}
	
	public static String convertMillis (long millis) {
		String time  = "" ;
		long second = millis / 1000 ;
		long minute = second / 60 ;
		long remSec = second % 60 ;
		long remMin = minute % 60 ;
		long hour = minute / 60 ;
		
		time = hour + " : " + remMin + " : " + remSec;
		return time ;
	}
}
