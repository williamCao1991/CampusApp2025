package campusapp.data;

import campusapp.model.Event;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Collections;

public class EventData {

    private static ObservableList<Event> events =
            FXCollections.observableArrayList();

    public static ObservableList<Event> getEvents() {
        Collections.sort(events);
        return events;
    }

    public static void add(Event e) {
        events.add(e);
    }

    public static void remove(Event e) {
        events.remove(e);
    }
}


