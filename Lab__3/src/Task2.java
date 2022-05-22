public class Task2 {
	public static void main(String[] args) {
	
		int currentTuition = 10000 ,totalTuition = 0 ; 
		for(int i= 0 ; i<10 ; i++)
			currentTuition += (currentTuition * 5 /100 ) ;
		
		System.out.println("Tuition after 10 years : "+currentTuition);
		
		for (int i=0; i<4; i++) {
			currentTuition += (currentTuition * 5 /100 ) ;
			totalTuition += currentTuition;
		}
		System.out.println("TOtal Tuition : "+totalTuition);
	}
}