
//first made this prog as simple linked list
//modified it to circular doubly linked list

public class LinkedList{
	Node head;
	
	public void insert(int data){
		Node n = new Node();
		n.data = data;
		n.next = null;
		n.prev = null;
		
		if(head==null){
			head = n;
			head.next = head;		//imp for circular linked list
		}
		else{
			//Node temp = new Node();
			Node temp = head;	//?? depends on ide, but better use with new()
			while(temp.next!=head){		//check till last element pointing to head
				//temp.next = temp.next.next;	//this will only move the pointer...but we have to move the temp to next node
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
			for(int i=0;i<index-1;i++){		//we use for instead of while in cases with index value	//we use index-1 coz we need to stop
											//at 1, and i increments to 1 but does not execute the loop
				temp = temp.next;		//this is just for traversing
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
				temp = temp.next;		//we are moving the whole temp node to next node
			}
			//Node del = temp.next;		
			temp.next = temp.next.next;
			temp.next.prev = temp;
			//del = null;		//just to make it eligible for garbage collection
		}
	}		
	
	public void show(){		//what if no element is present
		Node temp = head;
		if(head==null){
			System.out.println("No element to print");
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
