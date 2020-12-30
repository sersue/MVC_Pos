package database;

import java.util.HashMap;
import java.util.Map;
import database.ItemID;
import database.Money;
import database.ProductDescription;
//database Map을 관리하는 객체 
public class ProductCatalog {
	
	public static HashMap<ItemID,ProductDescription>map = new <ItemID, ProductDescription> HashMap();

	public ProductCatalog() {
		ItemID id1 = new ItemID(1);
		ItemID id2 = new ItemID(2);
		Money price = new Money(3000);
		
		ProductDescription desc; 
		desc = new ProductDescription(id1,price,"apple");
		desc = new ProductDescription(id2,price,"banna");
		
		map.put(id1,desc);
		map.put(id2, desc);

	}
	public ProductDescription getProductDesc(ItemID itemid) {
		// TODO Auto-generated method stub
		
		return map.get(itemid);
		
	}

}
