package m06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StaffManagementGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Staff Management");

        TextField idField = new TextField();
        TextField lastNameField = new TextField();
        // Add more fields for other staff information

        Button insertButton = new Button("Insert Staff");
        insertButton.setOnAction(e -> {
            String id = idField.getText();
            String lastName = lastNameField.getText();
            // Get values from other fields

            PA1.insertStaff(id, lastName /* pass other fields here */);
        });

        VBox root = new VBox(10);
        root.getChildren().addAll(idField, lastNameField, /* add other fields */ insertButton);

        primaryStage.setScene(new Scene(root, 300, 200));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
