import java.util.Scanner ;
public class Task2 {
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
		System.out.print("Sum of major diagonal : " +sumMajorDiagonal(arr));
	}
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0 ;
		for(int i = 0 ; i < m.length ; i++) {
			for(int j = 0 ; j < m[i].length ; j++) {
				if( i == j ) {
					sum+= m[i][j] ;
				}
			}
		} return sum ;
	}
}
