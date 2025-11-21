package campusapp.model;

import java.time.LocalDate;

public class AcademicEvent extends Event {

    private String buildingRoom;

    public AcademicEvent(String title, LocalDate date, String desc,
                         User creator, String buildingRoom) {
        super(title, date, desc, creator);
        this.buildingRoom = buildingRoom;
    }

    @Override
    public EventType getType() { return EventType.ACADEMIC; }

    public String getBuildingRoom() { return buildingRoom; }
}

