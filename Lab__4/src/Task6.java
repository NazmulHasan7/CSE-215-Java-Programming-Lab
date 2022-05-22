import java.util.Scanner ;
public class Task6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter n : ");
		int n = input.nextInt();
		
		printMatrix(n);
	}
	public static void printMatrix (int n) {
		for(int row = 1 ; row <= n ; row++) {
			for(int col = 1 ; col <=n ; col++) {
				
				System.out.printf("%3d",(int)(Math.random()*2));
			} 
			System.out.println();
		}
	}
}
