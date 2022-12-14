package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private final static String URL = "jdbc:mysql://localhost:3306/db_mysql";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "root";

    private static Connection connection;

    public static Connection getConnection(){
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection complete successfully");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void connectionClose(){
        try {
            connection.close();
            System.out.println("Connection close successfully");
        } catch (NullPointerException | SQLException e) {
            e.printStackTrace();
        }
    }
}
