import java.util.Scanner;
public class Task1 {
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
		System.out.println("Sum of columns :  ");
		for(int column = 0 ; column < arr[0].length ; column++) {
			System.out.println("Sum of elements of column " + (column+1) + " is " +sumColumn(arr,column));
		}
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0 ;
		for(int row = 0 ; row < m.length ; row++) {
			sum+= m[row][columnIndex] ;
		}  return sum ;
	}
}