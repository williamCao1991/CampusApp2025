package campusapp.controllers;

import campusapp.model.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class EventDetailsController {

    public static Event currentEvent;

    @FXML private Label titleLabel;
    @FXML private Label dateLabel;
    @FXML private TextArea descriptionLabel;
    @FXML private Label typeLabel;

    @FXML
    private void initialize() {
        if (currentEvent == null) return;

        titleLabel.setText(currentEvent.getTitle());
        dateLabel.setText(currentEvent.getDate().toString());
        descriptionLabel.setText(currentEvent.getDescription());
        typeLabel.setText(currentEvent.getType().toString());
    }

    @FXML
    private void rsvpPressed() {
        currentEvent.rsvp(LoginController.loggedInUser.getName());
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "RSVP successful!");
        alert.show();
    }

    @FXML
    private void close() {
        Stage stage = (Stage) titleLabel.getScene().getWindow();
        stage.close();
    }
}
