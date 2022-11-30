package ua.homework.lesson16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {

    private static final String URL = "jdbc:mysql://localhost/test?user=root&password=";

    public DbConnector(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        }catch (ClassNotFoundException | IllegalAccessException  | InstantiationException e){
            e.printStackTrace();
        }
    }


    public Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(URL);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
