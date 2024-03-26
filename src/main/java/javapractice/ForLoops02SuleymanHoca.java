package javapractice;

import java.util.Scanner;

public class ForLoops02SuleymanHoca {
    public static void main(String[] args) {
        /* Kullanicidan bir sayi alin, o sayidan kucuk olan tum pozitif tek sayilari buyukten kucuge dogru
        ayni satirda aralarinda bosluk birakarak yazdirin...
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int num1 = scan.nextInt();
        if (num1 < 0) {
            System.out.println("Please enter a positive integer");
        } else {

            for (int i = num1; i > 0; i--) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }

            }
        }
    }
}
