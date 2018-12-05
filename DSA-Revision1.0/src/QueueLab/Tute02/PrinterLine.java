package QueueLab.Tute02;

public class PrinterLine {
	
	//We assume this is a Circular Queue
	
	private int front;
	private int rear;
	private int maxSize;
	private int noItems;
	private int jobArr[];
	
	
	public PrinterLine(int s) {
		this.maxSize = s;
		jobArr = new int[maxSize];
		
		this.front = 0;
		this.rear = -1;
		this.noItems = 0;
	}
	
	public void insert(int jobId) {
		if(noItems==maxSize) {
			System.out.println("Queue is Full!!!");
		}
		else {
			
			if(rear==maxSize-1)
				rear=-1;
			
			jobArr[++rear]=jobId;
			noItems++;
		}
	}
	
	public int remove() {
		if(noItems==0) {
			System.out.println("Queue is Empty!!!");
			return -99;
		}
		else {
			int j=jobArr[front++];
			
			if(front==maxSize)
				front=0;
			
			noItems--;
			return j;
		}
	}
	
	public boolean isEmpty() {
		return (noItems==0);
	}
	
	public boolean isFull() {
		return (noItems==maxSize);
	}
	
	

}
