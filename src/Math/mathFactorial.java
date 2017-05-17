package Math;

/**
 * Created by canidmars on 5/13/17.
 */
public class mathFactorial {

   public static long factorial(long number){

        if (number == 0 || number == 1){
            return 1;
        } else return number * factorial(number - 1);

   }

}
