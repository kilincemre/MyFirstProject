package practice03;

import java.util.Scanner;

public class C03ForLoop {
    public static void main(String[] args) {
        /*Kullanici satır sayısı girecek ve ardından yıldız isareti ile dik ucgen cizelim...

        Satır sayısı = 4 ==>    *
                                **
                                ***
                                ****

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number of rows");
        int numRow = scan.nextInt();

        for (int i = 0; i < numRow; i++) {  //satir dongusu ici yazdik

            for (int j = 0; j <=i ; j++) {    //yildiz yazdirma islemi (sutun icin) i=0 icin j=0 icin yıldız basabiliriz.
                System.out.print("* ");
                
            }

            System.out.println(); //Disarida basarsak imleci her deferinde alt satira gecirir...
        }
    }
}
