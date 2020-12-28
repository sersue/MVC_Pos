package controller;

import database.MarketDAO;
import sale.Sale;

public class Interactor {
	
	private MarketDAO dao;
	
	 public Interactor(MarketDAO dao) {
		 super();
		 this.dao = dao;
		// TODO Auto-generated constructor stub
	}

	public void makeNewSale(){
		Sale sale = new Sale();
		System.out.println("Sale 객체 생성 ! ");
     }
//     public void enterItem(itemid,quantity){
//
//     }
//     public void endSale(){
//
//     }

}
