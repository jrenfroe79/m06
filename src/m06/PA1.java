package m06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PA1 {

    public static void insertStaff(String id, String lastName, String firstName, String mi, String address, String city, String state, String telephone, String email) {
        try (Connection conn = Staff_Database.getConnection();
             PreparedStatement stmt = conn.prepareStatement("INSERT INTO Staff (id, lastName, firstName, mi, address, city, state, telephone, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
            stmt.setString(1, id);
            stmt.setString(2, lastName);
            stmt.setString(3, firstName);
            stmt.setString(4, mi);
            stmt.setString(5, address);
            stmt.setString(6, city);

            // Validate the length of the state data before setting it in the prepared statement
            if (state.length() > 50) {
                state = state.substring(0, 50); // Truncate the state data if it exceeds 50 characters
            }

            stmt.setString(7, state);
            stmt.setString(8, telephone);
            stmt.setString(9, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateStaff(String id, String lastName, String firstName, String mi, String address, String city, String state, String telephone, String email) {
        try (Connection conn = Staff_Database.getConnection();
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

	public static void insertStaff(String id, String lastName) {
		// TODO Auto-generated method stub
		
	}
}
