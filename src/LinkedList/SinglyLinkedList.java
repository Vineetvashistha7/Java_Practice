package LinkedList;

public class SinglyLinkedList {
	Node first=null;
	Node curr=null;
	int size=0;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	
	public void add(int val) {
		Node newNode= new Node(val);
		if(first==null) {
			first=newNode;
			curr=newNode;
		}
		curr.next=newNode;
		curr=newNode;
		size++;
	}
	
//	public void size() {
//		if(first==null) {
//			return;
//		}
//		size=0;
//		Node temp=curr;
//		while(temp!=null) {
//			size++;
//			temp=temp.next;
//		}
//	}
	
	public void Traversal() {
		if(first==null) {
			System.out.println("Singly Linked List is empty!!");
			return;
		}
		
		Node temp=first;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	
	public void addAtPosition(int position, int data) {
		if(first==null) {
			add(data);
			return;
		}
		if(position >size) return ;
		Node newNode= new Node(data);
		Node temp=first;
		int i=1;
		while(i<position-1) {
			temp=temp.next;
			i++;
		}
		size++;
		newNode.next=temp.next;
		temp.next=newNode;
	}
	
	
	public int getValueAtPosition(int position) {
		if(first==null) {
			System.out.println("Linked List is empty!!");
			return -1;
		}
		Node temp=first;
		int i=1;
		while(i<position  && position<=size) {
			temp=temp.next;	
			i++;
		}
		return temp.data;
	}
	
	
	public void delete() {
		if(first==null) {
			System.out.println("Linked list is empty!!");
			return;
		}
		if(size==1) {
			first=null;
			curr=null;
			size--;
			return;
		}
		Node temp=first;
		// Move to second-last node
	    while (temp.next.next != null) {
	        temp = temp.next;
	    }

	    System.out.println("Deleted node: " + temp.next.data);

	    temp.next = null;
	    curr = temp; // update tail
	    size--;
			
	}
	
	
//	public void deleteAtPosition(int pos) {
//		if(first==null && pos!=1) {
//			System.out.println("Linked List is Empty !!");
//			return;
//		}
//		if(first!=null && pos==1) {
//			first=first.next;
//		}
//	}
}
