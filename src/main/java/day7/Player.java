package day7;

public class Player {

    private static int countPlayers;

    public static int getCountPlayers() {
        return countPlayers;
    }

    private int stamina;

    public int getStamina() {
        return stamina;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        if (Player.getCountPlayers() < 6) {
            countPlayers++;
        }
    }

    private static final int MAX_STAMINA = 100;

    private static final int MIN_STAMINA = 0;


    public void run() {
        if (stamina == MIN_STAMINA)
            return;

        stamina--;

        if (stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игрок устал");
            System.out.println("Количество игроков на поле " + countPlayers);
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            switch (countPlayers) {
                case 1:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
                case 2:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
                case 3:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
                case 4:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных места");
                case 5:
                    System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободное место");
            }    //  System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
