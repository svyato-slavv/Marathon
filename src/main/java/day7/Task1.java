package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane air1=new Airplane("sss",1999,380,2000);
        Airplane air2=new Airplane("sss",1988,338,1000);
        Airplane.compareAirplanes(air1,air2);
    }
}