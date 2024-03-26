package GeneralReview;

import java.util.Scanner;

public class IfElseStatementsToUpperCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a character");

        //ask user to enter a character. If it's lower-case, make it upper case. Otherwise, print it out.

        char letter =  scan.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            System.out.println("new form of your letter is " + Character.toUpperCase(letter));
        }else{
            System.out.println("the letter you entered is " + letter);
        }
    }
}
