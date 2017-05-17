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

        System.out.println("Enter a number between 1 and 50");
        System.out.println(input.getInt(1, 50));

        System.out.println("Enter a number with decimal places");
        System.out.println(input.getDouble());

        System.out.println("Enter a number between 1.50 and 7.50");
        System.out.println(input.getDouble(1.50, 7.50));

    }


}
