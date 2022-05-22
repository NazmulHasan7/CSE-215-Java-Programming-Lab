import java.util.Scanner ;
public class Task5 {
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
		sort(arr);
		System.out.println("Sorted array : ");
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				System.out.print(arr[i][j] +" ");
			} 
			System.out.println();
		}
	}
	public static int [][] sort(int m[][]) {
		
		for(int i = 0 ; i < m.length ; i++) {
			for(int j = 0 ; j < m.length -1 ; j++) {
				
				if(m[j][0] > m[j+1][0]) {
					
					int temp = m[j][0]  ;
					int temp1 = m[j][1] ;
					m[j][0] = m[j+1][0] ;
					m[j][1] = m[j+1][1] ;
					m[j+1][0] = temp ;
					m[j+1][1] = temp1 ;
				}
				
				if(m[j][0] == m[j+1][0]) {
					
					if(m[j][1] > m[j+1][1]) {
						int temp = m[j][1] ;
						m[j][1] = m[j+1][1] ;
						m[j+1][1] = temp ;
					}
				}
			}
		} 
		return m ;
	}
}
