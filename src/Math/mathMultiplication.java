package Math;

/**
 * Created by canidmars on 5/13/17.
 */
public class mathMultiplication {

        public static int multiplication(int number1, int number2){
//       Basic:
//        int timesNumbers = number1 * number2;

//       Looping:
        int timesNumbers = 0;
        int i;
        for(i = 0; i < number2; i++){
            timesNumbers = timesNumbers + number1;

        }
        return timesNumbers;


    }
}
