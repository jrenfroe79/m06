package m06;

// Sample code to connect to MySQL database and perform operations

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PA1 {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/staff_database";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static void viewStaff(String id) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM Staff WHERE id = ?")) {
            stmt.setString(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                // Display or process the retrieved staff information
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertStaff(String id, String lastName, String firstName, String mi, String address, String city, String state, String telephone, String email) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Staff VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
            stmt.setString(1, id);
            stmt.setString(2, lastName);
            stmt.setString(3, firstName);
            stmt.setString(4, mi);
            stmt.setString(5, address);
            stmt.setString(6, city);
            stmt.setString(7, state);
            stmt.setString(8, telephone);
            stmt.setString(9, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStaff(String id, String lastName, String firstName, String mi, String address, String city, String state, String telephone, String email) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement("UPDATE Staff SET lastName = ?, firstName = ?, mi = ?, address = ?, city = ?, state = ?, telephone = ?, email = ? WHERE id = ?")) {
            stmt.setString(1, lastName);
            stmt.setString(2, firstName);
            stmt.setString(3, mi);
            stmt.setString(4, address);
            stmt.setString(5, city);
            stmt.setString(6, state);
            stmt.setString(7, telephone);
            stmt.setString(8, email);
            stmt.setString(9, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
