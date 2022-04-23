package day12.task5;

import java.util.List;

public class MusicBand {
    private String nameGroup;
    private int age;
    List<MusicArtist> members;


    public MusicBand(String name, int age, List<MusicArtist> members) {
        this.nameGroup = name;
        this.age = age;
        this.members = members;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand from, MusicBand to) {

        for (int i = 0; i < from.getMembers().size(); i++) {
            to.getMembers().add(from.getMembers().get(i));
        }
        from.getMembers().clear();

    }

    public String getNameGroup() {
        return nameGroup;
    }

    public static void printMembers(MusicBand band) {
        System.out.println("Участники группы " + band.getNameGroup() + ":");
        if (band.getMembers().size() == 0) {
            System.out.println("Все свалили из группы(((");
        } else
            System.out.println(band.getMembers());
    }

    @Override
    public String toString() {
        return "Группа: " +
                "Название='" + nameGroup + '\'' +
                ", Год основания=" + age + "\n" +
                "Участники: " + members;
    }
}
