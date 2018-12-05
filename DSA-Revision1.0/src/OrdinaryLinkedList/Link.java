package OrdinaryLinkedList;

public class Link {
	
	public String Name;
	public double Average;
	public Link next;
	
	
	public Link(String name, double average) {
		Name = name;
		Average = average;
		next=null;
	}
	
	public void displayLink() {
		System.out.println("Student Name \t\t: "+Name);
		System.out.println("Student's Average \t: "+Average+"\n");
	}
	

}
