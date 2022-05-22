package Task4;
import java.util.* ;

public class Union {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		System.out.println("Enter 5 integrs for list 1 : ");
		for(int i = 0 ; i < 5 ; i++) {
			list1.add(input.nextInt());
		}
		System.out.println("Enter 5 integrs for list 2 : ");
		for(int i = 0 ; i < 5 ; i++) {
			list2.add(input.nextInt());
		}
		
		ArrayList<Integer> list3 = union(list1 , list2);
		System.out.println("Union : " +list3.toString());
	}
	
	public static ArrayList<Integer> union (ArrayList<Integer>list1 ,ArrayList<Integer>list2){
		ArrayList<Integer>list3 = list1 ;
		for(int i = 0 ; i < list2.size() ; i++) {
			list3.add(list2.get(i));
		}
		return list3 ;
	}

}
