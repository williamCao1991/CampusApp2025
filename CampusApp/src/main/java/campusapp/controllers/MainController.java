package campusapp.controllers;

import campusapp.data.EventData;
import campusapp.model.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

public class MainController {

    @FXML private ListView<Event> eventList;

    @FXML
    public void initialize() {
        eventList.setItems(EventData.getEvents());
    }

    @FXML
    private void addEvent() {
        openWindow("/views/add_event.fxml", "Add Event");
    }

    @FXML
    private void viewDetails() {
        Event selected = eventList.getSelectionModel().getSelectedItem();
        if (selected == null) return;

        EventDetailsController.currentEvent = selected;
        openWindow("/views/event_details.fxml", "Event Details");
    }

    @FXML
    private void deleteEvent() {
        Event e = eventList.getSelectionModel().getSelectedItem();
        if (e == null) return;

        if (!e.getCreator().matches(LoginController.loggedInUser.getName(),
                LoginController.loggedInUser.getId850())) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "You may only delete events you created.");
            alert.show();
            return;
        }

        EventData.remove(e);
    }

    private void openWindow(String path, String title) {
        try {
            FXMLLoader fxml = new FXMLLoader(getClass().getResource(path));
            Stage stage = new Stage();
            stage.setScene(new Scene(fxml.load()));
            stage.setTitle(title);
            stage.show();
        } catch (Exception e) { e.printStackTrace(); }
    }
}

