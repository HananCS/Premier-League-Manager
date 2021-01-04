package services;

import entities.FootballClub;

import java.util.Comparator;

public class LargestWinComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        FootballClub f1 = (FootballClub) obj1;
        FootballClub f2 = (FootballClub) obj2;

        return Integer.compare(f2.getGoals() - f2.getGoalsConceded(), f1.getGoals() - f1.getGoalsConceded());
    }
}
