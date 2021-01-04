package entities;

import java.io.Serializable;
import java.util.Objects;

public class SportsClub implements Serializable {
    private String clubName;
    private String location;

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}

