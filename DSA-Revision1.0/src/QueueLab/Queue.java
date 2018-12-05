package QueueLab;

public class Queue {
	
	private int front;
	private int rear;
	private int maxSize;
	private int noItems;
	private char QueueArray[];
	
	public Queue(char s) {
		
		this.maxSize = s;
		QueueArray = new char[maxSize];
		
		this.front = 0;
		this.rear = -1;
		this.noItems = 0;
		
	}
	
	public boolean isEmpty() {
		return (rear==-1);
	}
	
	public boolean isFull() {
		return (rear==maxSize-1);
	}
	
	public void insert(char j) {
		if(rear==maxSize-1) {
			System.out.println("Queue is Full");
		}
		else {
			QueueArray[++rear]=j;
			noItems++;
		}
	}
	
	public char remove() {
		if(noItems==0) {
			System.out.println("Queue is Empty");
			return '@';
		}
		else {
			char j=QueueArray[front++];
			noItems--;
			return j;
		}
	}
	
	public char peekFront() {
		if(noItems==0) {
			System.out.println("Queue is Empty");
			return '@';
		}
		else {
			return QueueArray[front];
		}
	}
	

}
