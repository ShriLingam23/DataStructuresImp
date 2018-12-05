package DbEndedLinkedListContainer;

public class Test {

	public static void main(String[] args) {
		
		
		DbLinkedList dbLinkedList=new DbLinkedList();
		dbLinkedList.insertFirst("Sajee", 67.0);
		dbLinkedList.insertFirst("Suresh", 55.5);
		dbLinkedList.insertFirst("Dulani", 88.0);
		dbLinkedList.displayList();
		
		dbLinkedList.insertLast("Madara", 34.0);
		dbLinkedList.displayList();
		

	}

}
