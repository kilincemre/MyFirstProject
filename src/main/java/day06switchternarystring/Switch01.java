package day06switchternarystring;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //ay numarasi verilince, numarasi verilen ay'dan basalyip 12. aya kadar tum aylarin isimlerini yazdiran kodu yaziniz.
        //8==>August - September - October - November - December
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the number of beginning month");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){
            case 1:
                System.out.println("January");

            case 2:
                System.out.println("January");

            case 3:
                System.out.println("January");

            case 4:
                System.out.println("January");

            case 5:
                System.out.println("January");

            case 6:
                System.out.println("January");

            case 7:
                System.out.println("January");
                //sonuna break; koyacağız. Çünkü yazdığımız aydan sonrasını listele denmiş.
        }

    }
}
