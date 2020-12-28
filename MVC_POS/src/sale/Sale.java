package sale;

import database.ProductDescription;

public class Sale {
	
	private SalesLineItem sli;

	public Sale() {
		 super();
		// TODO Auto-generated constructor stub
	}
	
	public void sale() {
		Sale s = new Sale();
		System.out.println("Sale 객체 s 생성 ! ");
		sli = new SalesLineItem();
		sli.makeSaleLineItem();
	}
	
	
	

	
	
	
}
