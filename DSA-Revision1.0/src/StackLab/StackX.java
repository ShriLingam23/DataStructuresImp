package StackLab;

public class StackX {
	
	private int maxSize;
	private int top;
	private char stackArray[];
	
	public StackX(int s) {
		this.maxSize = s;
		top = -1;
		this.stackArray = new char[maxSize];
	} 
	
	public void push(char j) {
		if(top==maxSize-1) {
			System.out.println("Stack is full");
		}
		else {
			stackArray[++top]=j;
		}
	}
	
	public char pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return '!';
		}
		else {
			return stackArray[top--];
		}
	}
	
	public char peek() {
		if(top==-1) {
			System.out.println("Stack is empty");
			return '!';
		}
		else {
			return stackArray[top];
		}
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top==maxSize-1);
	}

	
	
}
