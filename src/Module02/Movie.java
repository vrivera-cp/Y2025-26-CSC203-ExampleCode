package Module02;

import java.util.List;

public class Movie {
    private String title;
    private List<String> actors;
    private int rating; // Out of 10
    private double duration; // In minutes

    public Movie(
            String title,
            List<String> actors,
            double duration,
            int rating
    ) {
        this.title = title;
        this.actors = actors;
        this.duration = duration;
        this.rating = rating;
    }

//    @Override
//    public __________ equals(____________) {
//
//
//
//
//
//    }
//
//    @Override
//    public ____________ hashCode(____________) {
//
//
//
//
//
//
//    }
}
