package database;

import java.util.HashMap;
import java.util.Map;

import java.util.Iterator;

public class ProductDescription {
	
	HashMap map;
	
	public Map ProductDescription() {
		Map <String,String> map = new HashMap<String,String>();
		
//		String itemValue[][] = {{"apple"},{},{},{}};
		
		map.put("aa", "apple");
		map.put("ab", "pancil");
		map.put("bb", "book");
		map.put("ba", "snack");
		
	return map;

	}

	public String get(String itemid) {
		// TODO Auto-generated method stub
		String desc ="";
		Iterator it = map.values().iterator();
		
		while(it.hasNext()) {
			if(map.containsKey(itemid)) {
				desc = (String)map.get(itemid);
			}
		}
	
		return desc;
	}
}
