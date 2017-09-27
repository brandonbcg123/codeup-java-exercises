package movies;


import util.Input;

import java.util.Arrays;


public class MoviesApplication {
    private static Movie[] movies = MoviesArray.findAll();

    public static void main(String[] args) {
        int userInput;

        do {
            Input input = new Input();

            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - add movie to the list");
            userInput = input.getInt("Enter your choice: ", 0, 6);

            if (userInput == 1) {
                showFilteredMovies("all");
            } else if (userInput == 2) {
                showFilteredMovies("animated");
            } else if (userInput == 3) {
                showFilteredMovies("drama");
            } else if (userInput == 4) {
                showFilteredMovies("horror");
            } else if (userInput == 5) {
                showFilteredMovies("scifi");
            } else if (userInput == 6) {
                userAdd(input);
            }
        } while (userInput != 0);
    }

    public static void showFilteredMovies(String category) {


        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category) || category.equalsIgnoreCase("all"))
                System.out.println(movie.getName() + " -- " + movie.getCategory());
        }

    }

    public static void userAdd(Input input) {
        String newMovieName = input.getString("Enter a name of a movie");

        String newMovieCategory = input.getString("Enter the category of the movie");

        Movie newMovie = new Movie(newMovieName, newMovieCategory);

        int size = movies.length;

        movies = Arrays.copyOf(movies, size + 1);
        movies[size] = newMovie;
    }
}