package database;

import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

public class ProductDescription {
	
	public static Map<String,String>map;
	
	public void ProductDescription() {
		map = new HashMap<String,String>();
		
		map.put("aa", "apple");
		map.put("ab", "pancil");
		map.put("bb", "book");
		map.put("ba", "snack");
		
	

	}

	public String get(String itemid) {
		ProductDescription();
		
		String desc ="";
		Iterator<String> itr = map.values().iterator();
	
		while(itr.hasNext()) {
			if(map.containsKey(itemid)) {
				desc = (String)map.get(itemid);
				break;
			}
		}
		return desc;
	}
}
