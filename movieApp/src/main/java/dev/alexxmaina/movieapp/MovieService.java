// file uses the repository class, talks to the database,
// gets the list of the movies, and returns to the API layer
package dev.alexxmaina.movieapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class MovieService {
    @Autowired // annotation to instantiate the  class MovieRepository
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
    
}
