package MainConsole;


import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.text.ParseException;
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException, URISyntaxException {
        PremierLeagueManager obj = new PremierLeagueManager(40);
        File f = new File("Club.txt");
        if(!f.exists()){
            f.createNewFile();
        }else{
            obj.retrieveData("Club.txt");
        }
        File f1 = new File("Match.txt");
        if(!f1.exists()){
            f1.createNewFile();
        }else{
            obj.retrieveMatchData("Match.txt");
        }
            while (true) {
                System.out.println("...Premier League Manager...");
                System.out.println("Create a new team==> Press 1");
                System.out.println("Delete Team ==> Press 2");
                System.out.println("Display Various Stats of particular Club==> Press 3");
                System.out.println("Display league table ==> Press 4");
                System.out.println("Add match ==> Press 5");
                System.out.println("GUI ==> Press 6");
                System.out.println("Save Data ==> Press 7");
                System.out.println("Exit ==> Press 8");
                Scanner input = new Scanner(System.in);
                String line = input.nextLine();

                switch (line) {
                    case "1":
                        obj.createNewTeam();
                        break;
                    case "2":
                        obj.deleteExistingTeam();
                        break;
                    case "3":
                        obj.displayStats();
                        break;
                    case "4":
                        obj.displayLeagueTable();
                        break;
                    case "5":
                        obj.addMatch();
                        break;
                    case "6":
                        Desktop desktop = Desktop.getDesktop();
                        URI url = new URI("http://localhost:4200/");
                        desktop.browse(url);
                        break;
                    case "7":
                        obj.saveData("Club.txt");
                        obj.saveMatchData("Match.txt");
                        break;
                    case "8":
                        System.out.println("Premier League Console App Exited");
                        obj.exit();
                        break;
                    default:
                        System.out.println("invalid");

                }


            }
    }


}




