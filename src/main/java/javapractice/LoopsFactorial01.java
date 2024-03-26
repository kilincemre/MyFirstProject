package javapractice;

import java.util.Scanner;

public class LoopsFactorial01 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a digit");
        int newDigit = scan.nextInt();
        System.out.print(newDigit + "!" + "=");
        for (int i = newDigit; i >0 ; i--) {

            System.out.print( i );
            System.out.print("*");
        }
    }
}
