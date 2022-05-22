import java.util.Scanner ;
public class Task3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int [][] Matrix = new int [4][4] ;
		System.out.print("Enter matrix elemenst : ");
		
		for(int row = 0 ; row < 4 ; row++) {
			for(int col = 0 ; col < 4 ; col++) {
				Matrix[row][col] = (int)(Math.random()*2);
			}
		}
        System.out.println("Matix : ");
		
		for(int row = 0 ; row < 4 ; row++) {
			for(int col = 0 ; col < 4 ; col++) {
				System.out.print(Matrix[row][col] +" ");
			} System.out.println();
		}
		System.out.println("largest column : " +largestColumnIndex(Matrix,4));
		System.out.println("largest row : " +largestRowIndex(Matrix,4));
	}
	public static int largestRowIndex (int [][] arr , int row) {
		int largestRow = 0 ,rowSum = 0 ;
		for(int rowS = 0 ; rowS < row ; rowS++) {
			int sum = 0 ;
			for(int colS = 0 ; colS < arr[rowS].length ; colS++) {
				sum+= arr[rowS][colS] ;
			}
			if(sum > rowSum) {
				rowSum = sum ; 
				largestRow = rowS ;
			}
		} return largestRow ;
	}
	public static int largestColumnIndex (int [][] arr , int col) {
		int largestCol = 0 ,colSum = 0 ;
		for(int colS = 0 ; colS < arr[0].length ; colS++) {
			int sum = 0 ;
			for(int rowS = 0 ; rowS < arr.length ; rowS++) {
				sum+= arr[rowS][colS] ;
			}
			if(sum > colSum) {
				colSum = sum ; 
				largestCol = colS ;
			}
		} return largestCol ;
	}
}
