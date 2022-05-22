import java.util.Scanner ;
public class Task4 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter row and column : ");
		int row = input.nextInt();
		int col = input.nextInt();
		double [][] arr = new double [row][col];
		
		System.out.print("Enter elements : ");
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				arr[i][j] = input.nextDouble();
			}
		}
        int[] location = locateLargest(arr) ; 
		System.out.print("\nlargest element location [index] : ");
		
		for(int i = 0 ; i < location.length ; i++) {
			System.out.print(location[i]+" ");
		}
	}
	public static int[] locateLargest(double[][] a) {
		double largest = a[0][0] ;
		int[] largestIndex = {0,0} ;
		for(int i = 0 ; i < a.length ; i++) {
			for(int j = 0 ; j < a[i].length ; j++) {
				
				if(a[i][j] > largest) {
					largest = a[i][j];
					largestIndex[0] = i ;
					largestIndex[1] = j ;
				}
			}
		} return largestIndex ;
	}
}
