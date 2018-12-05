package QueueLab;

public class QueueX {
	
	private int queueArr[];
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public QueueX(int s) {
		
		this.maxSize = s;
		this.queueArr = new int[maxSize];
		
		this.rear = -1;
		this.front = 0;
		this.noItems = 0;
	}
	
	public void insert(int j) {
		if(rear==maxSize-1)
			System.out.println("Queue is Full");
		
		else {
			queueArr[++rear]=j;
			noItems++;
		}
	}
	
	public int remove() {
		if(noItems==0) {
			System.out.println("Queue is Empty!!!");
			return -99;
		}
		else {
			noItems--;
			return queueArr[front++];
		}
	}
	
	public boolean isEmpty() {
		return (noItems==0);
	}
	
	public boolean isFull() {
		return (rear==(maxSize-1));
	}
	

}
