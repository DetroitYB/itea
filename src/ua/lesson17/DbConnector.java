package ua.lesson17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {


    public DbConnector(){
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC").newInstance();
        } catch (Exception e) {
        }

    }


    public Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:sqlite:blabla.db");
            System.out.println("Connection obtained");
        }catch (SQLException e){
            e.printStackTrace();
        }
        return conn;
    }
}
