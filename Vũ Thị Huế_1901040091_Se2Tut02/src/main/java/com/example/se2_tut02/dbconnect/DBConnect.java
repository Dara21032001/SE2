package com.example.se2_tut02.dbconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static final String DB_URL = "jdbc:mysql://localhost/bookdb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD ="hue21032001";
    public static  Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
