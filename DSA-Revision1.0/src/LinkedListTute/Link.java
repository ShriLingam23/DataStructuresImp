package LinkedListTute;

public class Link {

	public String Name;
	public Link next;
	
	
	public Link(String name) {
		Name = name;
		next=null;
	}
	
	public void displayLink() {
		System.out.println("Student Name \t\t: "+Name);
	}
}
