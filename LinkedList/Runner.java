
public class Runner {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		
		ll.insert(5);
		ll.insert(8);
		ll.insert(2);
		
		ll.insertAt(2, 1);
		ll.delete(2);

		ll.show();
	}
}
