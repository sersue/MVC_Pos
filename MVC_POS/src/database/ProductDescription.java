package database;

import java.util.HashMap;
import java.util.Iterator;
import database.ProductCatalog;
public class ProductDescription {
	
	public static HashMap<ItemID,ProductDescription>map = new <ItemID, ProductDescription> HashMap();
	private ItemID id;
	private Money price;
	private String description;
	
	public ProductDescription(ItemID id, Money price, String description) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.price = price;
		this.description = description;
	}
	
	public ItemID getItemID() {
		return id;
	}
	public Money getMoney() {
		return price;
	}
	public String getdescription() {
		return description;
	}

//	public ProductDescription get(String itemid) {
//		ProductDescription();
//		
//		ProductDescription desc;
//		Iterator<String> itr = map.values().iterator();
//		
//		if(map==null) {
//			System.out.println("There is no item in market");
//		}
//		else {
//			while(itr.hasNext()) {
//				if(map.containsKey(itemid)) {
//					desc = map.get(itemid);
//					break;}
//				}
//		}
//		return desc;
//	}
}
