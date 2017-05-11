package exercises;

import java.util.Scanner;

/**
 * Created by canidmars on 5/11/17.
 */
public class stringExercise {
    public static void main(String[] args) {

//        String message = "We don't need no education";
//
//        System.out.println(message + "\nWe don't need no thought control");

//        String message = "Check \"this\" out!, \"s inside of \"s!";
//
//        System.out.println(message);

//        String message = "In windows, the main drive is usually C:\\";
//
//        System.out.println(message);

//        String message = "I can do backslashes \\, double backslashes \\\\,\n" +
//                "and the amazing triple backslash \\\\\\!";
//
//        System.out.println(message);


//        Additional Exercise:
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//
//        Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//        He answers 'Whatever.' to anything else.


        String message1 = "Do you like pizza?";
        String message2 = "GO CLEAN YOUR ROOM!";
        String message3 = "     ";

        if (message1.endsWith("?")){
            System.out.println("Sure.");
        }

        if (message2.toUpperCase().equals(message2)){
            System.out.println("Whoa, chill out!");
        }

        if (message3.trim().equals("")){
            System.out.println("Fine, be that way!");
        }



    }
}
