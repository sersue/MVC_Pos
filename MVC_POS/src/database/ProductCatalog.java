package database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import database.ProductDescription;
//database Map을 관리하는 객체 
public class ProductCatalog {
	ProductDescription re_itemid;

	public static HashMap map = new <String, ProductDescription> HashMap();
	
	public ProductCatalog() {
		super();
	}
	
	public void ProductCatalog1() {
		String id1 = "1";
		String id2 = "2";
		String id3 = "3";
		int fruit_price = 2000;
		int book_price = 30000;
		
		ProductDescription desc1,desc2,desc3; 
		desc1 = new ProductDescription(id1,fruit_price,"apple");
		desc2 = new ProductDescription(id2,fruit_price,"banna");
		desc3 = new ProductDescription(id3,book_price,"book");

		
		map.put(id1,desc1);
		map.put(id2,desc2);
		map.put(id3,desc3);

	

	}
	
	public ProductDescription getProductDesc(String itemid) {
		
		if(map.containsKey(itemid)) {
			re_itemid = (ProductDescription) map.get(itemid);
		}
		else {
			System.out.println("There is NoItem name :" + itemid);
		}

		return re_itemid;
		
	}
	
	public String[] getitemid() {
		
		String[] it = new String[map.size()];
		Iterator<String> keys = map.keySet().iterator();
		for(int i=0;i<map.size();i++) {
			String key = keys.next();
			it[i] = key;
		}
		
		return it;
	}
}
