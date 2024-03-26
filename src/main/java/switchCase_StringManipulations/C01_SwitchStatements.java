package switchCase_StringManipulations;

import java.util.Scanner;

public class C01_SwitchStatements {
    public static void main(String[] args) {
        /* Ask user to get a letter for a ISTQB annihilation and give the meaning for each letter
        I = International
        S = Software
        T = Testing
        Q = Qualifications
        B = Board
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter from ISTQB annihilation for its meaning as a word");
        char letter1 = scan.next().toUpperCase().charAt(0);

        switch(letter1){
            case 'I':
                System.out.println("International");
                break;
            case 'S':
                System.out.println("Software");
                break;
            case 'T':
                System.out.println("Testing");
                break;
            case 'Q':
                System.out.println("Qualifications");
                break;
            case 'B':
                System.out.println("Board");
                break;
            default:
                System.out.println("the letter you entered does not exist in ISTQB");
        }

    }
}
