package sale;

import java.util.ArrayList;

import database.ProductDescription;

public class SalesLineItem {

	private ProductDescription desc;
	private int quantity;
	
	public SalesLineItem(ProductDescription desc, int quantity) {
		this.desc = desc;
		this.quantity = quantity;
		// TODO Auto-generated constructor stub
	}
	public ProductDescription getdesc() {
		return desc;
	}
	public int getquantity() {
		return quantity;
	}
	@Override
	public String toString() {
		return "" + desc + ":" + quantity + "개";
	}
	

}
