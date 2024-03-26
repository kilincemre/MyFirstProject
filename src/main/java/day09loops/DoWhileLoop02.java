package day09loops;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
         /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter an integer");
            int num1 = input.nextInt();
            if (num1 >= 100) {
                System.out.println("You win !!");
            } else {
                System.out.println("you lose !!");
                break;
            }
        } while (true);
    }
}
