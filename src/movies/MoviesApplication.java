package movies;


import util.Input;


public class MoviesApplication {
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
            userInput = input.getInt("Enter your choice: ", 0, 5);

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
            }
        } while (userInput != 0);
    }

    public static void showFilteredMovies(String category) {

        Movie[] movies = MoviesArray.findAll();

        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category) || category.equalsIgnoreCase("all"))
                System.out.println(movie.getName() + " -- " + movie.getCategory());
        }
    }

}