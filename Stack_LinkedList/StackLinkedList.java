
/*
Author: Brijesh Lal

Program implementing Stack using LinkedList
*/

public class StackLinkedList {
	
	Node head;
	
	public void push(int data){
		Node n = new Node();
		n.data = data;
		n.next = head;
		head = n;			
		
	}
	
	public void pop(){
		if(head==null)
			System.out.println("Stack empty");
		else{
			head = head.next;
		}
	}
	
	public void show(){
		Node temp = new Node();
		temp=head;
		if(head==null){
			System.out.println("no elements");
		}
		while(temp.next!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
	}
}
