package market.pos;

import controller.Interactor;
import ui.CmdUI;

public class Main {
	
	
	 private static CmdUI ui;
	 // private static GraphicUI ui;
	 
	 public static void main(String[] args){
	        
		 Interactor interactor = new Interactor();
		 ui = new CmdUI(interactor);
		 //ui = new GraphicUI(controller);

		 ui.start();
	    }	
	
}
