package market.pos;

import controller.Interactor;
import database.ProductDescription;
import ui.CmdUI;


public class Main {
	
	
	 private static CmdUI ui;

	
	 public static void main(String[] args){
	        
		 ProductDescription dao = new ProductDescription();
		 Interactor interactor = new Interactor(dao);
		 
		 ui = new CmdUI(interactor);
		 ui.start();
		 
//		 
		 
	 }}
		
	    
	
	

