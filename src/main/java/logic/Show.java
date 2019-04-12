package logic;

import java.util.Calendar;

public class Show {

    String id;
    Hall hall;
    Calendar showDate;

    Movie movie;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall hall) {
        this.hall = hall;
    }

    public Calendar getShowDate() {
        return showDate;
    }

    public void setShowDate(Calendar showDate) {
        this.showDate = showDate;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

}
