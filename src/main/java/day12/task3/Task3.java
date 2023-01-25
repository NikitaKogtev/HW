package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> listBand = Arrays.asList(new MusicBand("Queen", 1987),
                new MusicBand("Beatles", 1999), new MusicBand("AC/DC", 1991),
                new MusicBand("SOAD", 2003), new MusicBand("Sting", 2001),
                new MusicBand("GreenDay", 2005), new MusicBand("Mushroom", 2011),
                new MusicBand("Eminem", 1996), new MusicBand("Oxxxy", 2002),
                new MusicBand("Vagabung", 2000));

        List<MusicBand> newListBand = groupsAfter2000(listBand);

        System.out.println(listBand);
        System.out.println(newListBand);
        
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> newBands = new ArrayList<>();

        for (MusicBand b : bands) {
            if (b.getYear() > 2000) {
                newBands.add(b);
            }
        }
        return newBands;
    }

}
