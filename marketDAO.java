import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class marketDAO { //data access object

    public List<itemData> getAllItems() {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver"); // 동적 클래스 로드 (oracleDriver이라는 클래스를 로드하는것)
        } catch (ClassNotFoundException e) { // catch에 있는 모든 것들은 이와 같이 쓴다.
            throw new RuntimeException(e.getMessage(), e);
        }
        
        Connection conn = null;
        PreparedStatement stmt = null; // statement와 PreparedStatement는 데이터를 어떤식으로 바이딩하는가의 차이가 있다.
        ResultSet rs = null; // select 할 때만 필요하다. 결과를 담아야 하므로 
         
        //employees list에 데이터를 하나씩 넣을 것이다.
        List<itemData> items = new ArrayList<itemData>();
        
        // 담아주는 코드
        try {
            // DB에 연결
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "anstnfla25");
            
            
            String query = " SELECT * FROM item "; 
            stmt = conn.prepareStatement(query);
            
            // Query의 실행 결과를 가져온다. 
            // Select 쿼리 일 때만 사용한다.
            rs = stmt.executeQuery();
            
            itemData item = null;
            while ( rs.next() ) { //next의 의미 : 읽어올때 데이터의 처음부터 읽어오므로 next를 만나면 한 로우를 읽어오고 다음로우로 내려간다. next하면 한줄한줄 내려가면서 데이터를 가져오게 하는 역할 끝까지 가서 next를 만나면 반복이 끝난다.
                item = new itemData();
                
                item.setEmployeeId(rs.getInt("id")); // 가져올 컬럼의 데이터 타입에 따라서 결정, 괄호 안에는 컬럼 이름을 적어준다. EMPLYOEE_ID에 해당하는 데이터를 가져온다.
                item.setFirstName(rs.getString("itemid"));
                item.setLastName(rs.getDouble("price"));
                item.setEmail(rs.getString("description"));
                
                //만들어둔 리스트에 넣는다.
                items.add(item);
                
            }
            
            
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        finally { //다쓰면 연결을 해제해야한다. 해제를 안시키면 다른 사용자가 쓸수 없으므로. 닫을때 finally를 사용하여 닫는다.
            // 열렸는지 체크하면서 닫아줘야한다. 값이변경됬는지 보고 열린지 판단 / resultset부터 반대로 확인 > statement > connection 순으로
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {}
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {}
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }            
        }
        
        return employees;
    }



    
}
