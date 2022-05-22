
public class Time {
	public int Hour ; 
	public int Minute ;
	public int Second ;
	public long Time ;
	
	public Time() {
		Time = System.currentTimeMillis();
	}
	public Time(long time) {
		Time = time ; 
	}
	public Time(int hour, int minute, int second) {
		Hour = hour;
		Minute = minute;
		Second = second;
	}
	public int getHour() {
		return (int)(Time / (1000 * 60 * 60)) % 24 ;
	}
	public int getMinute() {
		return (int)(Time / (1000 * 60)) % 60 ;
	}
	public int getSecond() {
		return (int)(Time / 1000) % 60 ;
	}
	public void setTime (long elaspeTime) {
		Time = elaspeTime ;
	}
}
