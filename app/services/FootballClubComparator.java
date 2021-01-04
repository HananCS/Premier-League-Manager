package services;

import entities.FootballClub;

import java.util.Comparator;

public class FootballClubComparator implements Comparator {

    public int compare(Object obj1, Object obj2) {
        FootballClub f1 = (FootballClub) obj1;
        FootballClub f2 = (FootballClub) obj2;

        if (f1.getPoints() > f2.getPoints()) {
            return -1;
        } else if (f1.getPoints() < f2.getPoints()) {
            return 1;
        } else {
            if (f1.getGoals() - f1.getGoalsConceded() > f2.getGoals() - f2.getGoalsConceded()) {
                return -1;
            } else if (f1.getGoals() - f1.getGoalsConceded() < f2.getGoals() - f2.getGoalsConceded()) {
                return 1;
            }
            return 0;

        }
    }
}
