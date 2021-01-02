package sale;

import java.awt.List;

import java.util.ArrayList;

import database.ProductCatalog;
import database.ProductDescription;

public class Sale {
	
	private ArrayList<SalesLineItem> sl = new <SalesLineItem> ArrayList();

	public Sale() {
		 super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "" + sl + "";
	}

	public ArrayList<SalesLineItem> makeLineItem(ProductDescription desc, int quantity) {
		// TODO Auto-generated method stub 
	    sl.add(new SalesLineItem(desc,quantity));
//	    System.out.println(sl);
		return sl;

	}

	public int makePayment(ArrayList<SalesLineItem> result, int quantity) {
		// TODO Auto-generated method stub
		int pay =0;
		for (int i=0;i<result.size();i++) {
			pay = pay + (result.get(i).getdesc().getMoney())*quantity;
		}
		

		return pay;
	}
	
	
	
	

	
	
	
}
