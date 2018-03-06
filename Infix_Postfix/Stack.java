public class Stack {
	
	char stack[] = new char[10];
	int top = -1;
	
	public void push(char data){
		if(top==4){
			System.out.println("FULL");
		}
		else{
			top++;	
			stack[top] = data;
			
		}
	}
	
	public char pop(){
		if(top==-1){
			System.out.println("Empty");
			return 0;
		}
		else{
			char temp;
			temp = stack[top];
			stack[top] = 0;
			top--;
			return temp;
		}
	}
	
	public char peek(){
			while(!isEmpty()){
				return stack[top];
			}
			return 0;		
	}
	
	public int size(){
		return top+1;
	}
	
	public boolean isEmpty(){
		return (top==-1) ? true:false;
	}
	
	public void show(){
		for(int i=0;i<=top;i++){
			System.out.println(stack[i]);
		}
	}
}
