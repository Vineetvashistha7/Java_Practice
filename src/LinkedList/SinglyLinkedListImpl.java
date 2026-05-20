package LinkedList;

public class SinglyLinkedListImpl {
	public static void main(String[] args) {
		SinglyLinkedList ll= new SinglyLinkedList();
		ll.delete();
		ll.addAtPosition(1, 33);
		
		ll.delete();
		ll.add(20);
		ll.add(10);
		ll.add(100);
		ll.add(200);
		ll.add(50);
		ll.Traversal();
		
	//	ll.size();
		
		
		ll.addAtPosition(8, 15);
		
		ll.Traversal();
		
		System.out.println(ll.getValueAtPosition(2));   
	
	
	}

}
