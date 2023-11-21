package Assignmanet_3;

import java.util.Objects;

public class Question3 {

    public static void main(String[] args) {

        //create instance of class movies
        Movie movie = new Movie("Casino Royale" , "Eon Productions" , "PG13");

    }

}


class Movie {

    // define the variables
    private final String title;
    private final String studio;
    private final String rating;

    // the default constructor of the class to define the default value
    Movie(){
        title = "No Name" ;
        studio = "UnKnown" ;
        rating = "UnKnown" ;
    }

    // the second constructor that take arguments and assign the values to class variables
    Movie(String title , String studio , String rating){
        this.title = !title.isEmpty() ? title : "No Name";
        this.studio = !studio.isEmpty() ? studio : "UnKnown";
        this.rating = !rating.isEmpty() ? rating : "UnKnown";
    }

    // Constructor with title and studio arguments; default rating is "PG"
    public Movie(String title, String studio) {
        this.title = !title.isEmpty() ? title : "No Name";
        this.studio = !studio.isEmpty() ? studio : "UnKnown";
        this.rating = "PG";
    }

    // function getPg to return the list of movies that have rating pg
    // this function loop to count the movies with rating PG then make array length of this count
    public static Movie[] getPG(Movie[] movies){

        // define the counter
        int count = 0 ;
        // loop on movies list to
        for (Movie movie : movies) {
            if (Objects.equals(movie.rating, "PG"))
                count++;
        }

        // define the array with length of the Rating : "PG" movies and add movies to it
        Movie[] pgMoviesList = new Movie[count];

        for (int  i =0 ; i<movies.length ; i++){
            if (Objects.equals(movies[i].rating, "PG"))
                pgMoviesList[i] = movies[i];
        }

        // return the list of movies with rating pg
        return pgMoviesList;

    }


}
