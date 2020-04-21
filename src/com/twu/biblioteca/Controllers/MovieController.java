package com.twu.biblioteca.Controllers;

import com.twu.biblioteca.Models.Book;
import com.twu.biblioteca.Models.Movie;
import com.twu.biblioteca.Repositories.MoviesRepository;
import java.util.ArrayList;

public class MovieController {
    MoviesRepository moviesRepository = new MoviesRepository();
    ArrayList<Movie> movies = moviesRepository.getMovies();

    public MovieController() { }

    public void AvailableMoviesList() {
        try{
            System.out.println("List of available movies:");

            System.out.println("---------------------------------------");
            System.out.println("| ID | Movie name | Director | Year Published | Movie Rating |");
            movies.forEach(
                    movie -> {
                        if(movie.getAvailable())
                            System.out.println("- " + movie.getId() +" | " + movie.getName() + " | " + movie.getDirector() + " | " + movie.getYearPublished() + " | " + movie.getMovieRating());
                    });
            System.out.println("---------------------------------------");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    public String CheckOutMovie(String stringMovieId) {
        try {
            int movieId = Integer.parseInt(stringMovieId);
            for (Movie movie: movies) {
                if (movie.getId() == movieId && movie.getAvailable() == true) {
                    movie.setAvailable(false);

                    return "--- Thank you! Enjoy the movie ---";
                }
            }

            return "--- Sorry, that movie is not available ---";
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return null;
    }

    public String ReturnMovie(String stringMovieId) {
        try {
            int bookId = Integer.parseInt(stringMovieId);
            for (Movie movie: movies) {
                if (movie.getId() == bookId && movie.getAvailable() == false) {
                    movie.setAvailable(true);

                    return "--- Thank you for returning the movie. ---";
                }
            }

            return "--- This is not a valid movie to return. ---";
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        return null;
    }
}
