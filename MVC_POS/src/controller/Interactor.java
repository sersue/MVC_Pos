package controller;

import database.MarketDAO;
import sale.Sale;
import ui.CmdUI;

public class Interactor {
	
	private MarketDAO dao;
	private Sale s;
	 
	 public Interactor(MarketDAO dao) {
		 super();
		 this.dao = dao;
		// TODO Auto-generated constructor stub
	}

	public void makeNewSale(){
		s.Sale();
		
     }
	
     public void enterItem(String itemid,String quantity){
    	 getProductDesc(itemid);
    	 

    }
//     public void endSale(){
//
//     }

}
