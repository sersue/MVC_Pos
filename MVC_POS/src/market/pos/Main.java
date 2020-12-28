package market.pos;

import controller.Interactor;
import database.MarketDAO;
import ui.CmdUI;
import java.sql.*;
import java.util.ArrayList;

public class Main {
	
	
	 private static CmdUI ui;

	
	 public static void main(String[] args){
	        
		 MarketDAO dao = new MarketDAO();
		 Interactor interactor = new Interactor(dao);
		 
		 ui = new CmdUI(interactor);
		 ui.start();
		 
//		 
		 
	 }}
		
	    
	
	

