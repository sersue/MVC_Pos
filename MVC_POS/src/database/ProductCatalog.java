package database;
//database Map을 관리하는 객체 
public class ProductCatalog {

	
	public String getProductDesc(String itemid) {
		// TODO Auto-generated method stub
   	   
		ProductDescription desc = new ProductDescription();
		desc.get(itemid);
		
		return desc.get(itemid);
		
	}

}
