package dev.alexxmaina.movieapp;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// let framework know this class rep each document in movie collection
@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id

    private ObjectId id;
    private String imdbId; 
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference // manual reference relationship -? reviews will be in a sepatrate collection
    private List<Review> reviewIds; // embedded relationship -> all reviews related to the movie will be added to reviews
}
