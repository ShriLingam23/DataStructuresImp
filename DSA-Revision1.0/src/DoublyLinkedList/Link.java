package DoublyLinkedList;

public class Link {
	
	public int id;
	public Link previous;
	public Link next;
	
	
	public Link(int id) {
		this.id = id;
		this.previous = null;
		this.next = null;
	}
	
	public void displayLink() {
		System.out.println("The ID is "+id);
	}
	
	

}
