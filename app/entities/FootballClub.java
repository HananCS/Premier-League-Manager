package entities;

import java.io.Serializable;

public class FootballClub extends SportsClub implements Serializable {
    private int playedMatches;
    private int wins;
    private int losses;
    private int draws;
    private int goals;
    private int goalsConceded;
    private int points;

    public int getPlayedMatches() {
        return playedMatches;
    }

    public void setPlayedMatches(int playedMatches) {
        this.playedMatches = playedMatches;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(int goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Club: "+getClubName()+
                " playedMatches=" + playedMatches +
                ", wins=" + wins +
                ", losses=" + losses +
                ", draws=" + draws +
                ", goals=" + goals +
                ", goalsConceded=" + goalsConceded +
                ", points=" + points;
    }
}

