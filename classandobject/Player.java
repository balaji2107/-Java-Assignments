package classandobject;

public class Player {
    public String playerName;
    public String position;
    public int jerseyNumber;
    public Team team;

    public Player(String playerName, String position, int jerseyNumber, Team team) {
        this.playerName = playerName;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.team = team;
    }

    public void playGame(){
        System.out.println("player playing Game...");
    }
    public void train(){
        System.out.println("Player Training....");
    }
}
