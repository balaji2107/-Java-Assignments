package classandobject;

import java.util.ArrayList;
import java.util.List;

public class Team {
    public String name;
    public String city;
    public String division;
    List<Player> players=new ArrayList<>();
    public Team(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
    }

    public void playGame(){
        System.out.println("Team playing Game...");
    }
    public void hireCoach(){
        System.out.println("Coach Training....");
    }
}
