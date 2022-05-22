import java.util.Scanner; 
public class Task1 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = input.nextInt();
		System.out.print("Enter array elements : ");
		
		int [] array = new int [size];
		for(int i = 0 ; i < size ; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		
		int [] rev = new int [size];
		rev = reverseArray (array,size);
		System.out.print("Reverse array : ");
		printArray(rev,size);
	}
	public static int[] reverseArray (int [] arr,int size) {
		int [] reverse = new int [size];
		for(int i = 0 , j = size -1 ; i < size ; i++ , j--) {
			reverse[j] = arr[i] ;
		}
		return reverse ;
	}
	public static void printArray (int [] arr , int size) {
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
