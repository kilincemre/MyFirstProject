package practice03;

import java.util.Scanner;

public class C01Forloop {
    public static void main(String[] args) {
        //for loop
        //while
        //do-while
        //for each loop
        //kullanicidan bir kelime sisteme girin...
        //kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdıralım...

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz...");
        String s1 = scan.next();
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'c') {     //s1.contains hatali olur...
                break;
            } else if (s1.charAt(i) == 'a') {         //a'lari saymak icin counter lazim...
                counter++;          //her a gordugunde sayaci bir artitir...

            }

        }
        System.out.println("number of a's until c appears for the first time = "  + counter);

    }
}
