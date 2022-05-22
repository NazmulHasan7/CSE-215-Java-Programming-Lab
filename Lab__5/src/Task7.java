import java.util.Scanner ; 
public class Task7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter array size : ");
		int size = input.nextInt();
		int [] arr = new int [size] ;
		
		System.out.print("Enter elements : ");
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(isSorted(arr)? "List is sorted" : "List is not sorted.");
	}
	public static boolean isSorted (int [] List) {
		
		for(int i = 0 ; i < List.length-1 ; i++) {
			if(List[i] > List[i+1]) {
				return false ;
			}
		} return true ;
	}
}
