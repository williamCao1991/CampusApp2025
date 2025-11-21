package campusapp.model;

import java.time.LocalDate;

public abstract class Event implements RSVPAble, Comparable<Event> {

    private String title;
    private LocalDate date;
    private String description;
    private User creator;
    private boolean rsvped;

    public Event(String title, LocalDate date, String description, User creator) {
        this.title = title;
        this.date = date;
        this.description = description;
        this.creator = creator;
    }

    public abstract EventType getType();

    public String getTitle() { return title; }
    public LocalDate getDate() { return date; }
    public String getDescription() { return description; }
    public User getCreator() { return creator; }
    public boolean isRsvped() { return rsvped; }

    @Override
    public void rsvp(String userName) {
        rsvped = true;
        System.out.println(userName + " RSVPed to " + title);
    }

    @Override
    public int compareTo(Event e) {
        return this.date.compareTo(e.date);
    }

    @Override
    public String toString() {
        return date + " - " + title;
    }
}

