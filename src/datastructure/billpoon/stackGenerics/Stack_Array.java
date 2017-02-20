package datastructure.billpoon.stackGenerics;

import datastructure.billpoon.stack.StackEmptyException;
import datastructure.billpoon.stack.StackFullException;

public class Stack_Array<T> implements Stack<T> {
	public static final int CAPACITY = 1024;
	
	protected int capacity;
	
	protected T[] S;
	
	protected int top = -1;
	
	public Stack_Array() {
		this(CAPACITY);
	}

	public Stack_Array(int capacity) {
		this.capacity = capacity;
		S = (T[]) new Object[capacity];
	}
	
	@Override
	public int getSize() {
		return (top + 1);
	}

	@Override
	public boolean isEmpty() {
		return (top < 0);
	}

	@Override
	public T top() throws StackEmptyException {
		if (isEmpty()){
			throw new StackEmptyException("Error : Stack is Empty");
		}
		return S[top];
	}

	@Override
	public void push(T t) throws StackFullException {
		if (getSize() == capacity){
			throw new StackFullException("Error : Stack is full");
		}
		S[++top] = t;
	}

	@Override
	public T pop() throws StackEmptyException {
		T t;
		if (isEmpty()){
			throw new StackEmptyException("Error : Stack is Empty");
		}
		t = S[top];
		S[top--] = null;
		return t;
	}
	
	public void iterateStack(){
		for(int index = top; index >= 0; index--){
			System.out.println(S[index]);
		}
	}

}
