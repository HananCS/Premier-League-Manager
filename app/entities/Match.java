package entities;

import java.io.Serializable;
import java.util.Date;

public class Match implements Serializable {

    private FootballClub club1;
    private FootballClub club2;
    private String date;
    private int club1_scores;
    private int club2_scores;

    public FootballClub getClub1() {
        return club1;
    }

    public void setClub1(FootballClub club1) {
        this.club1 = club1;
    }

    public FootballClub getClub2() {
        return club2;
    }

    public void setClub2(FootballClub club2) {
        this.club2 = club2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getClub1_scores() {
        return club1_scores;
    }

    public void setClub1_scores(int club1_scores) {
        this.club1_scores = club1_scores;
    }

    public int getClub2_scores() {
        return club2_scores;
    }

    public void setClub2_scores(int club2_scores) {
        this.club2_scores = club2_scores;
    }

}

