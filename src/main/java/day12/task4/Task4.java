package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Kurt Kobein");
        list1.add("Krist Novoselich");
        MusicBand Nirvana = new MusicBand("Nirvana", 1977, list1);
        List<String> list2 = new ArrayList<>();
        list2.add("Milkovskiy Evgen");
        list2.add("Vlad Zaychenko");
        MusicBand Nervi = new MusicBand("Nervi", 2007, list2);
        System.out.println(Nervi);
        System.out.println(Nirvana);
        MusicBand.transferMembers(Nirvana, Nervi);
        System.out.println(Nervi);
        System.out.println(Nirvana);
        System.out.println();
        MusicBand.printMembers(Nervi);
    }
}
