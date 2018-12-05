package OrdinaryLinkedList;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		//Part A
		
		Link l1=new Link("Nipuna", 53.5);
		Link l2=new Link("Aravinda", 78.0);
		Link l3=new Link("Prashani", 69.5);

		l1.next=l2;
		l2.next=l3;
		
		//Part B
		
		LinkedList linkedList=new LinkedList();
		linkedList.insertFirst("Prashani", 69.5);
		linkedList.insertFirst("Aravinda", 78.0);
		linkedList.insertFirst("Nipuna", 53.5);
		linkedList.insertFirst("Vijay", 99.0);
		
		linkedList.displayList();
		
		//Part C

		System.out.print("Enter the Student Name to be deleted : ");
		String name=sc.next();
		
		Link st=linkedList.deleteLink(name);
		st.displayLink();
		
	}

}
