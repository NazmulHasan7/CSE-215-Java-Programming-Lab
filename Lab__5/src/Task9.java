import java.util.Scanner ;
public class Task9 {
	public static void main(String [] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the number of values : ");
		int size = input.nextInt();
		int [] arr = new int [size];
		
		System.out.print("Enter values : ");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(isConsecutiveFour(arr)? "List has consecutive four" : "List has no consecutive four");
	}
	public static boolean isConsecutiveFour(int [] values) {
		for(int i = 0 ; i < values.length-1 ; i++) {
			if(values[i] == values[i+1] && 
			   values[i] == values[i+2] && 
			   values[i] == values[i+3] ) {
				return true ;
			}
		} return false ;
	}
}
