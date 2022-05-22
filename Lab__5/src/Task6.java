import java.util.Scanner ;
public class Task6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter array size : ");
		int size = input.nextInt();
		
		double [] arr = new double [size];
		System.out.print("Enter array elements : ");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextDouble();
		}
		System.out.println("Average of the array elements are : " +average(arr));
	}
	public static int average (int [] array) {
		int sum = 0 ;
		for(int i = 0 ; i < array.length ; i++) {
			sum+= array[i] ;
		}
		return sum / array.length ;
	}
	public static double average (double [] array) {
		double sum = 0 ;
		for(int i = 0 ; i < array.length ; i++) {
			sum+= array[i] ;
		}
		return sum / array.length ;
	}
}
