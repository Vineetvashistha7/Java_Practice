package StackArrayImplementation;

public class ArrayStackMain {
	public static void main(String[] args) {
		ArrStack stack = new ArrStack(5);
		stack.peek();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(80);
		System.out.println(stack.peek());
		stack.traversal();
		System.out.println(stack.pop());
		stack.traversal();
		System.out.println(stack.pop());
		stack.traversal();
	}

}
