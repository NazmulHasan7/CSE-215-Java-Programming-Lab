package Task1 ;
import java.util.ArrayList ;
import java.util.Date ;

public class TestArrayList {
	public static void main(String [] args) {
		
		ArrayList<Object> list = new ArrayList<>();
		list.add(new Loan());
		list.add(new Circle());
		list.add(new Date());
		list.add(new String("HELLO WORLD"));
		
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i).toString());
		}
		
	}

}
