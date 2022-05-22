import java.util.Scanner;
public class Task3 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner (System.in);
		int [] array = new int [10];
		int count = 0 , number ;
		System.out.print("Enter array elements : ");
		
		for(int i = 0 ; i < 10 ; i++) {
			number = input.nextInt();
			
			if(isDistinct(array,number)) {
				array[count] = number ;
				count++ ;
			}
		}
		System.out.println("Total distinct numbers : " +count);
		System.out.print("Distinct numbers : ");
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] > 0) {
				System.out.print(" " +array[i]);
			}
		}
	}
	public static boolean isDistinct (int [] arr , int num) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(num == arr[i]) {
				return false ;
			}
		}
		return true ;
	}
}