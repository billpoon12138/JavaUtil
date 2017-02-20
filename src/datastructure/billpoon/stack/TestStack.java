package datastructure.billpoon.stack;



public class TestStack {
	public static void main(String[] args) {
		Stack_Array stack = new Stack_Array(10);
		stack.push("A");
		stack.push("B");
		stack.push("c");
		stack.iterateStack();
		stack.pop();
		stack.iterateStack();
		System.out.println(stack.top());
	}
}
