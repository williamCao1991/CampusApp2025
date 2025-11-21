package campusapp.controllers;

import campusapp.data.EventData;
import campusapp.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.time.LocalDate;

public class AddEventController {

    @FXML private TextField titleField;
    @FXML private DatePicker datePicker;
    @FXML private TextArea descriptionField;
    @FXML private ComboBox<String> typeBox;
    @FXML private TextField extraField;

    @FXML
    public void initialize() {
        typeBox.getItems().addAll("Club", "Sports", "Academic");
    }

    @FXML
    private void saveEvent() {
        String title = titleField.getText();
        LocalDate date = datePicker.getValue();
        String desc = descriptionField.getText();
        String extra = extraField.getText();

        User user = LoginController.loggedInUser;
        Event e;

        switch (typeBox.getValue()) {
            case "Club" -> e = new ClubEvent(title, date, desc, user, extra);
            case "Sports" -> e = new SportsEvent(title, date, desc, user, extra);
            default -> e = new AcademicEvent(title, date, desc, user, extra);
        }

        EventData.add(e);

        Stage stage = (Stage) titleField.getScene().getWindow();
        stage.close();
    }
}

