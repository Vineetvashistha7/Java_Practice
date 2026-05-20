package StackLinkedListImplementation;

public class LinkedListStackMain {
	public static void main(String[] args) {
		LinkedListStack ls=new LinkedListStack();
		System.out.println(ls.pop());
		ls.push(10);
		ls.push(20);

		ls.push(30);
		ls.traverse();
		ls.push(50);
		
		ls.push(40);

		ls.push(80);
		System.out.println(ls.pop());

		ls.push(60);
		System.out.println(ls.peek());

		ls.push(70);
		
		ls.traverse();

	}

}
