import java.util.Scanner ;
public class Task6 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter rows : ");
		int line = input.nextInt();
		
		  int number = 0;
		    for (int row = 0; row <= line; row++) {
		        for (int column = 1; column <= line - row; column++) {
		            System.out.printf("    ");
		        }
		        for (int column = 0; column <= row; column++) {
		            number = (int) Math.pow(2, column);
		            System.out.printf("%4d",number);
		        }
		        for (int column = row - 1; column >= 0; column--) {
		            number = (int) Math.pow(2, column);
		            System.out.printf("%4d",number);
		        }
		        System.out.println();
	    }
	}
}

