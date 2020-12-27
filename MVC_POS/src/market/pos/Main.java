package market.pos;

import controller.Interactor;
import database.MarketDAO;
import ui.CmdUI;
import java.sql.*;
import java.util.ArrayList;

public class Main {
	
	
//	 private static CmdUI ui;

	 private final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	 private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/?user=root";
	 private final static String USER_NAME = "root";
	 private final static String PASSWORD = "anstnfla25";
		
	 public static ArrayList<String> itemresult = new ArrayList<String>();
		
	 public static void main(String[] args){
	        
//		 Interactor interactor = new Interactor();
//		 ui = new CmdUI(interactor);
//		 
//
//		 ui.start();
		 
		 MarketDAO md = new MarketDAO();
		 ArrayList itemresult = md.MarketDAO();
		 
	 }}
		
	    
	
	

