package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int age;

    public MusicBand(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
