
public class TestTime {
	public static void main(String [] args) {
		
		Time time1 = new Time () ;
		Time time2 = new Time (555550000);
		
		System.out.println("For time 1 : \nHour :"+time1.getHour()+"\nMinutes : "+time1.getMinute()+"\nSeconds : "+time1.getSecond());
		System.out.println("\n\nFor time 2 : \nHour :"+time2.getHour()+"\nMinutes : "+time2.getMinute()+"\nSeconds : "+time2.getSecond());

	}

}