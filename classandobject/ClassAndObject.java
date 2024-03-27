package classandobject;

public class ClassAndObject {
    public static void main(String[] args) {
        Team team=new Team("MI","mumbai","hello");
        Player player=new Player("Rohit","onedown",45,team);
        System.out.println(player.playerName);
        System.out.println(player.team.name);
        player.playGame();
    }
}
