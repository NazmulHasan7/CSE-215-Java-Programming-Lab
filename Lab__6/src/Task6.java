import java.util.Scanner ;
public class Task6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter row and column : ");
		int row = input.nextInt();
		int col = input.nextInt();
		int [][] arr = new int [row][col] ;
		
		System.out.println("Enter elements : ");
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		shuffle(arr);
		System.out.println("Shuffled array : ");
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				System.out.print(arr[i][j] +" ");
			} 
			System.out.println();
		}
	}
	public static void shuffle(int[][] m) {
		int randRow ;
		for(int i = 0 ; i < m.length ; i++) {
			for(int j = 0 ; j < m[i].length ; j++) {
				
				do {
					randRow = (int)(Math.random()*m.length);
				}while(randRow == i);
			int [] temp = m[i] ;
			m[i] = m[randRow] ;
			m[randRow] = temp ;
	 	}
	 }
  }
}


