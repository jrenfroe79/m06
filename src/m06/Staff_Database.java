package m06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Staff_Database {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/staff_database";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading MySQL JDBC Driver: " + e.getMessage());
            throw new SQLException("Driver not found");
        }
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static void main(String[] args) {
        // This main method is fine as it is
    }
}
