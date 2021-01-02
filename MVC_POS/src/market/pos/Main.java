package market.pos;

import controller.Interactor;
import database.ProductCatalog;
import ui.CmdUI;
import ui.GraphicUI;


public class Main {
	
	
	 private static CmdUI cmd_ui;
	 private static GraphicUI graphic_ui;
	 private static ProductCatalog productcatalog;
	
	 public static void main(String[] args){
	       
		 //repository arraylist 생성 
		 productcatalog = new ProductCatalog();
    	 productcatalog.ProductCatalog1();
		 Interactor interactor = new Interactor(productcatalog);
		
//		 cmd_ui = new CmdUI(interactor);
//		 cmd_ui.start();
		 
		 graphic_ui= new GraphicUI(interactor);
		 
		 
//		 
		 
	 }}
		
	    
	
	

