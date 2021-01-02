package database;

import java.util.HashMap;
import java.util.Iterator;
import database.ProductCatalog;
public class ProductDescription {
	
	private String id;
	private String price;
	private String description;
	
	
	@Override
	public String toString() {
		return description+":"+ price + "Won";
	}

	public ProductDescription(String id ,String price, String description) {
		
		// TODO Auto-generated constructor stub
		this.id = id;
		this.price = price;
		this.description = description;
	}
	
	public String getItemID() {
		return id;
	}
	public String getMoney() {
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
