package GeneralReview;

import java.util.Scanner;

public class IfStatementsLowerCaseUpperCase {
    public static void main(String[] args) {

        /*Ask user to enter a letter, print out the name of month if the name of month is starting with any of the entered letters.
        Case sensitive olmasın. O veya o yazilirsa Ocak yazilsin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter for the name of month you want to print out");
        char firstLetter = input.next().toLowerCase().charAt(0);      //böylece String yani kelime veya birden fazla character bile girilse ilkini alır.

        if (firstLetter == 'o') System.out.println("Ocak");
        if (firstLetter == 's') System.out.println("Subat");
        if (firstLetter == 'm') System.out.println("Mart veya Mayis");
        if (firstLetter == 'n') System.out.println("Nisan");
        if (firstLetter == 'a') System.out.println("Agustos veya Aralik");
        if (firstLetter == 'h') System.out.println("Haziran");
        if (firstLetter == 't') System.out.println("Temmuz");
        if (firstLetter == 'e') System.out.println("Eylul veya Ekim");
        if (firstLetter == 'k') System.out.println("Kasim");
        else System.out.println("please enter a valid letter");
    }
}
