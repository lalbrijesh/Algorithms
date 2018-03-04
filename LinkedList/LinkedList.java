
public class LinkedList{
	
	Node head;
	
	public void insert(int data){
		Node n = new Node();
		n.data = data;
		n.next = null;
		n.prev = null;
		
		if(head==null){
			head = n;
			head.next = head;		
		}
		else{
			Node temp = head;	
			while(temp.next!=head){		//check till last element pointing to head
				temp = temp.next;	//moves temp to next node				
			}
			temp.next = n;
			n.next = head;
			n.prev = temp;
			head.prev = n;
		}
	}
	
	public void insertAt(int index, int data){
		Node n = new Node();
		n.data = data;
		
		if(index==0){
			n.next = head;
			head.prev = n;
			n.prev = head.prev;
			head = n;
		}
		else{
			Node temp = new Node();
			temp = head;
			for(int i=0;i<index-1;i++){		//we use index-1 coz we need to stop at 1, and i increments to 1 but does not execute the loop
				temp = temp.next;		
			}
			n.next = temp.next;
			n.prev = temp;
			temp.next = n;
			temp.next.prev = n;
		}
	}
	
	public void delete(int index){
		if(head==null){
			System.out.println("No element to delete");
		}
		else{
			Node temp = new Node();
			temp = head;
			for(int i=0;i<index-1;i++){
				temp = temp.next;		//we are moving the temp node to next node
			}	
			temp.next = temp.next.next;
			temp.next.prev = temp;
		}
	}		
	
	public void show(){		
		Node temp = head;
		if(head==null){
			System.out.println("No element to print.");
		}
		else{
			while(temp.next!=head){
				System.out.println(temp.data);
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
		
	}
}
