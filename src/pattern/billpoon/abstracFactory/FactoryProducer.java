package pattern.billpoon.abstracFactory;

import pattern.billpoon.factory.DataFactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("Data")){
			//return new DataFactory();
		}else if(choice.equalsIgnoreCase("Session")){
			return new SessionFactory();
		}
		return null;
	}
}
