package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> list=new ArrayList<>(Arrays.asList(new MusicArtist("Ivanov Svyatoslav",22),new MusicArtist("Ivanova Masha",25)));
        List<MusicArtist> list1=new ArrayList<>(Arrays.asList(new MusicArtist("Kurt Roma",66),new MusicArtist("Sidorov Kobein",87)));
        MusicBand musicBand1=new MusicBand("Nirvana",1976,list);
        MusicBand musicBand2=new MusicBand("Nechto strannoe",2022,list1);
        System.out.println(musicBand1);
        System.out.println(musicBand2);
        MusicBand.transferMembers(musicBand1,musicBand2);
        System.out.println();
        System.out.println();
        MusicBand.printMembers(musicBand2);
        MusicBand.printMembers(musicBand1);

    }
}
