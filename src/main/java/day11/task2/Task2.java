package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior = new Warrior(80, 0, 0, 30);
        Paladin paladin = new Paladin(50, 20, 0, 15);
        Magician magician = new Magician(0, 80, 20, 5);
        Shaman shaman = new Shaman(20, 20, 15, 10);
        System.out.println(warrior);
        paladin.physicalAttack(warrior);
        System.out.println(warrior);
    }
}
