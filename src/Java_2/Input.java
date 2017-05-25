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

    public Input(){
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
        int answer = 0;
        try {
            answer = Integer.valueOf(this.getString());
        }catch (NumberFormatException e) {
            System.out.println("Number out of range, try again");
            return getInt(min, max);
        }

//        if (answer < min || answer > max){
//            System.out.println("Number out of range, try again");
//            getInt(min, max);
//            input.nextInt();
//            return answer;
//        }
        System.out.println("Correct");
        return answer;
    }

    public int getInt(){
        try {
            return Integer.valueOf(this.getString());
        }catch (NumberFormatException e){
            System.out.println("Please enter an integer");
            return getInt();
        }
    }

    public double getDouble(double min, double max){
        double answer = 0;
        try {
            answer = Double.valueOf(this.getString());
        }catch (NumberFormatException e) {
            System.out.println("Number out of range, try again");
            return getDouble(min, max);
        }


//        double answer = this.getDouble();
//        if (answer < min || answer > max){
//            System.out.println("Number out of range, try again");
//            getDouble(min, max);
//            input.nextDouble();
//            return answer;
//        }
//        System.out.println("Correct");
        return answer;
    }

    public double getDouble(){
        try {
            return Double.valueOf(this.getString());
        }catch (NumberFormatException e){
            System.out.println("Please enter a double");
            return getInt();
        }
    }

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Enter an integer");
        int userInput = input.getInt();



    }
}


