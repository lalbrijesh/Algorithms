
public class Driver {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(7);
		q.enqueue(6);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(5);
		
		q.dequeue();
		
		q.enqueue(4);
		
		System.out.println(q.isFull());
		q.show();

	}

}
