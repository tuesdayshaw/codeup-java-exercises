package Java_2;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
import java.util.*;

/**
 * Created by canidmars on 5/22/17.
 */
public class GradesApplication {

    public static void main(String[] args) {

        Map<String, Student> students = new HashMap<>();
        Scanner input = new Scanner(System.in);

        Student student3 = new Student("Tuesday");
        student3.addGrade(91);
        student3.addGrade(87);
        student3.addGrade(95);
        students.put("tshaw", student3);

        Student student4 = new Student("Amberlee");
        student4.addGrade(80);
        student4.addGrade(93);
        student4.addGrade(95);
        students.put("achildress", student4);

        Student student5 = new Student("Roxana");
        student5.addGrade(95);
        student5.addGrade(84);
        student5.addGrade(93);
        students.put("rvelazquez", student5);

        Student student6 = new Student("Sarah");
        student6.addGrade(92);
        student6.addGrade(88);
        student6.addGrade(98);
        students.put("svillareal", student6);


        System.out.println("Welcome");
        System.out.println("Here are the github usernames of our students:");
        students.forEach((key, value) -> {
            System.out.print("|" + key + "| ");
        });


        System.out.println("\nWould you like to see the student's information? y/n");
        String confirm = input.nextLine();

        while (confirm.equalsIgnoreCase("y")) {
            System.out.println("What student would you like to see more information on?");
            String answer = input.nextLine();
            if (students.containsKey(answer)) {
                System.out.println("Name: " + students.get(answer).getName() + " - Github Username: " + answer +
                        "\nGrade Average: " + students.get(answer).getGradeAverage() +
                        "\nAll grades to date: " + students.get(answer).getGrade());
            } else {
                System.out.println("Sorry, no student found with the github username of " + answer);
            }
            System.out.println("\nWould you like to see the student's information? y/n");
            confirm = input.nextLine();

            }
            if (confirm.equalsIgnoreCase("n")) {
                System.out.println("Would you like to see all students grades? y/n");
                String response = input.nextLine();

                if (response.equalsIgnoreCase("y")) {
                    students.forEach((k, v) -> {
                        System.out.println(students.get(k).getName() + ":" + students.get(k).getGrade());
                    });
                    if (response.equalsIgnoreCase("n")) {
                        System.out.println("Goodbye!");
                        System.exit(0);
                    }
                }
        }


    }

}
