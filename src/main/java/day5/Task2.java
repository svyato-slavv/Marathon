package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike("Yamaha", "White", 1999);
        System.out.println(motorbike.getModel() + "\n"
                + motorbike.getColor() + "\n"
                + motorbike.getYear());
    }
}
