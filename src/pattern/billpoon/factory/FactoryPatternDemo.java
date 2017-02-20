package pattern.billpoon.factory;

public class FactoryPatternDemo {
	
	

	public static void main(String[] args) {
		DataFactory dataFactory = new DataFactory();
		Data kpi = dataFactory.getData("KPI");
		Data doc = dataFactory.getData("DOC");
		kpi.outCome();
		doc.outCome();
	}
}
