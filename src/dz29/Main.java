package dz29;
import java.sql.*;

public class Main extends Mysql{
    static Statement stmt=null;
    static Connection conn;
    static ResultSet rs;
    public static void main(String[] args) throws SQLException {
        Mysql mysql=new Mysql();
        try {
            conn = mysql.getConnection();
            stmt = conn.createStatement();
            stmt.executeUpdate("insert into orders values (10428,'2023-01-05','2023-06-07',NULL,'In Process',NULL,119)");
            stmt.executeUpdate("update orders set status='Shipped',shippedDate = '2023-04-2023', comments='Oll right' where orderNumber=10428");
            stmt.executeUpdate("DELETE FROM orders WHERE orderNumber=10427");
            rs= stmt.executeQuery("select * from orders where orderNumber=10428");
            while (rs.next()) {
                System.out.println("orderNumber "+rs.getInt("orderNumber"));
                System.out.println("OrderDate "+rs.getDate("orderDate"));
                System.out.println("requiredDate "+rs.getDate("requiredDate"));
                System.out.println("shippedDate "+rs.getDate("shippedDate"));
                System.out.println("status "+rs.getString("status"));
                System.out.println("comments "+rs.getString("comments"));
                System.out.println("customerNumber "+rs.getInt("customerNumber"));
            }
        }catch (Exception e){
            System.out.println("Не получилося "+e.getMessage());
        }
        conn.close();
    }
}
