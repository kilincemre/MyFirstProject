package practice03;

import java.util.Scanner;

public class C02ForLoopREPEAT {
    public static void main(String[] args) {
        //kullanici 5 sayi girecek, birler basamagi 7 veya 9 olanlar haric digerlerinin toplamini bulalım.
        Scanner input = new Scanner(System.in);
        int toplam=0;

        for (int i = 0; i < 5; i++) { //loop 5 kez donecek...

            System.out.println("please enter an integer");      // 5 kere girmek yerine input'u loop icine koyduk...
            int num1=input.nextInt();
            if (num1%10==7 || num1%10==9) {

                continue;
            }                   //continue cok onemli... if calisirsa basa doner. kendisinden sonrakileri okumaz...
                toplam = toplam + num1;   //    toplam+=num1 de olabilirdi...
        }
        System.out.println(toplam);
    }
}
