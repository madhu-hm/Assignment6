package assignment6;

import java.util.ArrayList;
import java.util.List;

public class Movies {
    private String movieName;
    private String releasedYear;
    private String director;
    private String genre;
    private List<Songs> songs; 
   
    public Movies() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Songs song) {
        songs.add(song);
    }

    public void displayAllSongs() {
        System.out.println("Songs in the movie '" + movieName + "':");
        for (Songs song : songs) {
            song.displaySongDetails();
        }
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(String releasedYear) {
        this.releasedYear = releasedYear;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public List<Songs> getSongs() {
        return songs;
    }

    public void setSongs(List<Songs> songs) {
        this.songs = songs;
    }

    public static void main(String[] args) {
       
        Movies movie = new Movies();
        movie.setMovieName("OK Kanmani");
        movie.setDirector("Mani Ratnam");
        movie.setReleasedYear("2015");
        movie.setGenre("Romantic Drama");
        movie.addSong(new Songs("Ay Sinamika", "A.R.Rahman,Karthik", "6:31"));
        movie.addSong(new Songs("Mental Manadhil", "A.R.Rahman,Jonita", "3:26"));
        movie.addSong(new Songs("Theera Ulaa", "A.R. Rahman,Dharshana,Nikhita", "4:48"));

        System.out.println("Movie Name: " + movie.getMovieName());
        System.out.println("Directed By: " + movie.getDirector());
        System.out.println("Released in: " + movie.getReleasedYear());
        System.out.println("Movie Genre: " + movie.getGenre());
        System.out.println();

        movie.displayAllSongs();
    }
}