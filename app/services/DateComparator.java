package services;

import entities.Match;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class DateComparator implements Comparator {
    public int compare(Object obj1, Object obj2) {
        Match m1 = (Match) obj1;
        Match m2 = (Match) obj2;


        try {
            if (new SimpleDateFormat("dd/MM/yyyy").parse(m1.getDate()).before(new SimpleDateFormat("dd/MM/yyyy").parse(m2.getDate()))) {
                return -1;
            } else if (new SimpleDateFormat("dd/MM/yyyy").parse(m1.getDate()).after(new SimpleDateFormat("dd/MM/yyyy").parse(m2.getDate()))) {
                return 1;
            } else {
                return 0;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}








