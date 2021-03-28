/**
 * Name: Samuel Adams Adjin
 */

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){


        int i = 1;
        int result = 0;
        while (i < number) {

            if (number % i == 0) {
                result += i;
            }
            i++;
        }
        System.out.println(result);


        int num = result;
        if (number < 1){
            return false;
        }else if (num == number){
            return true;
        }else{
            return false;
        }

    }
}
