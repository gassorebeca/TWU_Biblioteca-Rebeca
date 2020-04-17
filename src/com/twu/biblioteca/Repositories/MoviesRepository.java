package com.twu.biblioteca.Repositories;

import java.util.ArrayList;
import com.twu.biblioteca.Models.Movie;

public class MoviesRepository {
    ArrayList<Movie> movies = new ArrayList<>();

    public ArrayList<Movie> getMovies() { return movies; }
    public void setMovies(ArrayList<Movie> movies) { movies = movies; }


    public MoviesRepository() {
        Movie spiritedAway = new Movie();
        MovieCreator(spiritedAway,1,"Spirited Away", "Hayao Miyazaki",2003, "10", false);

        Movie myNeighborTotoro = new Movie();
        MovieCreator(myNeighborTotoro,2,"My Neighbor Totoro", "Hayao Miyazaki",1995, "9", true);

        Movie pridePrejudice = new Movie();
        MovieCreator(pridePrejudice,3,"Pride & Prejudice", "Joe Wright",2006, "Unrated", true);

        Movie iAmLegend = new Movie();
        MovieCreator(iAmLegend,4,"I Am Legend", "Francis Lawrence",2008, "8", true);

        movies.add(spiritedAway); movies.add(myNeighborTotoro); movies.add(pridePrejudice); movies.add(iAmLegend);
    }

    private void MovieCreator(Movie name, int id, String title, String director, int yearPublished, String movieRating, boolean available) {
        name.setId(id);
        name.setName(title);
        name.setYearPublished(yearPublished);
        name.setDirector(director);
        name.setMovieRating(movieRating);
        name.setAvailable(available);
    }
}
