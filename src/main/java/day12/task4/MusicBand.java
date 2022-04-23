package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private int age;
    private List<String> members ;

    public MusicBand(String name, int age, List<String> members) {
        this.name = name;
        this.age = age;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public String getName() {
        return name;
    }

    public static void transferMembers(MusicBand from, MusicBand to) {

        for (int i = 0; i < from.getMembers().size(); i++) {
            to.getMembers().add(from.getMembers().get(i));
        }
        from.getMembers().clear();

    }

    public static void printMembers(MusicBand band) {
        System.out.println("Участники группы "+band.getName()+":");
        System.out.println(band.getMembers());
    }

    @Override
    public String toString() {
        return "Название группы='" + name + '\'' +
                ", Год основания=" + age +
                ", Участники=" + members ;
    }
}
