package database;


import java.util.ArrayList;

public class MarketDAO {
	
	
	public ArrayList<String> item1 = new ArrayList<String>();
	public ArrayList<String> item2 = new ArrayList<String>();
	public ArrayList<String> item3 = new ArrayList<String>();
	public ArrayList<String> item4 = new ArrayList<String>();

	
	public ArrayList MarketDAO() {
		
		item1.add("aa");
		item1.add("1000");
		item1.add("snack");
		
		item2.add("ab");
		item2.add("2000");
		item2.add("snack");
		
		item3.add("bb");
		item3.add("1000");
		item3.add("snack");
		
		item4.add("aa");
		item4.add("1000");
		item4.add("snack");
		
		return item1;

	}
}
