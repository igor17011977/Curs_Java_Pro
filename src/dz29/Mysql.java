package dz29;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mysql {
    static public Connection conn;
    public Connection getConnection()  {
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        String username = "root";
        String password = "Ulia11_11";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to Store DB succesfull!");
        }catch(Exception e){
            System.out.println("Connection failed..."+e.getMessage());
        }
        return conn;
    }
}
