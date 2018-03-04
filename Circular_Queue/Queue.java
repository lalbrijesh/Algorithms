/*
Author: Brijesh Lal

Program implementing Circular Queue using circular array.
*/


public class Queue {

		int queue[] = new int[5];
		int size = 0;
		int front = 0;
		int rear = 0;
		
		public void enqueue(int data){
			if(isFull()){
				System.out.println("Is full");
			}
			else{
				queue[rear] = data;
				rear=(rear+1)%5;
				size++;
			}
		}
		
		public void dequeue(){
			if(isEmpty()){
				System.out.println("Is Empty");
			}
			else{
				queue[front] = 0;
				front = (front+1)%5;
				size--;
			}
		}

		public boolean isFull(){
			return size==queue.length;
		}
		
		public boolean isEmpty(){
			return size==0;
		}
		
		public void show(){			
			for(int i=0;i<size;i++){
				System.out.println(queue[(front+i)%5]);
			}
		}
}
