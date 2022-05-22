public class Task4 {
	public static void main (String[] args) {
		
		final int NUMBEROFPRIMES = 50 ;
		int number = 3 ;
		boolean flag = true ;
		
		System.out.print("First " +NUMBEROFPRIMES+ " prime numbers are : 2 ");
		for(int i = 2 ; i < NUMBEROFPRIMES ; ) {
			for(int j = 2 ; j < Math.sqrt(number) ; j++) {
				
				if(number % j == 0) {
					flag = false ;
					break ;
				}
			}
			if(flag) {
				System.out.print(number+ " ");
				i++ ;
			}
			number++ ; 
			flag = true ;
		}
	}
}