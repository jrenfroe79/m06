package m06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class staff_database {

    public static void main(String[] args) {
        // MySQL database URL
        String url = "jdbc:mysql://localhost:3306/staff_database";
        String user = "root";
        String password = "";

        try {
            // Establish a connection
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the database!");

            // You can now execute queries, updates, etc. using this connection

            // Don't forget to close the connection when done
            connection.close();
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }
}
