package practice02;

import java.util.Scanner;

public class C03Ternary {
    public static void main(String[] args) {
        //condition ? durum1 : durum2
        /*
            Kullanıcıdan bir sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        Scanner input = new Scanner(System.in);
        System.out.println("please enter an integer");
        int num1 = input.nextInt();
        Object result = num1%2==0 ? "it is an even integer" : num1+3;
        System.out.println(result);

        System.out.println(num1 % 2 == 0 ? "it is an even integer" : num1 + 3); //it can be printed out directly using sout...


    }
}
