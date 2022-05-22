import java.util.Scanner ;
public class Task5 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of rows : ");
		int rows = input.nextInt();
		
		for(int r = 1 ; r <= rows ; r++) {
			for(int space = rows - r ; space >= 1 ; space--) {
				//creating space 
				System.out.print("  ");
			}
				for(int col = r ; col >=2 ; col--) {
					System.out.print(col+ " ");
				}// printing descending order
				for(int rOW = 1 ; rOW <= r ; rOW++) {
					System.out.print(rOW+ " ");
				}// printing ascending order
				System.out.println(); // new line
			}
	}
}
