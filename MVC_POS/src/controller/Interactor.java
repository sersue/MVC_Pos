package controller;
import ui.CmdUI;

import database.ProductCatalog;
import database.ProductDescription;
import sale.Sale;


public class Interactor {
	
	private ProductDescription dao;
	private String itemid;
	private int quantity;
	
	 public Interactor(ProductDescription dao) {
		 super();
		 this.dao = dao;
		// TODO Auto-generated constructor stub
	}

	public void makeNewSale(){
		Sale s = new Sale();
		s.sale();
		System.out.println("item을 enter 해주세요!");
     }
	
	
    public String enterItem(String itemid,int quantity){
    	
    	 ProductCatalog spec = new ProductCatalog();
    	 System.out.println("Searching at productCatalog: Please Wait");
    	 spec.getProductDesc(itemid); 	
    	 
 		 return spec.getProductDesc(itemid);

    }
//     public void endSale(){
//
//     }

}
