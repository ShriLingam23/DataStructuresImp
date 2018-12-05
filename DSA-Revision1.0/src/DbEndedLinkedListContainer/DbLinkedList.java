package DbEndedLinkedListContainer;

public class DbLinkedList {
	
	private Link first;
	private Link last;
	
	
	public DbLinkedList() {
		first=null;
		last=null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void displayList() {
		Link current=first;
		
		System.out.println("\t\t\tStudents Details\n");
		while(current!=null) {
			current.displayLink();
			current=current.next;
		}
	}
	
	public void insertFirst(String name,double avg) {
		Link newLink = new Link(name, avg);
		
		newLink.next=first;
		
		if(first==null)
			last=newLink;
		
		first=newLink;
			
	}
	
	public void insertLast(String name,double avg) {
		Link newLink = new Link(name, avg);
		
		if(last!=null) {
			last.next=newLink;
		}
		else {
			first=newLink;
		}
			
		last=newLink;
		
	}
	
	public Link deleteFirst() {
		Link temp=first;
		
		first=first.next;
		
		if(first==null)
			last=null;
		
		return temp;
	}
	
	

}
