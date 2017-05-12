package exercises;

import java.util.Scanner;

/**
 * Created by canidmars on 5/11/17.
 */
public class methodsExercises {



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



    public static int getInteger(int min, int max){

        System.out.print("Enter a number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int UI = input.nextInt();

        if (UI < min || UI > max){
            return getInteger(1, 10);
        } else {
            return UI;
        }

    }


    public static void main(String[] args) {
//        System.out.println(addition(10,30));
//        System.out.println(subtraction(44, 67));
//        System.out.println(multiplication(4, 5));
//        System.out.println(division(20,5));
//        System.out.println(modulus(10,9));
//        System.out.println(multiply(4,5));


        getInteger(1, 10);



    }

}
