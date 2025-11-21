package campusapp.model;

import java.time.LocalDate;

public class ClubEvent extends Event {

    private String clubName;

    public ClubEvent(String title, LocalDate date, String desc,
                     User creator, String clubName) {
        super(title, date, desc, creator);
        this.clubName = clubName;
    }

    @Override
    public EventType getType() { return EventType.CLUB; }

    public String getClubName() { return clubName; }
}

