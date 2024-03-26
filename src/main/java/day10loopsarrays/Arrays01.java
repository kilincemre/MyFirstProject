package day10loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a=23;
        a=7;
        a=15;

        //Array nasıl oluşturulur?
        String stdNames [] = new String[5];

        //Arrayler nasıl yazdırılır...
        System.out.println(Arrays.toString(stdNames));

        //toString() metodunu kullanmadan sadece array ismi ile yazdırırsak java o Array'in adresini yazdırır.

        //Array'a eleman eklemek ???
        stdNames[2] = "Alperen";
        System.out.println(Arrays.toString(stdNames));

        stdNames[4] = "ahmet enes";
        System.out.println(Arrays.toString(stdNames));

        stdNames[0] ="emre";
        System.out.println(Arrays.toString(stdNames));

        System.out.println(stdNames[2]);
        System.out.println(stdNames[4]);
        //String bir array oluşturup içine 5 tane eleman ekleyip, tüm elemalnların içerdiği karakter sayılar toplamını yazdıralım...

        String cities []=new String[5];
        cities [0]="Sivas";
        cities [1]="Miami"; //Array'ler tek tip data ile çalışır.
        cities [2]="Ankara";
        cities[3]="Mersin";
        cities[4]="Yozgat";

        // int totalChar= cities[0].length() + cities[1].length() +cities[2].length() +cities[3].length() +cities[4].length();
        //System.out.println(totalChar);                          //dynamic olmadı bu...

         //Note:
        int totalChar2=0;
        for (int i = 0; i <cities.length ; i++) {

            totalChar2 = totalChar2+ cities[i].length();
        }
        System.out.println(totalChar2); //bunu yukarıdaki scope içine yazınca tek tek ekleyerek her toplamı veriyor...

        // 2. yol for each loop (enhanced loop)
        int sum =  0;

        for ( String w : cities ){
            sum = sum+w.length();

        }
        System.out.println(sum);

    }

}
