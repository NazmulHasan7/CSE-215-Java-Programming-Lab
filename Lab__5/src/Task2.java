import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int size = 0 , inputElement ;
		int [] arr = new int [100] ;
		System.out.print("Enter array elements [positive] : ");
		do {
			inputElement = input.nextInt();
			arr[size] = inputElement ;
			size++;
		} while(inputElement!=0);
		
		input.close();
		countOccurence(arr,size-1);
	}
	public static void countOccurence(int [] Arr , int size) {
		for(int i = 1 ; i <= 100 ; i++) {
			int count = 0 ;
			for(int j = 0 ; j < size ; j++) {
				if(Arr[j] == i) {
				count++ ; 
				}
			}
			if(count!= 0) {
				System.out.println(i+" occurs " +count+ " times");
			}
		}
	}
}
