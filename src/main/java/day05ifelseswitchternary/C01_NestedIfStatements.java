package day05ifelseswitchternary;

import java.util.Scanner;

public class C01_NestedIfStatements {
    public static void main(String[] args) {
        /* Get an integer greater than 0 and less than 120
        If the person is a woman and if she is older than 60 years old, then make it print "You can be retired."
        else make it print "she has to work"

        If the person is a man and if he is older than 65 years old, then make it print "You can be retired."
        else make it print "he has to work"
        */
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your gender...");
        String gender = scan.next();

        System.out.println("Please enter your age...");
        byte age = scan.nextByte();

        if (age<0 || age>120){
            System.out.println("you have entered a wrong value");

            } else if (gender.equalsIgnoreCase("woman")) {
                 if (age > 60) {
                System.out.println("You can be retired");
            } else {
                System.out.println("you have to work...");
            }
        } else if (gender.equalsIgnoreCase("Man")) {
            if (age >65) {
                System.out.println("You can be retired");
            } else {
                System.out.println("you have to work more...");
            }
        } else {
            System.out.println("you have entered an invalid word");
        }
    }
}