package Java_2;


import java.util.Scanner;

/**
 * Created by canidmars on 5/17/17.
 */
public class InputTest {


    public static void main(String[] args) {

        Input input = new Input(new Scanner(System.in));
        System.out.println("Enter your name.");
        System.out.println(input.getString());

        System.out.println("Is today Wednesday?");
        System.out.println(input.yesNo());

        System.out.println("Enter a number");
        System.out.println(input.getInt());

        int min = 1;
        int max = 50;

        System.out.println("Enter a number between "+ min + " and " + max);
        System.out.println("The number in the range was: " + input.getInt(min, max));

        System.out.println("Enter a number with decimal places");
        System.out.println(input.getDouble());

        double minDbl = 1.50;
        double maxDbl = 7.50;

        System.out.println("Enter a number between " + minDbl + " and " + max);
        System.out.println(input.getDouble(minDbl, max));

    }


}

