import java.util.Scanner;
public abstract class Task7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter row and column : ");
		int row = input.nextInt();
		int col = input.nextInt();
		double [][] arr = new double [row][col] ;
		
		System.out.println("Enter Matrix : ");
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				arr[i][j] = input.nextDouble();
			}
		}
		System.out.println(isMarkovMatrix(arr)? "Is a Markov matrix." : "Not a Markov matrix.");
   }
	public static boolean isMarkovMatrix (double[][] m) {
		for(int col = 0 ; col < m[0].length ; col++) {
			double sum = 0 ;
			for(int row = 0 ; row < m.length ; row++) {
				sum+= m[row][col];
			}
			if(sum != 1) {
				return false ;
			}
		} return true ;
	}
}

