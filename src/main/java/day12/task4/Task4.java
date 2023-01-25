package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band = new MusicBand("Queen", 1987, new ArrayList<>(Arrays.asList("Freddie Mercury",
                "Brian May", "Roger Taylor", "John Deacon")));

        MusicBand band1 = new MusicBand("Beatles", 1987, new ArrayList<>(Arrays.asList("John Lennon",
                "Paul McCartney", "George Harrison", "Ringo Starr")));

        band.printMembers();
        band1.printMembers();

        MusicBand.transferMembers(band, band1);

        band.printMembers();
        band1.printMembers();

    }
}
