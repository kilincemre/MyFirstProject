package day02variables;

import java.util.Scanner;

public class C02_ScannerClass {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name... ");
        String name=scan.nextLine(); //It gets all words in the given line
        String name2=scan.next(); //It only gets the first word as String

        System.out.println(name);
        System.out.println(name2);


    }
}
