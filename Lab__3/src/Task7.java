import java.util.Scanner;
public class Task7 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the year : ");
		int year = input.nextInt();
		System.out.print("Enter the first day of the year : ");
		int day = input.nextInt();
		
		int numberOfDays = 0 ;
		for(int month = 1 ; month <= 12 ; month++) {
			switch(month) {
				case 1 : numberOfDays = 31 ;
				System.out.print("1st January " +year+ " is " +dayName(day));
				break ; 
				
				case 2 :if(year % 4 == 0 && year % 100!=0 || year % 400 == 0)
					       numberOfDays = 29 ;
				        else
				           numberOfDays = 28 ;
				System.out.print("\n1st February " +year+ " is " +dayName(day));
				break ;
				
				case 3 : numberOfDays = 31 ;
				System.out.print("\n1st March " +year+ " is " +dayName(day));
				break ;
				
				case 4 : numberOfDays = 30 ;
				System.out.print("\n1st April " +year+ " is " +dayName(day));
				break ;
				
				case 5 : numberOfDays = 31 ;
				System.out.print("\n1st May " +year+ " is " +dayName(day));
				break ;
				
				case 6 : numberOfDays = 30 ;
				System.out.print("\n1st June " +year+ " is " +dayName(day));
				break ;
				
				case 7 : numberOfDays = 31 ;
				System.out.print("\n1st July " +year+ " is " +dayName(day));
				break ;
				
				case 8 : numberOfDays = 31 ;
				System.out.print("\n1st August " +year+ " is " +dayName(day));
				break ;
				
				case 9 : numberOfDays = 30 ;
				System.out.print("\n1st September " +year+ " is " +dayName(day));
				break ;
				
				case 10 : numberOfDays = 31 ;
				System.out.print("\n1st October " +year+ " is " +dayName(day));
				break ;
				
				case 11 : numberOfDays = 30 ;
				System.out.print("\n1st November " +year+ " is " +dayName(day));
				break ;
				
				case 12 : numberOfDays = 31 ;
				System.out.print("\n1st December " +year+ " is " +dayName(day));
				break ;
			}
			day = (day + numberOfDays) % 7 ;
		}
	}
public static String dayName (int day) {
	
	String name = "";
	switch(day) {
	case 0  : name += " Sunday"; break;
	case 1  : name += " Monday"; break;
	case 2  : name += " Tuesday"; break;
	case 3  : name += " Wednesday"; break;
	case 4  : name += " Thursday"; break;
	case 5  : name += " Friday"; break;
	default : name += " Saturday"; 
	}
	return name ;
  }

}