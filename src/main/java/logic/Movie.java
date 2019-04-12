package logic;

import java.util.List;

public class Movie {
    
    String id;
    String name;
    List<Language> languages;
    AgeRating ageRating;
    String movieLength;
    String movieDescription;
    String movieReview;
    Genre genre;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    public AgeRating getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(AgeRating ageRating) {
        this.ageRating = ageRating;
    }

    public String getMovieLength() {
        return movieLength;
    }

    public void setMovieLength(String movieLength) {
        this.movieLength = movieLength;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public String getMovieReview() {
        return movieReview;
    }

    public void setMovieReview(String movieReview) {
        this.movieReview = movieReview;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    
    
    
}
