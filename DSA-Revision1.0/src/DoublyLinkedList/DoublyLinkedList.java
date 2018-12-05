package DoublyLinkedList;

public class DoublyLinkedList {
	
	private Link first;

	public DoublyLinkedList() {
		this.first = null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void insertFirst(int id) {
		Link newLink = new Link(id);
		
		newLink.next=first;
		
		if(!isEmpty()) 
			first.previous=newLink;
		
		first=newLink;
			
	}
	
	public Link deleteFirst() {
		Link temp = first;
		
		first=first.next;
		
		if(first!=null)
			first.previous=null;
		
		return temp;
			
	}
	
	public void displayList() {
		Link current = first;
		System.out.println();
		while(current!=null) {
			current.displayLink();
			current=current.next;
		}
	}
	
	public void displayBackwards() {
		if(!isEmpty()) {
			Link current = first;
			
			while(current.next!=null) {
				current=current.next;
			}
			System.out.println();
			while(current!=null) {
				current.displayLink();
				current=current.previous;
			}
		}
		else
			System.out.println("LinkedList is Empty");
	}
	
	public void insertAfter(int key,int newValue) {

		Link newLink =new Link(newValue);
		
		if(!isEmpty()) {
			
			Link current = first;
			
			while(current.id!=key) {
				current=current.next;
				
				if(current==null) {
					System.out.println("\nNo, Key "+key +" found!!!");
					return;//return to the method, ie: method is terminated. 
				}
					
			}
			
			newLink.next=current.next;
			if(current.next!=null)
				current.next.previous=newLink;
			
			current.next=newLink;
		}
		else
			first=newLink;
	}
	
	

}
