package datastructure.billpoon.linkedList;

public interface BList {

	public void add(Object o);
	
	public void add(int index, Object o);
	
	public void clear();
	
	public boolean contains(Object o);
	
	public Object get(int index);
	
	public int indexOf(Object o);
	
	public boolean isEmpty();
	
	public int lastIndexOf();
	
	public boolean remove(Object o);
	
	public int size();
	
	public Object remove(int index);
	
	public Object set(int index, Object o);
	
}
