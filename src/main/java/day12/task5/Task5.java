package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> musicArtistList = new ArrayList<>(Arrays.asList(new MusicArtist("Freddie Mercury", 34),
                new MusicArtist("Brian May", 29), new MusicArtist("Roger Taylor", 41),
                new MusicArtist("John Deacon", 27)));

        List<MusicArtist> musicArtistList1 = new ArrayList<>(Arrays.asList(new MusicArtist("John Lennon", 28),
                new MusicArtist("Paul McCartney", 37), new MusicArtist("George Harrison", 19),
                new MusicArtist("Ringo Starr", 25)));

        MusicBand band = new MusicBand("Queen", 1987, musicArtistList);

        MusicBand band1 = new MusicBand("Beatles", 1987, musicArtistList1);

        band.printMembers();
        band1.printMembers();

        MusicBand.transferMembers(band, band1);

        band.printMembers();
        band1.printMembers();

    }
}
