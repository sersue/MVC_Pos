package controller;
import ui.CmdUI;
import database.ProductCatalog;
import database.ProductDescription;
import sale.Sale;
import sale.SalesLineItem;

import java.util.ArrayList;

import database.ItemID;

public class Interactor {
	
	private ProductCatalog productcatalog;
	private String itemid;
	private int quantity;
	private Sale currentSale;
	
	 public Interactor(ProductCatalog productcatalog) {
		 super();
		 this.productcatalog = productcatalog;
		// TODO Auto-generated constructor stub
	}

	public void makeNewSale(){
		currentSale = new Sale();
		System.out.println("new Sale 생성 !");
     }
	
	
    public ArrayList<SalesLineItem> enterItem(ItemID itemid,int quantity){
    	
    	 ProductCatalog spec = new ProductCatalog();
    	 System.out.println("Searching at productCatalog: Please Wait");
    	 ProductDescription desc = spec.getProductDesc(itemid); 
    
    	 ArrayList<SalesLineItem> result = currentSale.makeLineItem(desc,quantity);
    	 return result;

    }
//     public void endSale(){
//
//     }

}
