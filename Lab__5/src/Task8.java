import java.util.Scanner ; 
public class Task8 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter array1 size : ");
		int size1 = input.nextInt();
		int [] arr1 = new int [size1] ;
		
		System.out.print("Enter array2 size : ");
		int size2 = input.nextInt();
		int [] arr2 = new int [size2] ;
		
		System.out.print("Enter first array elements : ");
		for(int i = 0 ; i < size1 ; i++) {
			arr1[i] = input.nextInt();
		}
		System.out.print("Enter second array elements : ");
		for(int i = 0 ; i < size2 ; i++) {
			arr2[i] = input.nextInt();
		}
		System.out.println(equals(arr1,arr2)? "Lists are identical" : "List are not identical");
	}
	public static boolean equals (int [] List1 , int [] List2) {
		
		if(List1.length != List2.length) {
			return false ;
		}
		for(int i = 0 ; i < List1.length ; i++) {
			if(List1[i] != List2[i]) {
				return false ;
			}
		} return true ;
	}
}
