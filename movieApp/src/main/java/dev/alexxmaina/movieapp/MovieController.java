// getting a request from the user and returning a response 
// calls allMovies method inside the service, gets the list of movies and returns them with a http status of 200

package dev.alexxmaina.movieapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // annotate class as a REST controller
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "http://localhost:3000") // to allow requests from "http://localhost:3000"

public class MovieController {
    @Autowired
    private MovieService movieService;
    // Get All Movies
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){ 
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK); // fetch all movies from db and gives it back to API layer
    }

    // Get Movie by ID
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }


}
