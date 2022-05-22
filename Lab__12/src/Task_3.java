import java.util.Scanner;

public class Task_3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		String bin;
		
		try {
			System.out.print("Enter any binary number : ");
			bin = input.next();
			System.out.println("Decimal value is : " +binToDec(bin));
		}
		catch(NumberFormatException ex) {
			System.out.println("Invalid input.");
		}

	}

public static int  binToDec(String bin) throws NumberFormatException{
		int dec = 0;
		for(int i =0 , j = bin.length()-1 ; i <bin.length(); i++,j--) {
			if(bin.charAt(i) != '0' && bin.charAt(i)!= '1')
				throw new NumberFormatException("Invalid");
			
			dec += Integer.parseInt(String.valueOf(bin.charAt(i))) * Math.pow(2,j);
		}
		return dec;
	}

}
