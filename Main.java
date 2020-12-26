import java.lang.ModuleLayer.Controller;
import java.sql.*;

public class Main {

    private static CmdUI ui;
    // private static GraphicUI ui;
    public static void main(String[] args){
        Connection con;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=root", "root", "anstnfla25");
            System.out.println("데이터베이스 접속에 성공했습니다");

        }catch(SQLException ex){
            System.out.println("SQLException"+ex);
        }
        catch(Exception ex){
            System.out.println("Exception"+ex);
        }
        
        // Controller controller = new Controller(con);

        // ui = new CmdUI(controller);
        // // ui = new GraphicUI(controller);
        // ui.start();
    }
}