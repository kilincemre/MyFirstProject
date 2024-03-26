package javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01SuloHoca {
    public static void main(String[] args) {
        int x = 12;
        x = 14;
        //Array oluşturduk...
        int a [] = new int[5];
        //Array'i console yazdirdik...
        System.out.println(Arrays.toString(a)); // default değerler

        a[1] = 5;
        a[2] = 7;
        System.out.println(a[1] + " " + a[2]);
        System.out.println(Arrays.toString(a));   //array formunda yazdırıyor...

        System.out.println(a.length);   //Array'lerdeki length parantezsiz. Stringlerde kullandıgımız ise length().

        String s [] = new String[3];
        s[0]="ali";
        s[1]="veli";
        s[2]="hakan";
        System.out.println(Arrays.toString(s));
        System.out.println(s.length);
        System.out.println(s[2]);
        System.out.println("==========================");

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);               //array elemanlarını yazdırıyor...


        }
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter en integer");

        String g = scan.next();
        String h = "abc";
        boolean t = (g==h);
        System.out.println(t);
        */



    }

}
