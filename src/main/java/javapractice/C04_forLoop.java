package javapractice;

import java.util.Scanner;

public class C04_forLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter en integer");
        int num1 = scan.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + "X" + i + " = " +num1*i );

            
        }

    }
    // soru 3: belirlenen sayının 1'den 10'a kadar çarpım sonuçlarını yapan Java prt-gramini yazdiralim...



}
