
public class TestQueue {
	public static void main(String[] args) {
		
		Queue queue = new Queue () ;
		//inserting 20 numbers
		for(int i = 1 ; i <= 20 ; i++) {
			queue.enqueue(i);
		}
		//displaying 20 numbers
		for(int i = 0 ; i < 20 ; i++) {
			System.out.print(queue.dequeue()+" ");
		}
	}
}