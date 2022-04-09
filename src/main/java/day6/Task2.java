package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1999, 240, 2050);
        airplane.setYear(2000);
        airplane.setLength(270);
        airplane.fillUp(2000);
        airplane.fillUp(3000);
        airplane.info();
    }
}
