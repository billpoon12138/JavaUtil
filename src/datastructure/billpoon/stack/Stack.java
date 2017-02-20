package datastructure.billpoon.stack;


public interface Stack {

	/*
	 * Return the count of the elements in the stack
	 */
	public int getSize();
	
	/*
	 * 
	 */
	public boolean isEmpty();
	
	public Object top() throws StackEmptyException;
	
	public void push(Object obj) throws StackFullException;
	
	public Object pop() throws StackEmptyException;
	
}
