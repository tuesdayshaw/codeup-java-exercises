package Java_2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by canidmars on 5/18/17.
 */
public class MoviesApplication {

    public static void main(String[] args) {

        Input input = new Input(new Scanner(System.in));

        System.out.println("Would you like to see the movies?");
        String confirm = input.getString();

        while (confirm.equalsIgnoreCase("y")){

            System.out.println("What would you like to do?");
            System.out.println("        0 - exit\n" +
                    "        1 - view all movies\n" +
                    "        2 - view movies in the animated category\n" +
                    "        3 - view movies in the drama category\n" +
                    "        4 - view movies in the horror category\n" +
                    "        5 - view movies in the scifi category\n" +
                    "        6 - add a movie, provide name and category");
            System.out.println("Enter your choice: ");

            int selection = input.getInt();
            input.getInt();

            switch (selection) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for (Movie movieListAllTitles : ) {
                        System.out.println(movieListAllTitles.getName());
                    }
                    break;
                case 2:
                    printByCategory(MoviesArray.findAll(), "animated");
                    break;
                case 3:
                    printByCategory(MoviesArray.findAll(), "drama");
                    break;
                case 4:
                    printByCategory(MoviesArray.findAll(), "horror");
                    break;
                case 5:
                    printByCategory(MoviesArray.findAll(), "scifi");
                    break;
                case 6:
                    System.out.println("Enter the name of the movie:");
                    String name = input.getString();

                    System.out.println("Enter the name of the category:");
                    String category = input.getString();

                    Movie newMovie = new Movie(name, category);

                    MoviesArray = Arrays.copyOf(MoviesArray.findAll(), MoviesArray.findAll()+1);
                default:
                    System.out.println("Not a valid option");
                    break;
            }
        }
    }


    public static void printByCategory(Movie[] movies, String category){
        for (Movie m : MoviesArray.findAll()) {
            if (m.getCategory().equalsIgnoreCase(category)) {
                System.out.println(m.getName());
            }
        }
    }

    public static void addMovie(){

    }
}
