package exercises;

import java.util.Scanner;

/**
 * Created by canidmars on 5/11/17.
 */
public class methodsExercises {

//Basic Arithmetic:

//    public static int addition(int number1, int number2){
//        int addNumbers = number1 + number2;
//        return addNumbers;
//    }
//
//    public static int subtraction(int number1, int number2){
//        int minusNumbers = number1 - number2;
//        return minusNumbers;
//    }
//
//    public static int multiplication(int number1, int number2){
////       Basic:
////        int timesNumbers = number1 * number2;
//
////       Looping:
//        int timesNumbers = 0;
//        int i;
//        for(i = 0; i < number2; i++){
//            timesNumbers = timesNumbers + number1;
//
//        }
//        return timesNumbers;
////
////
//    }
//
//    public static int division(int number1, int number2){
//        int divideNumbers = number1 / number2;
//        return divideNumbers;
//    }
//
//    public static int modulus(int number1, int number2) {
//        int modulusNumbers = number1 % number2;
//        if (number1 == 0) {
//            System.out.println("Modulus with 0 is not allowed");
//        }
//            return modulusNumbers;
//    }

//    Recursion:
//    public static int multiply(Integer number1, Integer number2) {
//        if (number1 == 0 || number2 == 0) {
//            return 0;
//        } else if (number1 == 1) {
//            return number2;
//        } else {
//            return number1 + (multiply(number1, number2 - 1));
//        }
//    }

//Number Verification:

//    public static int getInteger(int min, int max){
//
//        System.out.print("Enter a number between 1 and 10: ");
//        Scanner input = new Scanner(System.in);
//        int UI = input.nextInt();
//
//        if (UI < min || UI > max){
//            return getInteger(1, 10);
//        } else {
//            return UI;
//        }
//    }

//Factorial:
//   public static int factorial(int number){
//
//        if (number == 0 || number == 1){
//            return 1;
//        } else return number * factorial(number - 1);
//
//   }

//Rolling Dice:
    public static int dice(int number){
        return (int) Math.floor(Math.random() * number) + 1;
    }


    public static void main(String[] args) {
//        System.out.println(addition(10,30));
//        System.out.println(subtraction(44, 67));
//        System.out.println(multiplication(4, 5));
//        System.out.println(division(20,5));
//        System.out.println(modulus(10,9));
//        System.out.println(multiply(4,5));
//        getInteger(1, 10);


//        Factorial:
//        System.out.print("Enter a number between 1 and 10: ");
//        Scanner input = new Scanner(System.in);
//        int UI = input.nextInt();
//        int min = 0;
//        int max = 10;
//
//        String yesNo = "Y";
//        System.out.println("Do you want to continue?");
//        yesNo = input.nextLine();
//        input.nextLine();
//
//        do {
//            if (UI > min && UI < max) {
//                System.out.println(factorial(UI));
//            }
//        } while (yesNo.equalsIgnoreCase("Y"));


//        Dice:
        Scanner input = new Scanner(System.in);

        String yesNo = "Y";
        System.out.println("Do you want to roll the dice?");
        yesNo = input.nextLine();
        int i = 1;

        if (yesNo.equalsIgnoreCase("Y")) {
            System.out.print("Enter a number between 1 and 12: ");
            int UI = input.nextInt();

            do{
                System.out.println(dice(UI));
                i++;
            } while (i <= 2);
        }
    }
}
