package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("Audi Q8");
        car.setColor("Black");
        car.setYear(2020);
        System.out.println("Модель - " + car.getModel() + ", цвет - " + car.getColor() + ", год выпуска - " + car.getYear() + ".");

    }
}
