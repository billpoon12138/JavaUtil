package pattern.billpoon.singleton;

public class SingleObject {

	private SingleObject(){}
	
	private static SingleObject instance = new SingleObject();
	
	public static SingleObject getInstance(){
		return instance;
	}
	
	public void outCome(){
		System.out.println("Single Instance");
	} 
}
