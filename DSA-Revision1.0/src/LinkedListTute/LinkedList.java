package LinkedListTute;

public class LinkedList {
	
	public Link first;

	public LinkedList() {
		first=null;
	}
	
	public boolean isEmpty() {
		return (first==null);
	}
	
	public void displayList() {
		Link current=first;
		System.out.println("\n\t\t\tStudent Details\n");
		while(current!=null) {
			current.displayLink();
			current=current.next;
		}
	}
	
	public void insertFirst(String name) {
		Link newLink=new Link(name);
		newLink.next=first;
		first=newLink;
	}
	
	public Link deleteFirst() {
		if(!isEmpty()) {
			Link temp=first;
			first=first.next;
			return temp;
		}
		else
			return null;
	}
	
	public Link findLink(String name) {
		Link current =first;
		
		//String value should be compared using equals() method
		while(!current.Name.equals(name)) {
			current=current.next;
			
			if(current==null) 
				return null;
			
		}
		return current;
	}
	
	//Always start from "first"
	//Consider first link also as a possible case when deleting
	public Link deleteLink(String name) {
		
		if(!isEmpty()) {
			Link current =first;
			Link previous=null;
			
			//String value should be compared using equals() method
			while(!current.Name.equals(name)) {
				previous=current;
				current=current.next;
				
				//if(current==null) 
					//return null;
				
			}
			
			if(current==first)
				first=first.next;
			else
				previous.next=current.next;
			
			return current;
		}
		else
			return null;
			
	}
	
	public void insertLink(String keyName,String name) {
		
		Link newLink= new Link(name);
		
		if(!isEmpty()) {
			
			Link current=first;
			
			//String value should be compared using equals() method
			while(!current.Name.equals(keyName)) {
				current=current.next;
				
				if (current==null) {
					System.out.println("No key Student found!!!");
					return;
					
				}	
					
			}
			
			newLink.next=current.next;
			current.next=newLink;
		}
		else
			first=newLink;
			
	}
	
	

}
