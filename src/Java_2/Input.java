package Java_2;

import java.util.Scanner;

/**
 * Created by canidmars on 5/17/17.
 */


public class Input {
    private Scanner input;

    public Input(Scanner userInput){
        this.input = new Scanner(System.in);
    }

    public String getString(){
        return input.nextLine();
    }

    public boolean yesNo(){
        String answer = this.getString();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")){
            return true;
        }
        return false;
    }

    public int getInt(int min, int max) {
        int userInput = input.nextInt();
        if (userInput < min || userInput > max){
            System.out.println("Try again");
            getInt(min, max);
            input.nextInt();
            return userInput;
        }
        System.out.println("Correct");
        return userInput;
    }

    public int getInt(){
        return input.nextInt();
    }

    public double getDouble(double min, double max){
        double userInput = input.nextDouble();
        if (userInput < min || userInput > max){
            System.out.println("Try again");
            getDouble(min, max);
            input.nextDouble();
            return userInput;
        }
        System.out.println("Correct");
        return userInput;
    }

    public double getDouble(){
        return input.nextDouble();
    }
}
