public class Task5 {
	public static void main(String[] args) {
		
		int [] arr = new int [100] ;
		int [] digits = new int [10] ;
		int count = 0 ;
		
		for(int i = 0 ; i < 100 ; i++) {
			arr[i] = (int)(Math.random()*10) ;
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			for(int j = 0 ; j < 100 ; j++) {
				if(i == arr[j]) {
					count++ ;
				}
			}
			digits[i] = count ;
			System.out.println(i+ " found " +digits[i]+ " times.");
			count = 0 ;
		}
	}
}
