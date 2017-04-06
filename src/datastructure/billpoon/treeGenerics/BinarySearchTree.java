package datastructure.billpoon.treeGenerics;

public class BinarySearchTree<T extends Comparable<? super T>> {

	// Tree node
	static class BinaryNode<T> {
		
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
	
	
	private BinaryNode<T> rootTree;
	// Construct an empty BinarySearchTree
	public BinarySearchTree() {
		rootTree = null;
	}
	
	// Clear BinarySearchTree
	public void clear() {
		rootTree = null;
	}
	
	// Judge whether the tree is empty or not 
	public boolean isEmpty() {
	
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
