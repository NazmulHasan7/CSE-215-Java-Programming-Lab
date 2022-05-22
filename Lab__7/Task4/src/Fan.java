
public class Fan {
	public final int SLOW ;
	public final int MEDIUM  ;
	public final int FAST ;
	
	private int speed ;
	private boolean on ;
	private double radius ;
    public String color ;
	
	public Fan() {
		SLOW = 1 ;
		MEDIUM =2 ;
		FAST = 3 ;
		speed = SLOW ;
		on = false ;
		radius = 5 ;
		color = "blue" ;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int neWspeed) {
		speed = neWspeed;
	}
	public boolean isOn() {
		return on;
	}
	public void setOn(boolean neWon) {
		on = neWon;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double neWradius) {
		radius = neWradius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String neWcolor) {
		color = neWcolor;
	}
	public String toString () {
		if(on) {
			return "Fan [ Speed : "+speed+ ", Radius : "+radius+ ", Color : "+color+ " ]" ;
		}
		else {
		return " Fan [ radius : " +radius+ " Color : " +color+ " ] the fan is off " ;  
		}
	}
}
