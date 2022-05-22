import java.util.Scanner ; 
public class Task9 {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner (System.in);
		System.out.print("Enter number of Students : ");
		int studentNo = input.nextInt();
		
		double score = 0 , secondHighest = 0 , highest = 0 ;
		String name = "" , student1 = "", student2 = "";
		
		for ( int i = 1 ; i <= studentNo ; i++) {
		    System.out.printf("Enter student %d name & score : ",i);
		    name = input.next();
		    score = input.nextDouble();
		    
		    if( i == 1 ) {
		        highest = score ;
		        student1 = name ;
		    }
		    else if ( i == 2 ) {
		        if( score > highest ) {
		        secondHighest = highest ;
		        highest = score ;
		        student2 = student1 ;
		        student1 = name ;
		        }
		        else {
		            secondHighest = score ;
		            student2 = name ;
		        }
		      }
		     else if ( i > 2 && score > secondHighest ) {
		          if ( score > highest ) {
		              secondHighest = highest ; 
		              highest = score ; 
		              student2 = student1 ;
		              student1 = name ;
		          }
		     else {
		              secondHighest = score ;
		              student2 = name ;
		          }
		      }
	    }
		 System.out.println("\nHighest score : "+highest+"\nName : "+student1+"\nSecond highest score"+secondHighest+"\nName : "+student2);   
	}
}
