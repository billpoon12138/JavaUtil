package datastructure.billpoon.stackGenerics;

import datastructure.billpoon.stackGenerics.Stack_Array;

public class TestStack {

	public static void main(String[] args) {
		Stack_Array<String> stack = new Stack_Array<String>(10);
		stack.push("A");
		stack.push("B");
		stack.push("c");
		stack.iterateStack();
		stack.pop();
		stack.iterateStack();
		System.out.println(stack.top());
	}

}
