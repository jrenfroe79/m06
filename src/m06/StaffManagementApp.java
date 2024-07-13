package m06;

public class StaffManagementApp {

    public static void main(String[] args) {
        // Sample usage of the PA1 class
        PA1.insertStaff("1", "Doe", "John", "M", "123 Main St", "City", "State", "1234567890", "john.doe@example.com");

        PA1.updateStaff("1", "Smith", "Alice", "M", "456 Elm St", "Town", "State", "9876543210", "alice.smith@example.com");

        // You can also use PA1.viewStaff(String id) method to view staff information
    }
}
