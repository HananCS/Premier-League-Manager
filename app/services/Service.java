package services;
import entities.FootballClub;
import entities.Match;

import java.io.*;
import java.util.*;

public class Service {
    private static Service instance;


    public static Service getInstance() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    public ArrayList<FootballClub> getClub() throws IOException {
        ArrayList<FootballClub> clubList = new ArrayList<>();

        FileInputStream fis = new FileInputStream("Club.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        for(;;) {
            try {
                FootballClub club = (FootballClub) ois.readObject();
                clubList.add(club);
            }
            catch (EOFException | ClassNotFoundException e) {
                break;
            }
        }
        fis.close();
        ois.close();

        clubList.sort(new FootballClubComparator());

        return clubList;

    }

    public ArrayList<Match> getMatch() throws IOException {
        ArrayList<Match> matchList = new ArrayList<>();

        FileInputStream fis = new FileInputStream("Match.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        for(;;) {
            try {
                Match match = (Match) ois.readObject();
                matchList.add(match);

            }
            catch (EOFException | ClassNotFoundException e) {
                break;
            }
        }
        fis.close();
        ois.close();

        matchList.sort(new DateComparator());

        return matchList;
    }

    public ArrayList<FootballClub> getClub2() throws IOException {
        ArrayList<FootballClub> clubList = new ArrayList<>();

        FileInputStream fis = new FileInputStream("Club.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        for(;;) {
            try {
                FootballClub club = (FootballClub) ois.readObject();
                clubList.add(club);
            }
            catch (EOFException | ClassNotFoundException e) {
                break;
            }
        }
        fis.close();
        ois.close();

        clubList.sort(new GoalComparator());

        return clubList;

    }

    public ArrayList<FootballClub> getClub3() throws IOException {
        ArrayList<FootballClub> clubList = new ArrayList<>();

        FileInputStream fileInputStream = new FileInputStream("Club.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        for(;;) {
            try {
                FootballClub club = (FootballClub) objectInputStream.readObject();
                clubList.add(club);
            }
            catch (EOFException | ClassNotFoundException e) {
                break;
            }
        }
        fileInputStream.close();
        objectInputStream.close();

        clubList.sort(new LargestWinComparator());

        return clubList;

    }

    public Match addMatch(Match match) throws IOException {
        ArrayList<Match> matchList = new ArrayList<>();
        FileOutputStream fos = new FileOutputStream("Match.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(Match match1:matchList){
            oos.writeObject(match1);
        }

        oos.flush();
        fos.close();
        oos.close();

        return match;
    }



}
