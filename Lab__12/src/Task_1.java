import java.util.*;

public class Task_1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		boolean check = true;
		do {
			try {
				System.out.print("Enter two integers : ");
				int sum = input.nextInt() + input.nextInt();
				System.out.println("Sum is  : " +sum);
				check = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Invalid input. Try again");
				input.nextLine();
			}
		}while(check);
	}

}
