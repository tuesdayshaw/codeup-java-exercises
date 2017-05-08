package exercises;

import java.util.Scanner;

/**
 * Created by canidmars on 5/8/17.
 */
public class consoleExercises {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

//        System.out.println("Please enter your age?");
//        Integer age = sc.nextInt();
//        System.out.println("Your age is: " + age);

//        System.out.println("Please enter 3 words:");
//        String wordOne = sc.next();
//        String wordTwo = sc.next();
//        String wordThree = sc.next();
//        System.out.println(wordOne);
//        System.out.println(wordTwo);
//        System.out.println(wordThree);

//        System.out.println("Please enter a sentence");
//        String sentence = sc.nextLine();
//        System.out.println(sentence);

        System.out.println("What is the width of the classroom?");

        String values1 = sc.nextLine();
        System.out.println(values1);

        int width = Integer.parseInt(values1);
        System.out.println(width);

        System.out.println("What is the length of the classroom?");

        String values2 = sc.nextLine();
        System.out.println(values2);

        int length = Integer.parseInt(values2);
        System.out.println(length);

        System.out.println("What is the height of the classroom?");

        String values3 = sc.nextLine();
        System.out.println(values3);

        int height = Integer.parseInt(values3);
        System.out.println(height);

        System.out.println("Area = " + (length * width));
        System.out.println("Perimeter = " + ((2 * length) + (2 * width)));
        System.out.println("Volume = " + (length * width * height));
    }

}
