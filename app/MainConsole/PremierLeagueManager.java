package MainConsole;

import entities.FootballClub;
import entities.Match;
import services.FootballClubComparator;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PremierLeagueManager implements LeagueManager,Serializable {


    private int numberOfClubs;
    private Scanner input;
    private ArrayList<FootballClub> clubList;
    private ArrayList<Match> matchList;

    public PremierLeagueManager(int numberOfClubs) {
        this.numberOfClubs = numberOfClubs;
        clubList = new ArrayList<>();
        matchList = new ArrayList<>();
        input = new Scanner(System.in);

    }

    //creating club with its additional details
    public void createNewTeam() {


        if (clubList.size() == numberOfClubs) {
            System.out.println("Clubs are fully added to this league. No more club can't be added");
            return;
        }

        FootballClub club = new FootballClub();
        System.out.println("Insert Club Name: ");
        String obj = input.nextLine();
        if(obj.isEmpty()){
            System.out.println("Don't leave without filling the name.");
            return;
        }
        club.setClubName(obj);

        for (FootballClub club1: clubList){
            try{
                if (club1.getClubName().equals(obj)) {
                    System.out.println("It's already added, Add New Club");
                    return;
                }} catch (NullPointerException exception){
                break;
            }

        }


        System.out.println("Insert Club Location: ");
        obj = input.nextLine();
        if(obj.isEmpty()){
            System.out.println("Don't leave without filling the location.");
            return;
        }
        club.setLocation(obj);
        clubList.add(club);


    }

    // removing a club from the entire league by inserting its name
    public void deleteExistingTeam() {

        System.out.println("Insert Club Name");
        String obj = input.nextLine();
        for (FootballClub club : clubList) {
            if (club.getClubName().equals(obj)) {
                clubList.remove(club);
                System.out.println("Club(" + club.getClubName() + ") is removed from the league");
                return;
            }
        }
        System.out.println("This club is not still added to the league!!!");
    }


    //Individual club's information
    public void displayStats() {
        System.out.println("Insert club name: ");
        String obj = input.nextLine();
        for (FootballClub club : clubList) {
            if (club.getClubName().equals(obj)) {
                System.out.println("Played Matches: " + club.getPlayedMatches());
                System.out.println("Wins: " + club.getWins());
                System.out.println("Losses: " + club.getLosses());
                System.out.println("Draws: " + club.getDraws());
                System.out.println("Goals: " + club.getGoals());
                System.out.println("Goals Conceded: " + club.getGoalsConceded());
                System.out.println("Points: " + club.getPoints());
                return;
            }

        }
        System.out.println("This club is not still added to the league!!!");
    }

    //display the club's position in the league with its statistics
    public void displayLeagueTable() {

        clubList.sort(new FootballClubComparator());
        for (FootballClub club : clubList) {
            System.out.println(club);
        }
    }

    //adding a match with opponent's details such as name, score and date which took place
    public void addMatch()  {

        if (clubList.size() == 0) {
            System.out.println("Please insert a teams before adding matches");
        } else
        {
            System.out.println("Enter the date in DD/MM/YYYY format");
            String objD = input.nextLine();
            Date date;
            try {
                date = new SimpleDateFormat("dd/MM/yyyy").parse(objD);
            } catch (ParseException ex) {
                System.out.println("Invalid input");
                return;
            }

            System.out.println("Enter the Club(Home) name");
            String objH = input.nextLine();
            FootballClub home = null;
            for (FootballClub club : clubList) {
                if (club.getClubName().equals(objH)) {
                    home = club;

                }

            }
            if(home==null){
                System.out.println("Please insert an home club which is already participated");
                return;
            }

            System.out.println("Enter the Club(Away) name");
            String objA = input.nextLine();
            FootballClub away = null;
            for (FootballClub club : clubList) {
                if (club.getClubName().equals(objA)) {
                    away = club;

                }
            }
            if(away==null){
                System.out.println("Please insert an away club which is already participated");
                return;
            }

            if(home==away){
                System.out.println("Same team is added twice, Add different teams");
                return;
            }

            System.out.println("Enter the Club(Home) goals");
            String objHG = input.nextLine();
            int goalsH = -10;
            try {
                goalsH = Integer.parseInt(objHG);
            } catch (Exception e) {
                System.out.println("Invalid input");
            } if(goalsH==-10){
            System.out.println("please insert goals in numbers");
            return;
        }

            if(goalsH<0){
                System.out.println("Home Goals Can't Be Negative");
                return;
            }

            System.out.println("Enter the Club(Away) goals");
            String objAG = input.nextLine();
            int goalsA = -10;
            try {
                goalsA = Integer.parseInt(objAG);
            } catch (Exception ignored){

            }
            if (goalsA == -10) {
                System.out.println("please insert goals in numbers");
                return;
            }

            if(goalsA<0){
                System.out.println("Away Goals Can't Be Negative");
                return;
            }

            home.setGoals(home.getGoals()+goalsH);
            away.setGoals(away.getGoals()+goalsA);
            home.setGoalsConceded(home.getGoalsConceded()+ goalsA);
            away.setGoalsConceded(away.getGoalsConceded()+ goalsH);
            home.setPlayedMatches(home.getPlayedMatches()+1);
            away.setPlayedMatches(away.getPlayedMatches()+1);

            if(goalsH > goalsA){
                home.setWins(home.getWins()+1);
                away.setLosses(away.getLosses()+1);
                home.setPoints(home.getPoints()+3);
            } else if (goalsH < goalsA){
                away.setWins(away.getWins()+1);
                home.setLosses(home.getLosses()+1);
                away.setPoints(away.getPoints()+3);
            } else{
                home.setDraws(home.getDraws()+1);
                away.setDraws(away.getDraws()+1);
                home.setPoints(home.getPoints()+1);
                away.setPoints(away.getPoints()+1);
            }

            Match match = new Match();
            match.setClub1(home);
            match.setClub2(away);
            match.setClub1_scores(goalsH);
            match.setClub2_scores(goalsA);
            match.setDate(objD);
            matchList.add(match);

        }
    }

    //saving all the club data
    public void saveData(String filename) throws IOException {

        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for (FootballClub club:clubList){
            oos.writeObject(club);
        }


        oos.flush();
        fos.close();
        oos.close();


    }

    //retrieving all the club data
    public void retrieveData(String filename) throws IOException,ClassNotFoundException {

        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);

        for(;;){
            try{

                FootballClub club = (FootballClub)ois.readObject();
                clubList.add(club);

            } catch (EOFException eofException){
                break;
            }
        }

        fis.close();
        ois.close();


    }

    //saving all the match data
    public void saveMatchData(String filename) throws IOException {
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        for(Match match:matchList){
            oos.writeObject(match);
        }

        oos.flush();
        fos.close();
        oos.close();

        System.out.println("All data are saved");
    }

    //retrieving all the match data
    public void retrieveMatchData(String filename) throws IOException,ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);

        for(;;){
            try{

                Match match = (Match) ois.readObject();
                matchList.add(match);



            } catch (EOFException eofException){
                break;
            }
        }

        fis.close();
        ois.close();

        System.out.println("All data are retried back");
    }

    //exit the console application
    public void exit () {
        System.exit(0);
    }


}




