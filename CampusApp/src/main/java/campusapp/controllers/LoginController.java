package campusapp.controllers;

import campusapp.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class LoginController {

    @FXML private TextField nameField;
    @FXML private TextField idField;
    @FXML private Label errorLabel;

    public static User loggedInUser;

    @FXML
    private void loginPressed() {
        String name = nameField.getText().trim();
        String id   = idField.getText().trim();

        if (!id.matches("850\\d{6}")) {
            errorLabel.setText("ID must start with 850 and be 9 digits");
            return;
        }

        loggedInUser = new User(name, id);

        try {
            FXMLLoader fxml = new FXMLLoader(getClass().getResource("/views/main.fxml"));
            Stage stage = (Stage) nameField.getScene().getWindow();
            stage.setScene(new Scene(fxml.load()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

