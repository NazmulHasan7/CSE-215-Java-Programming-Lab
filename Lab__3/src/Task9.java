import java.util.Scanner ;
public class Task9 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the first string : ");
		String S1 = input.nextLine();
		System.out.print("Enter the second string : ");
		String S2 = input.nextLine();
		
		String prefix = "" ;
		for(int i = 0 ; i <S1.length() ; i++) {
			if(S1.charAt(i) == S2.charAt(i))
				prefix += S1.charAt(i);
			else 
				break ;
		}
		if(prefix.length() > 0)
			System.out.println("The common prefix is : "+prefix);
		else 
			System.out.println("No prefix found");
	}
}
