/**
 *
 * @author
 * Date   11/10/25
 * Purpose  A compass of Events desscriptions, dates, and functionality of "Wavelink"
 *
 */
import java.time.LocalTime;//imports the current time functions
import java.time;
import java.util.*;

public class Events{
    private String name;
    private String description;
    private String date;
    private int people_assgn;
    private int userOneCard;


    public Events(String Name, String Description, String Date, int people_assgn, int UserOneCard){
        this.name = Name;
        this.date = Date;
        this.description =Description;
        this.userOneCard = UserOneCard;
        this.people_assgn = people_assgn;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPeople_assgn(){
        return people_assgn;
    }
    public int getUserOneCard(){
        return userOneCard;
    }



}