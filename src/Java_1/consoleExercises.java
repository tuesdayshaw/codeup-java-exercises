package Java_1;

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

//        System.out.println("What is the width of the classroom?");
//
//        String values1 = sc.nextLine();
//        System.out.println(values1);
//
//        int width = Integer.parseInt(values1);
//        System.out.println(width);
//
//        System.out.println("What is the length of the classroom?");
//
//        String values2 = sc.nextLine();
//        System.out.println(values2);
//
//        int length = Integer.parseInt(values2);
//        System.out.println(length);
//
//        System.out.println("What is the height of the classroom?");
//
//        String values3 = sc.nextLine();
//        System.out.println(values3);
//
//        int height = Integer.parseInt(values3);
//        System.out.println(height);

//        Float length;
//        Float width;
//        Float height;
//
//        System.out.println("What is the width of the classroom?");
//        width = sc.nextFloat();
//
//        System.out.println("What is the length of the classroom?");
//        length = sc.nextFloat();
//
//        System.out.println("What is the height of the classroom?");
//        height = sc.nextFloat();
//
//
//        System.out.println("Area = " + (length * width));
//        System.out.println("Perimeter = " + ((2 * length) + (2 * width)));
//        System.out.println("Volume = " + (length * width * height));


        //Bonus: create a Pizza Order CLI app:

        Double total = 0.00;
        Double i = 0.00;
        String size = "";

        System.out.println("Hello, what size pizza would you like to order today? Enter small, medium or large?");
        switch (sc.nextLine()){
            case "small":
                total += 10.00;
                size += "Small";
                break;
            case "medium":
                total += 12.00;
                size += "Medium";
                break;
            case "large":
                total += 14.00;
                size += "Large";
                break;
        }

        System.out.println("We have cheese, pepperoni, sausage, margarita, and hawaiian. Please enter one.");
        String type = sc.nextLine();


        System.out.println("You can add extras for $1.50. They are: cheese, onion, jalapeno, spinach, pepperoni, sausage, marinara, peppers, garlic, and tomato. Please enter any extras.");
        String extras = sc.nextLine();
        i++;
        Double extraCost = (i * 1.50);
        total += (extraCost);


        System.out.println("Please enter your name:");
        String name = sc.nextLine();

        System.out.println("Please enter your address:");
        String address = sc.nextLine();

        System.out.println("Please enter your phone:");
        String phone = sc.nextLine();

        System.out.println("Order for: " + name);
        System.out.println("Deliver to: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Your Order: " + size + " " + type + " with extra: " + extras);
        System.out.println("Your total is: " + total);

    }

}
