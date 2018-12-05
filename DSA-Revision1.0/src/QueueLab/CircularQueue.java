package QueueLab;

public class CircularQueue {
	
	private int front;
	private int rear;
	private int noItems;
	private int maxSize;
	private char QueueArray[];
	
	
	public CircularQueue(int s) {
		
		this.maxSize = s;
		QueueArray= new char[maxSize];
		
		this.front = 0;
		this.rear = -1;
		this.noItems = 0;
		
	}
	
	public void insert(char j) {
		if(noItems==maxSize) {
			System.out.println("Queue is Full");
		}
		else {
			if(rear==(maxSize-1))
				rear=-1;
			
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
			char j = QueueArray[front++];
			
			if(front==maxSize)
				front=0;
			
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
	
	public boolean isEmpty() {
		if(noItems==0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(noItems==maxSize)
			return true;
		else
			return false;
	}
	
	
	
	

}
