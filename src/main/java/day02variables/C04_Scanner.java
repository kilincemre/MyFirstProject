package day02variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*Ask from user to enter two integers as length and width of a rectangle, then write a code
        to calculate the area and the perimeter of the rectangle.
         */
        System.out.println("Please enter a value as width of a rectangle... ");
        double length = scan.nextDouble();

        System.out.println("Please enter a value as length of a rectangle... ");
        double width = scan.nextDouble();

        System.out.println("The area is " + (length*width) + " and " + "the perimeter is " + 2*((length)+(width)) );

    }
}
