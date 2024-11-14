package Proxy;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Proxy {

    public interface SongService{
        Song searchById(int songID);
        ArrayList<Song> searchByTitle(String title);
        ArrayList<Song> searchByAlbum(String album);
    }

    public static class Song implements SongService{
        public int songID;
        public String title;
        public String artist;
        public String album;
        public int duration;

        Song(int songID){
            this.songID = songID;
            this.title = "";
            this.artist = "";
            this.album = "";
            this.duration = 0;
        }

        Song(int songID, String title, String artist, String album, int duration){
            this.songID = songID;
            this.title = title;
            this.artist = artist;
            this.album = album;
            this.duration = duration;
        }

        public void setSongID(int songID){
            this.songID = songID;
        }

        public void setTitle(String title){
            this.title = title;
        }

        public void setArtist(String artist){
            this.artist = artist;
        }

        public void setAlbum(String album){
            this.album = album;
        }

        public void setDuration(int duration){
            this.duration = duration;
        }

        public int getSongID(){
            return songID;
        }

        public String getTitle(){
            return title;
        }

        public String getArtist(){
            return artist;
        }

        public String getAlbum(){
            return album;
        }

        public int getDuration(){
            return duration;
        }

        public void printSong(){
            System.out.println("Song ID : " + songID);
            System.out.println("Title : " + title);
            System.out.println("Artist : " + artist);
            System.out.println("Album : " + album);
            System.out.println("Duration : " + duration + "\n");
        }

        @Override
        public Song searchById(int songID) {
            if(this.songID == songID){
                return this;
            }
            return null;
        }

        @Override
        public ArrayList<Song> searchByTitle(String title) {
            ArrayList<Song> result = new ArrayList<Song>();
            if (this.title.equals(title)){
                result.add(this);
            }
            return result;
        }

        @Override
        public ArrayList<Song> searchByAlbum(String album) {
            ArrayList<Song> result = new ArrayList<Song>();
            if (this.album.equals(album)) {
                result.add(this);
            }
            return result;
        }
    }

    public static class SongCache implements SongService{
        public ArrayList<Song> songs;

        public SongCache(){
            this.songs = new ArrayList<Song>();
        }

        public void addSong(Song song){
            this.songs.add(song);
        }

        // Implies songs don't get removed
        public void createSong(String title, String artist, String album, int duration){
            this.songs.add(new Song(songs.size() + 1, title, artist, album, duration));
        }

        public void printAllSongs(){
            for(Song song : this.songs){
                song.printSong();
            }
        }

        @Override
        public Song searchById(int songID) {
            return this.songs.get(songID);
        }

        @Override
        public ArrayList<Song> searchByTitle(String title) {
            ArrayList<Song> results = new ArrayList<Song>();

            for (Song song : songs) {
                if (song.title.equals(title)) {
                    results.add(song);
                }
            }

            return results;
        }

        @Override
        public ArrayList<Song> searchByAlbum(String album) {
            ArrayList<Song> results = new ArrayList<Song>();

            for (Song song : songs) {
                if (song.album.equals(album)) {
                    results.add(song);
                }
            }
            return results;
        }

    }
}
