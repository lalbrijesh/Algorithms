/*
Author: Brijesh Lal

Program to convert infix expression to Postfix using stack
*/
public class Driver {
	
	public static String infixPostfix(String s){	
		String output = "";	
		Stack stk = new Stack();
		
		char[] infix = new char[10];
		infix = s.toCharArray();
		
		for(char c:infix){
			if(Character.isLetter(c)){	
				output+=c;
			}
			else if(c=='('){
				stk.push('(');
			}
			else if(c==')'){
				while(stk.peek()!='('){
					output+=stk.pop();
				}
				stk.pop();
			}
			else{	//when an operator is found
				if(stk.isEmpty())
					stk.push(c);
				else{
					if(precedence(c)>precedence(stk.peek()))	
						stk.push(c);
					else{
						while(!stk.isEmpty() || stk.peek()=='('){
							output+=stk.pop();
						}
					}
				}
			}
		}
		while(!stk.isEmpty())		//pop() until stack is empty, after infix has been traversed
			output+=stk.pop();
		return output;
	}
	
	public static int precedence(char c){	
		switch(c){
		case '*':
		case '/':
			return 2;	
		case '+':
		case '-':
			return 1;
		}
		return 0;
	}
	
	public static void main(String[] args){
		
		String exp = "(a+b)*c";
        System.out.println(infixPostfix(exp));
	}
}
