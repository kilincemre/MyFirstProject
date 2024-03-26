package practice02;

import java.util.Scanner;

public class C05Switch {
    public static void main(String[] args) {
        //switch içerisinde float, long, double ve en önemlisi boolean alamaz...

        /*
         Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score from 0 to 4");
        double score = input.nextDouble();
        String grade = ""; //if else disinda da kullanabilmek icin seviye if else olusturmadan once olusturulur...
        if (score >=0 && score<1){
            grade="FAILED";
        } else if (score>=1 && score<2) {
            grade="PASSED";
        } else if (score>=2 && score<2.5) {
            grade="GOOD";
        } else if (score>=2.5 && score<3.5) {
            grade="VERY GOOD";
        } else if (score>=3.5 && score<=4) {
            grade = "EXCELLENT";
        }else{
            grade = "INVALID";
        }
        System.out.println("your grade is "+ grade);

        switch (grade){
            case "FAILED" :
            System.out.println("F"); break;
            case "PASSED" :
            System.out.println("D"); break;
            case "GOOD" :
            System.out.println("C"); break;
            case "VERY GOOD" :
                System.out.println("B"); break;
            case "EXCELLENT" :
                System.out.println("A"); break;
            default:
                System.out.println("please enter your score properly...");
        }
    }
}
