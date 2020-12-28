package controller;

import database.ProductCatalog;
import database.ProductDescription;
import sale.Sale;


public class Interactor {
	
	private ProductDescription dao;

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
	
     public void enterItem(String itemid,int quantity){

    	 ProductCatalog spec = new ProductCatalog();
    	 spec.getProductDesc(itemid);
 		 System.out.println("move to productCatalog");


    }
//     public void endSale(){
//
//     }

}
