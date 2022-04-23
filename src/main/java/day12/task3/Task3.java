package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("Nirvana", 1987));
        bands.add(new MusicBand("Metallica", 1968));
        bands.add(new MusicBand("Guns n Roses", 1984));
        bands.add(new MusicBand("Nervi", 2007));
        bands.add(new MusicBand("Depeche mode", 1980));
        bands.add(new MusicBand("Aerosmith", 1972));
        bands.add(new MusicBand("LSP", 2007));
        bands.add(new MusicBand("Ruki Vverh", 1980));
        bands.add(new MusicBand("Boys Band", 2010));
        bands.add(new MusicBand("Leningrad", 1997));

        Collections.shuffle(bands);
        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> band = new ArrayList<>();
        for (MusicBand b : bands) {
            if (b.getAge() > 2000) {
                band.add(b);
            }
        }
        return band;
    }
}
