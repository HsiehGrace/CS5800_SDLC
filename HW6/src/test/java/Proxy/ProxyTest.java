package Proxy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProxyTest extends Proxy {

    SongCache spotify;

    @BeforeAll
    static void setup()
    {
        SongCache spotify = new SongCache();
        spotify.createSong("Song1","Artist1","Album1",100);
        spotify.createSong("Song2","Artist1","Album2",100);
        spotify.createSong("Song3","Artist2","Album2",100);
        spotify.createSong("Song4","Artist2","Album1",100);
        spotify.createSong("Song5","Artist3","Album1",100);
    }


    @Test
    void testSearchSongID(){
        Song result = spotify.searchById(2);
        assertEquals(result.getSongID(), 2);
    }

    @Test
    void testSearchSongTitle(){
        ArrayList<Song> results = spotify.searchByTitle("Song5");
        assertEquals(results.size(), 1);
    }

    @Test
    void testSearchSongAlbum(){
        ArrayList<Song> results = spotify.searchByAlbum("Album2");
        assertEquals(results.size(), 2);
    }

}