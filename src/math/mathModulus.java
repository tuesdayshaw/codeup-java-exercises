package math;

/**
 * Created by canidmars on 5/13/17.
 */
    public class mathModulus {
        public static int modulus(int number1, int number2) {
            int modulusNumbers = number1 % number2;
            if (number1 == 0) {
                System.out.println("Modulus with 0 is not allowed");
            }
            return modulusNumbers;
        }
    }
