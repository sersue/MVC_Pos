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
     public int makePayment(int quantity){
    	 Sale EndSale = new Sale();
    	 int payment=EndSale.makePayment(result,quantity);
    	 return payment;

     }

}
