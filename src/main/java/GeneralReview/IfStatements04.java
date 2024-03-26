package GeneralReview;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        /*
        Ask from user to enter a positive integer,
        if the number is 2-digit, let it print "Your number is 2-digit"
        if the number is 3-digit, let it print "Your number is 3-digit"
        if the entered number is neither 2-digit nor 3-digit, let it print "your number is neither 2-digit nor 3-digit"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a positive integer");
        int num1 = input.nextInt();

        num1 = Math.abs(num1);      //ABSOLUTE VALUE FUNCTION
        if (num1 >= 10 && num1 < 100) {
            System.out.println("Your number is 2-digit");
        } else if (num1 >= 100 && num1 < 1000) {
            System.out.println("Your number is 3-digit");
        } else {
            System.out.println("your number is neither 2-digit nor 3-digit");
        }

    }
}
