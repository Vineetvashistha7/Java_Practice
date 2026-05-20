package StackArrayImplementation;

public class ArrStack {
	int[] arr;
	int top;
	public ArrStack(int size) {
		arr=new int[size];
		top=-1;
	}
	
	
	
	public void push(int data) {
		if(top==arr.length-1){
			System.out.println("Stack is already full !");
			return;
		}
		
		arr[++top]=data;
	}
	
	
	public void traversal() {
		if(top==-1) {
			System.out.println("Stack is empty!!");
			return;
		}
		int cap=top;
		while(cap>=0) {
			System.out.print(arr[cap]+" ");
			cap--;
		}
		System.out.println();
	}
	
	
	public int pop() {
		if(top==-1) {
			System.out.println("Stack is empty!!");
			return -1;
		}
		int val=arr[top];
		top--;
		return val;
	}
	
	
	
	public int peek() {
		if(top==-1) {
			System.out.println("Stack is empty!!");
			return -1;
		}
		return arr[top];
	}
}
