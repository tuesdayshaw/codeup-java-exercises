package Java_2;

import java.util.Scanner;

/**
 * Created by canidmars on 5/18/17.
 */
public class MoviesApplication {

    public static void main(String[] args) {


        Input input = new Input(new Scanner(System.in));
        int selection = 0;

        System.out.println("Would you like to see the movies?");
        String confirm = input.getString();

        while (confirm.equalsIgnoreCase("y")){
            System.out.println("What would you like to do?");
            System.out.println("        0 - exit\n" +
                    "        1 - view all movies\n" +
                    "        2 - view movies in the animated category\n" +
                    "        3 - view movies in the drama category\n" +
                    "        4 - view movies in the horror category\n" +
                    "        5 - view movies in the scifi category");
            System.out.println("Enter your choice: ");

            switch (input.getInt()) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    for (Movie movieListAllTitles : MoviesArray.findAll()) {
                        System.out.println(movieListAllTitles.getName());
                    }
                    break;
                case 2:
                    for (Movie movieCategoryAnimated : MoviesArray.findAll()) {
                        if (movieCategoryAnimated.getCategory().equalsIgnoreCase("animated")) {
                            System.out.println(movieCategoryAnimated.getName());
                        }
                    }
                    break;
                case 3:
                    for (Movie movieCategoryDrama : MoviesArray.findAll()) {
                        if (movieCategoryDrama.getCategory().equalsIgnoreCase("drama")) {
                            System.out.println(movieCategoryDrama.getName());
                        }
                    }
                    break;
                case 4:
                    for (Movie movieCategoryHorror : MoviesArray.findAll()) {
                        if (movieCategoryHorror.getCategory().equalsIgnoreCase("horror")) {
                            System.out.println(movieCategoryHorror.getName());
                        }
                    }
                    break;
                case 5:
                    for (Movie movieCategoryScifi : MoviesArray.findAll()) {
                        if (movieCategoryScifi.getCategory().equalsIgnoreCase("scifi")) {
                            System.out.println(movieCategoryScifi.getName());
                        }
                    }
                    break;
                default:
                    System.out.println("Not a valid option");
                    break;
            }
        }
    }
}
