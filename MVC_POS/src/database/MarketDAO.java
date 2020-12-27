package database;

import java.sql.*;
import java.util.ArrayList;

public class MarketDAO {
	
	private final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private final String DB_URL = "jdbc:mysql://127.0.0.1:3306/?user=root";
	private final String USER_NAME = "root";
	private final String PASSWORD = "anstnfla25";
	
	public ArrayList<String> itemresult = new ArrayList<String>();
	
	public ArrayList MarketDAO() {
		
		Connection conn = null;
		Statement state = null;
		
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
			System.out.println("Mysql connection");
			
			state = conn.createStatement();
			
			String sql;
			sql = "SELECT * FROM item";
			ResultSet rs = state.executeQuery(sql);
			
			
			while(rs.next()) {
				
				String itemid = rs.getString("itemid");
				String price = rs.getString("price");
				String description = rs.getString("description");
				
				itemresult.add(itemid);
				itemresult.add(price);
				itemresult.add(description);
//				System.out.println("itemid: "+itemid+"price:"+price+"description:"+description);
			}
			
			rs.close();
			state.close();
			conn.close();
			
		}catch(Exception e) {
			System.out.print("Err1");
			
		} finally {
			try {
				if(state!=null)
					state.close();
			}catch(SQLException ex1) {
				System.out.print("Err2");

				
			}
		}try {
			if(conn!=null) {
				conn.close();
			}
		}catch(SQLException ex1) {
			System.out.print("Err3");

			
		}
	return this.itemresult;

}
}
