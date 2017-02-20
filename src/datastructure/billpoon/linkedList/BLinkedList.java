package datastructure.billpoon.linkedList;

public class BLinkedList {
	private Node first, last;
	int size = 0;

	public BLinkedList() { }

	public void addFirst(Object o){
		Node newNode = new Node(o);
		newNode.next = first;
		first = newNode;
		
		size ++;
		if(last == null){
			last = first;
		}
	}
	
	public void addLast(Object o){
		if(last == null){
			first = last = new Node(o);
		}else{
			last.next = new Node(o);
			last = last.next; 	
		}
		size ++;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		if(size != 0){
			sb.append("{ ");
			Node node = first;
			while( node != null){
				sb.append(node.element.toString());
				sb.append(", ");
				node = node.next;
			}
			sb.delete(sb.length() - 2, sb.length());
			sb.append(" }");
			return sb.toString();
		}else{
			return "";
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BLinkedList linkedList = new BLinkedList();
		linkedList.addFirst("A");
		linkedList.addFirst("B");
		linkedList.addLast("C");
		System.out.println(linkedList);

	}
}
