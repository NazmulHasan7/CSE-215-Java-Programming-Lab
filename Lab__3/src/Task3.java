public class Task3 {
	public static void main (String[] args) {
		
		System.out.println("Numbers that are divisble by 5 & 6 but not by both from 100 to 200 are : ");
		int count = 0 ;
		for(int i=100; i<=200; i++) {
			if ((i % 5== 0) && (i % 6 !=0 ) || (i % 5 != 0) && (i % 6 ==0 )) {
				System.out.print(i +" ");
				count ++;
				
				if(count % 10 == 0 ) {
					System.out.print("\n");
				}
			}
			else 
				continue;
		}
	}
}