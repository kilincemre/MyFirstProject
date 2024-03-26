package day07stringmanipulations01;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {
        //Example  Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht

        String s = "mehmet";
        if (s.lastIndexOf("m") == s.indexOf("m")) {    //index of("m") m'nin soldan sağa ilk göründüğü indeksi verir.
            System.out.print("m");                       //lastIndexOf("m") ise sondan(sağdan sola ilk göründüğü yerin indeksini verir.
        }

        if (s.lastIndexOf("e") == s.indexOf("e")) {
            System.out.print("e");
        }
        if (s.lastIndexOf("h") == s.indexOf("h")) {
            System.out.print("h");
        }
        if (s.lastIndexOf("t") == s.indexOf("t")) {
            System.out.print("t");
        }
        System.out.println("");


        //Example  Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String cardNum = "1234 6789 1234 6789";
        String first = cardNum.substring(0, 15).replaceAll("[0-9]", "*");
        String last = cardNum.substring(15);

        String result1 = first + last;
        System.out.println("result1 = " + result1);

        String result2 = first.concat(last);
        System.out.println("result2 = " + result2);


    }
}

