package QueueLab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		CircularQueue circularQueue= new CircularQueue(5);
		circularQueue.insert('l');
		circularQueue.insert('m');
		circularQueue.insert('n');
		circularQueue.insert('o');
		
		while(!circularQueue.isEmpty()) {
			System.out.println("The Character : "+circularQueue.remove());
		}
	
		
		QueueX queueX = new QueueX(5);
		
		for(int i=0;i<5;i++) {
			System.out.print("Enter the Transaction ID "+ (i+1)+" : ");
			int id = sc.nextInt();
			
			queueX.insert(id);
		}
		
		
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		while(!queueX.isEmpty()) {
			
			int id=queueX.remove();
			
			System.out.print("ID "+id+" is sent to ");
			if(id%2==0) {
				evenQueue.insert(id);
				System.out.println("PC1");
			}
			else {
				oddQueue.insert(id);
				System.out.println("PC2");
			}
		}
		
		System.out.println("\nPC1");
		while(!evenQueue.isEmpty()) {
			System.out.println("\tTransaction "+evenQueue.remove());
		}
		
		System.out.println("\nPC2");
		while(!oddQueue.isEmpty()) {
			System.out.println("\tTransaction "+oddQueue.remove());
		}
		

		sc.close();
	}

}
