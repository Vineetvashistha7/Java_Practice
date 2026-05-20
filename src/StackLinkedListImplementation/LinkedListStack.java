package StackLinkedListImplementation;

public class LinkedListStack {
	      Node top=null;
	public class Node{
			int data;
			Node next;
			Node(int data){
				this.data=data;
				this.next=null;
				}
		}
		
		
		public void push(int data) {
			Node newNode= new Node(data);
			newNode.next=top;
			top=newNode;
		}
		
		public void traverse() {
			Node temp=top;
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
		
		public int pop() {
			if(top==null) {
				System.out.println("stack is empty!!");
				return -1;
			}
			int val=top.data;
			top=top.next;
			return val;
		}
		
		
		
		public int peek() {
			if(top==null) {
				System.out.println("stack is empty!!");
				return -1;
			}
			int val=top.data;
			return val;
		}

}
