package LinkedListTute;

public class StackX {

	//Normally we use 3 attribute in a Stack
	//1.maxSize - Replaces bcz, linkedlist can grow
	//2.top - replace bcz, linkedlist has a reference to 1st 
	//3.array to store
	private LinkedList linkedList;

	public StackX(LinkedList linkedList) {
		this.linkedList = new LinkedList();
	}
	
	public boolean isEmpty() {
		return linkedList.isEmpty();
	}
	
	public void push(String name) {
		linkedList.insertFirst(name);
	}
	
	public String pop() {
		while(!linkedList.isEmpty()) {
			return linkedList.deleteFirst().Name;
		}
		
		return null;
	}
	
}
