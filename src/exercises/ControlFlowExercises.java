package exercises;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by canidmars on 5/9/17.
 */
public class ControlFlowExercises {
    public static void main(String[] args) {

//        Part One:

//        Integer i = 5;

//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }



//        Integer i = 0;
//
//        do{
//            System.out.println(i += 2);
//        }while (i < 100);



//        Integer i = 100;
//
//        do {
//            System.out.println(i -= 5);
//        }while (i > -10);



//        long i = 2;
//
//        do {
//            i = i*i;
//            System.out.println(i);
//        }while (i < 1000000);


//        for(int i = 5; i <= 15; i++){
//            System.out.println(i);
//        }


//        for(int i = 0; i <= 100; i+=2){
//            System.out.println(i);
//        }


//        for(int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }


//        for(long i = 2; i < 1000000; i = i*i){
//            System.out.println(i);
//        }



//        Part Two:

//        for(int i=0; i<100; i++){
//            if (i % 3 == 0 & i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 5 == 0){
//                System.out.println("Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(i);
//            }
//        }


//        Part Three:

        Scanner input = new Scanner(System.in);
        String yesNo = "Y";
        int i = 1;

        System.out.println("Please enter an integer");
        int enteredNumber = input.nextInt();

        input.nextLine(); //removes previous entry to make room for next input
        System.out.println("Do you want to continue?");
        yesNo = input.nextLine();

        if (yesNo.equalsIgnoreCase("Y")) {
            System.out.println("Here is your table: ");
            System.out.println(" number | squared | cube ");
            System.out.println(" ------ | ------- | ---- ");
            do {
                String a = String.valueOf(i++);
                String b = String.valueOf(i*i);
                String c = String.valueOf(i*i*i);
                System.out.println(String.format(c.length() - a.length()));
            } while (i < enteredNumber);
        }

//        Part Four:

//        Scanner input = new Scanner(System.in);
//        String yesNo = "Y";
//        int i = 0;
//
//        System.out.println("Please enter your grade");
//        int gradePoint = input.nextInt();
//        input.nextLine();
//
//        System.out.println("Do you wish to continue?");
//        yesNo = input.nextLine();
//
//        if (yesNo.equalsIgnoreCase("Y")){
//            if(gradePoint>=88 & gradePoint<=100){
//                if(gradePoint>=88 & gradePoint<=95){
//                    System.out.println("You made an A-");
//                }else{
//                    System.out.println("You made an A+");
//                }
//            } else if (gradePoint>=80 & gradePoint<=87){
//                if(gradePoint>=80 & gradePoint<=84){
//                    System.out.println("You made a B-");
//                }else {
//                    System.out.println("You made a B+");
//                }
//            } else if (gradePoint>=67 & gradePoint<=79) {
//                if(gradePoint>=67 & gradePoint<=74){
//                    System.out.println("You made a C-");
//                }else {
//                    System.out.println("You made a C+");
//                }
//            } else if (gradePoint>=60 & gradePoint<=66) {
//                if(gradePoint>=60 & gradePoint<=63){
//                    System.out.println("You made a D-");
//                }else {
//                    System.out.println("You made a D+");
//                }
//            } else {
//                System.out.println("You made an F");
//            }
//
//        }

    }

}
