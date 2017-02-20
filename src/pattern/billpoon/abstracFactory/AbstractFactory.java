package pattern.billpoon.abstracFactory;

import pattern.billpoon.factory.Data;

public abstract class AbstractFactory {
	abstract Data getData(String data);
	abstract Session getSession(String session);
}
