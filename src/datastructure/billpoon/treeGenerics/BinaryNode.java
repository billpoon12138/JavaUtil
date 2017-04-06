package datastructure.billpoon.treeGenerics;

public class BinaryNode<T> {
	
	T data;
	BinaryNode<T> left;
	BinaryNode<T> right;
	
	public BinaryNode(T data) {
		// TODO Auto-generated constructor stub
		this(data,null,null);
	}
	
	public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
		// TODO Auto-generated constructor stub
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	public BinaryNode() {
		// TODO Auto-generated constructor stub
		data = null;
		this.left = left;
		this.right = right;
	}

}
