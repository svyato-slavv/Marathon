package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car=new Car();
        Motorbike moto=new Motorbike("Harli","Yellow",2020);
        car.setYear(2015);
        car.info();
        System.out.println(car.yearDifference(2018));
        moto.info();
        System.out.println(moto.yearDifference(2007));


    }
}
