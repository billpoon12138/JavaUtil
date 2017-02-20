package datastructure.billpoon.stack;

public class Stack_Array implements Stack {
	public static final int CAPACITY = 1024;
	
	protected int capacity;
	
	protected Object[] S;
	
	protected int top = -1;
	
	public Stack_Array() {
		this(CAPACITY);
	}

	public Stack_Array(int capacity) {
		this.capacity = capacity;
		S = new Object[capacity];
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
	public Object top() throws StackEmptyException {
		if (isEmpty()){
			throw new StackEmptyException("Error : Stack is Empty");
		}
		return S[top];
	}

	@Override
	public void push(Object obj) throws StackFullException {
		if (getSize() == capacity){
			throw new StackFullException("Error : Stack is full");
		}
		S[++top] = obj;
	}

	@Override
	public Object pop() throws StackEmptyException {
		Object element;
		
		if (isEmpty()){
			throw new StackEmptyException("Error : Stack is Empty");
		}
		element = S[top];
		S[top--] = null;
		return element;
	}
	
	public void iterateStack(){
		for(int index = top; index >= 0; index--){
			System.out.println(S[index]);
		}
	}
	

}
