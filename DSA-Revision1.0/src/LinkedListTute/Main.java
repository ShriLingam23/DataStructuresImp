package LinkedListTute;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.insertFirst("Nisha");
		linkedList.insertFirst("Mihiri");
		linkedList.insertFirst("Akila");
		linkedList.insertFirst("Mithila");
		
		linkedList.displayList();
		
		Link l2=linkedList.first.next;
		Link l3=linkedList.first.next.next;
		
		l2.next=linkedList.first;
		linkedList.first.next=l3.next;
		l3.next=l2;
		linkedList.first=l3;
		linkedList.displayList();
		
		System.out.print("\nEnter the Name : ");
		String newName=sc.next();
		
		System.out.print("Enter the Name After which to be Entered : ");
		String key=sc.next();
		
		linkedList.insertLink(key, newName);
		linkedList.displayList();
		
		
	}

}
