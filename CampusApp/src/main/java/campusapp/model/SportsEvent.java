package campusapp.model;

import java.time.LocalDate;

public class SportsEvent extends Event {

    private String sportType;

    public SportsEvent(String title, LocalDate date, String desc,
                       User creator, String sportType) {
        super(title, date, desc, creator);
        this.sportType = sportType;
    }

    @Override
    public EventType getType() { return EventType.SPORTS; }

    public String getSportType() { return sportType; }
}

