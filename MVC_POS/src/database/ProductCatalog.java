package database;

import java.util.HashMap;

import java.util.Map;

import database.ProductDescription;
//database Map을 관리하는 객체 
public class ProductCatalog {

	public static HashMap map = new <String, ProductDescription> HashMap();
	
	public ProductCatalog() {
		super();
	}
	
	public void ProductCatalog1() {
		String id1 = "1";
		String id2 = "2";
		int price = 2000;
		
		ProductDescription desc1,desc2; 
		desc1 = new ProductDescription(id1,price,"apple");
		desc2 = new ProductDescription(id2,price,"banna");

		map.put(id1,desc1);
		map.put(id2,desc2);
	

	}
	
	public ProductDescription getProductDesc(String itemid) {
		
		
		System.out.println(map.get(itemid));
		return (ProductDescription) (map.get(itemid));
		
	}

}
