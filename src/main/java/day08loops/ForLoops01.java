package day08loops;

public class ForLoops01 {
    public static void main(String[] args) {

        /* 1. "ekrana 5 kere "hello" yazdırınız

        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        */

        /* 2.yol
        for ( start ; condition of loop to work ;  artırma/azaltma  ){
        calisacak, tekrar edilecek yazdirmak istedigimiz kodlar
    }
*/
        for (int i = 1; i < 6; i = 2 * i) {        // or it can be done by putting "i++" instead of "i=i+1"
            System.out.print("hello");                        //condition saglanmazsa bizi scoop disina atar.
            System.out.println("ooovvvv");
        }
        for (int a = 1; a < 6; a = a + 2) {
            System.out.println(a);
        }

        for (int i = 40; i > 22; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}