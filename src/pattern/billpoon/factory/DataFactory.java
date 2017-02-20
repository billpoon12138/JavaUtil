package pattern.billpoon.factory;

public class DataFactory {

	public Data getData(String dataType){
	      if(dataType == null){
	          return null;
	       }		
	       if(dataType.equalsIgnoreCase("KPI")){
	          return new KPI();
	       } else if(dataType.equalsIgnoreCase("DOC")){
	          return new DOC();
	       }
	       return null;
	    }

}
