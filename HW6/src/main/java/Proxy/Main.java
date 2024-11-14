package Proxy;

import Proxy.Proxy.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SongCache spotify = new SongCache();

        spotify.createSong("Song1","Artist1","Album1",100);
        spotify.createSong("Song2","Artist1","Album2",100);
        spotify.createSong("Song3","Artist2","Album2",100);
        spotify.createSong("Song4","Artist2","Album1",100);
        spotify.createSong("Song5","Artist3","Album1",100);

        spotify.printAllSongs();

        ArrayList<Song> results;

        System.out.println(" ======== Search by SongID ======== ");
        spotify.searchById(2).printSong();

        System.out.println(" ======== Search by Title ======== ");
        results = spotify.searchByTitle("Song5");
        for (Song s : results) {
            s.printSong();
        }

        System.out.println(" ======== Search by Album ======== ");
        results = spotify.searchByAlbum("Album1");
        for (Song s : results) {
            s.printSong();
        }

    }
}
