package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection connectToDb() throws Exception{

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb","root","root");
        return con;
    }




}
