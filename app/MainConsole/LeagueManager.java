package MainConsole;

import java.io.IOException;

public interface LeagueManager {

    public void createNewTeam();
    public void deleteExistingTeam();
    public void displayStats();
    public void displayLeagueTable();
    public void addMatch();
    public void saveData(String filename) throws IOException;
    public void retrieveData(String filename) throws IOException, ClassNotFoundException;
    public void saveMatchData(String filename) throws IOException;
    public void retrieveMatchData(String filename) throws IOException, ClassNotFoundException;
    public void exit();

}
