package practice02;

import java.util.Scanner;

public class C01IfStatements {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first integer");
        int num1= scan.nextInt();

        System.out.println("Please enter second number");
        int num2=scan.nextInt();

        if (num1>0 && num2>0) {
            System.out.println(num1 + num2);
        }else if(num1<0 && num2<0) {
            System.out.println(num1*num2);
        } else if (num1*num2<0) {
            System.out.println("we can not do any operation");
        }else {             //baska bir durum kalmadi, else ile bitirebiliriz...
            System.out.println("zero is swallower");
        }


    }
}
