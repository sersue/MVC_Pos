package controller;
import ui.CmdUI;
import database.ProductCatalog;
import database.ProductDescription;
import sale.Sale;
import sale.SalesLineItem;

import java.util.ArrayList;



public class Interactor {
	
	private ProductCatalog productcatalog;
	private String itemid;
	private int quantity;
	private Sale currentSale;
	private ProductCatalog spec;
	private ProductDescription desc;
	private Sale EndSale;
	private int payment;
	ArrayList<SalesLineItem> result;
	 public Interactor(ProductCatalog productcatalog) {
		 super();
		 this.productcatalog = productcatalog;
		// TODO Auto-generated constructor stub
	}

	public void makeNewSale(){
		currentSale = new Sale();
		System.out.println("Sale 시작!");
		
     }
	
	
    public ArrayList<SalesLineItem> enterItem(String itemid,int quantity){
    	
    	 spec = new ProductCatalog();
//    	 System.out.println("Searching at productCatalog: Please Wait");
    	 desc = spec.getProductDesc(itemid); 
    	 result = currentSale.makeLineItem(desc,quantity);
    	 
 
    	 return result;

    }

	public int makePayment() {
		EndSale = new Sale();
		payment =0;
   	 	payment = EndSale.makePayment(result);
   	 	return payment;
		
	}
	public double afterTax() {
		double final_payment=0;
		final_payment = EndSale.calcTax(payment);
   	 	return final_payment;

	}
	
	public String[] getitemid() {
		ProductCatalog items = new ProductCatalog(); 	
		return items.getitemid();
	}
	public int price(String itemid,int quantity) {
		ProductCatalog items1 = new ProductCatalog();
		int subprice = (items1.getProductDesc(itemid).getMoney())*quantity;
		return subprice;

	}
	public String Description(String itemid) {
		ProductCatalog items2 = new ProductCatalog();
		String description = items2.getProductDesc(itemid).getdescription();
		return description;

	}

	
	
     

}
