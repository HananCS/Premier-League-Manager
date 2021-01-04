package services;

import entities.FootballClub;

import java.util.Comparator;

public class GoalComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        FootballClub f1 = (FootballClub) obj1;
        FootballClub f2 = (FootballClub) obj2;

        return Integer.compare(f2.getGoals(), f1.getGoals());
    }
}
