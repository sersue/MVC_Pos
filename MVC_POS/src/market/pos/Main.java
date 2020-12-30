package market.pos;

import controller.Interactor;
import database.ProductCatalog;
import ui.CmdUI;


public class Main {
	
	
	 private static CmdUI ui;
	 private static ProductCatalog productcatalog;
	
	 public static void main(String[] args){
	       
		 //repository arraylist 생
		 productcatalog = new ProductCatalog();
		 Interactor interactor = new Interactor(productcatalog);
		 
		 ui = new CmdUI(interactor);
		 ui.start();
		 
//		 
		 
	 }}
		
	    
	
	

