package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random r = new Random();
        Player player1 = new Player((r.nextInt(11)) + 90);
        Player player2 = new Player((r.nextInt(11)) + 90);
        Player player3 = new Player((r.nextInt(11)) + 90);
        Player player4 = new Player((r.nextInt(11)) + 90);
        Player player5 = new Player((r.nextInt(11)) + 90);
        Player player6 = new Player((r.nextInt(11)) + 90);
        Player.info();
        while (player1.getStamina()>0){
            player1.run();
        }
        Player.info();
    }
}
