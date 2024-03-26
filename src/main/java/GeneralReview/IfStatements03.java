package GeneralReview;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        /* Ask from user to enter a character.
        If the character is upper-case, print out "Upper-Case letter"
        If the character is lower-case, print out "Lower-Case letter"
        If it is not a letter, print out "It's not a letter"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a character");
        char ch = scan.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("it is an upper-case letter");
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("it is a lower-case letter");
        }
        if (!(ch >= 'A' && ch <= 'Z') && !(ch > 'a' && ch <= 'z')) {
            System.out.println("You didn't enter a letter");
        }

    }
}
