
public class MyInteger {
	private int value ;

	public MyInteger(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public boolean isEven() {
		return (value % 2) == 0 ;
	}
	public boolean isOdd() {
		return (value % 2) != 0 ;
	}
	public boolean isPrime() {
		if(value == 1 || value == 2) {
			return true ;
		}
		else {
		      for (int i = 2 ; i < value ; i++) {
			  if(value % i == 0) {
				    return false ;
			  }
		    }      return true ;
		}
	}
	public static boolean isEven(int newValue) {
		return (newValue % 2) == 0 ;
	}
	public static boolean isOdd(int newValue) {
		return (newValue % 2) != 0 ;
	}
	public static boolean isPrime(int newValue) {
		if(newValue == 1 || newValue == 2) {
			return true ;
		} 
		else {
		      for (int i = 2 ; i < newValue ; i++) {
			  if(newValue % i == 0) {
				    return false ;
			  }
		    }  return true ;
		}
	}
	public boolean isEven(MyInteger value) {
		return value.isEven() ;
	}
	public boolean isOdd(MyInteger value) {
		return value.isOdd() ;
	}
	public boolean isPrime(MyInteger value) {
		return value.isPrime();
	}
	public boolean equals(int value) {
		if(this.value == value) {
			return true ;
		} return false ;
	}
	public boolean equals(MyInteger newValue) {
		if(newValue.value == this.value) {
			return true ;
		} return false ;
	}
	public static int parseInt(char [] value) {
		int sum = 0 ;
		for(int i = 0 ; i < value.length ; i++) {
			sum = sum * 10 + Character.getNumericValue(value[i]);
		} return sum ;
	}
	public static int parseInt(String value) {
		return Integer.parseInt(value);
	}
}