package sale;

import java.awt.List;
import java.util.ArrayList;
import database.ProductCatalog;
import database.ProductDescription;

public class Sale {
	
	private ArrayList<SalesLineItem> sl = new <SalesLineItem> ArrayList();
	public int price;


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
		if(desc!=null) {
			sl.add(new SalesLineItem(desc,quantity));
		}
		else {
			
		}
//	    System.out.println(sl);
		return sl;

	}

	public int makePayment(ArrayList<SalesLineItem> result) {
		// TODO Auto-generated method stub
		int pay =0;
		int quan = 0;
		for (int i=0;i<result.size();i++) {
			pay =(result.get(i).getdesc().getMoney());
			quan = (result.get(i).getquantity());
			price = price + pay*quan;
		}
		return price;
	}
	
	public double calcTax(int price) {
		double tax = 0;
		tax =price*0.1;
		return tax+price;
	}
	
	
	
	

	
	
	
}
