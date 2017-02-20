package pattern.billpoon.abstracFactory;

import pattern.billpoon.factory.Data;

public class SessionFactory extends AbstractFactory {

	@Override
	public Data getData(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session getSession(String session) {
		if(session == null){
			return null;
		}
		
		if(session.equalsIgnoreCase("ClientSession")){
			return new ClientSession();
		}else if(session.equalsIgnoreCase("ServerSession")){
			return new ServerSession();
		}
		return null;
	}
}
