/**
 * Created by kdrudy on 11/21/16.
 */
public class FizzBuzz {

    public static void main(String args[]) {
        //Iterate from 0 to 100
        int i = 0;
        while(i <= 0) {
            //if the number can be divided by 3 and 5 evenly print out "FizzBuzz"
            if(i%3 == 0 && i%5 == 0) {
                System.out.println(i + ":FizzBuzz");
            }
            //else if the number can be divided by 3 evenly print out "Fizz"
            else if(i%3 == 0) {
                System.out.println(i + ":Fizz");
            }
            //else if the number can be divided by 5 evenly print out "Buzz"
            else if(i%5 == 0) {
                System.out.println(i + ":Buzz");
            }
            i++;
        }
    }
}
