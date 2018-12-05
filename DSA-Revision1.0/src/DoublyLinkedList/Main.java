package DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		doublyLinkedList.insertFirst(5);
		doublyLinkedList.insertFirst(4);
		doublyLinkedList.insertFirst(3);
		doublyLinkedList.insertFirst(2);
		doublyLinkedList.insertFirst(1);
		
		doublyLinkedList.displayList();
		doublyLinkedList.displayBackwards();
		
		doublyLinkedList.insertAfter(5, 6);
		doublyLinkedList.insertAfter(6, 7);
		doublyLinkedList.insertAfter(7, 8);
		doublyLinkedList.insertAfter(8, 9);
		doublyLinkedList.insertAfter(11, 10);
		
		doublyLinkedList.displayList();

	}

}
