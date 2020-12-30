package sale;

import java.awt.List;
import java.util.ArrayList;

import database.ProductDescription;

public class Sale {
	
	private ArrayList<SalesLineItem> sl = new <SalesLineItem> ArrayList();

	public Sale() {
		 super();
		// TODO Auto-generated constructor stub
	}
	
	public void makeLineItem(ProductDescription desc, int quantity) {
		// TODO Auto-generated method stub
		//add sl  
		sl.add(new SalesLineItem(desc,quantity));
	

		
		
	}
	
	
	

	
	
	
}
