
public class Task1 {
	public static void main(String[] args) {
		System.out.println("First 100 pentagonal numbers : ");
		
		int count = 0 ;
		for(int number = 1 ; number <= 100 ; number++) {
			System.out.printf("%-7d",getPentagonalNumber(number));
			count++;
			if(count % 10 == 0) {
				System.out.println();
			}
		}
	}
	
	public static int getPentagonalNumber(int num) {
		return num*(3*num - 1)/2 ; 
	}
}
