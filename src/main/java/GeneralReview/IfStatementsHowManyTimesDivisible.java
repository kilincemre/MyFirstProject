package GeneralReview;

import java.util.Scanner;

public class IfStatementsHowManyTimesDivisible {
    public static void main(String[] args) {
        /*girilen sayinin 2,3,5,7,11 ve 13'ten kaç tanesine tam bolundugunu yazdiralim... */

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a positive integer");
        int num1 = scan.nextInt();

        int counter = 0;
        if (num1 % 2 == 0)
            counter++;
        if (num1 % 3 == 0)
            counter++;

        if (num1 % 5 == 0)
            counter++;

        if (num1 % 7 == 0)
            counter++;

        if (num1 % 11 == 0)
            counter++;

        if (num1 % 13 == 0)
            counter++;
        System.out.println(counter + " of the entered numbers is divisible by the above mentioned integers...");

    }

}
