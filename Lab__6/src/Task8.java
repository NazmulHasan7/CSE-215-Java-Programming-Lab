import java.util.Scanner;
public abstract class Task8 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter row and column for matrix 1 : ");
		int row1 = input.nextInt();
		int col1 = input.nextInt();
		int [][] arr1 = new int [row1][col1] ;
		
		System.out.println("Enter Matrix : ");
		for(int i = 0 ; i < row1 ; i++) {
			for(int j = 0 ; j < col1 ; j++) {
				arr1[i][j] = input.nextInt();
			}
		}
		
		System.out.print("Enter row and column for matrix 2 : ");
		int row2 = input.nextInt();
		int col2 = input.nextInt();
		int [][] arr2 = new int [row2][col2] ;
		
		System.out.println("Enter Matrix : ");
		for(int i = 0 ; i < row2 ; i++) {
			for(int j = 0 ; j < col2 ; j++) {
				arr2[i][j] = input.nextInt();
			}
		}
		System.out.println(equals(arr1,arr2)? "Arrays are strictly identical." : "Arrays are not strictly identical.");
   }
	public static boolean equals (int[][] m1 ,int [][] m2) {
		if(m1.length != m2.length) {
			return false ;
		}
		for(int row = 0 ; row < m1.length ; row++) {
			for(int col = 0 ; col < m1[row].length ; col++) {
			
			if(m1[row][col] != m2[row][col]) {
				return false ;
			}
		} 
	} return true ;
  }
}

