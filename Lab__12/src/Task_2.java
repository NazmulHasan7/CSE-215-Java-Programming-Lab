
import java.util.*;

public class Task_2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		int [] arr = new int [100];
		for(int i =0 ; i < 100 ; i++) {
			arr[i] = (int)(Math.random()* 100);
		}
		boolean takeInput = true; 
		do {
			try {
			System.out.print("Enter index number : ");
			int index = input.nextInt();
			if(index < 0 || index > 99)
				throw new ArrayIndexOutOfBoundsException("Index Out of bounds");
			
			for(int i = 0 ; i < 100 ; i++) {
				if(i == index) {
					System.out.println("Value is : " +arr[i]);
					takeInput = false;
			   	}
			 }
		  }
		  catch(ArrayIndexOutOfBoundsException ex) {
			  System.out.println("Wrong index. Try again");
			  input.nextLine();
		  }		
		  catch(Exception ex1) {
				System.out.println(ex1.getMessage());
			}
		}while(takeInput);

	}

}
