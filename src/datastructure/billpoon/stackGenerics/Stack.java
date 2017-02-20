package datastructure.billpoon.stackGenerics;

import datastructure.billpoon.stack.StackEmptyException;
import datastructure.billpoon.stack.StackFullException;

public interface Stack<T> {

	/*
	 * Return the count of the elements in the stack
	 */
	public int getSize();

	/*
	 * 
	 */
	public boolean isEmpty();

	public T top() throws StackEmptyException;

	public void push(T t) throws StackFullException;

	public T pop() throws StackEmptyException;

}
