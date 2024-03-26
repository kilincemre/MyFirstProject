package day10loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz.

        int ages[] = new int[6];
        ages [0]=23;
        ages [1]=44;
        ages [2]=19;
        ages [3]=24;
        ages [4]=53;
        ages [5]=71;

        System.out.println(Arrays.toString(ages));
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));
        //sort() methodu sayısal data typel'larını küçükten büyüğe doğrı sıralar(ascending order)
        //sort() methodu String data'ları alfabetik olarak sıralar...(alfabetical oreder)
        //(ascending order) + (alfabetical order)
        System.out.println(ages[0] + ages[ages.length-1]);

        //2. way
        int minimum = ages [4];
        for ( int w: ages){
        minimum = Math.min(w,minimum);
        }
        System.out.println(minimum);

        int maximum = ages [3];
        for (int w:ages) {
            maximum=Math.max(w,maximum);

        }
        System.out.println(maximum);
        System.out.println(maximum + minimum);
    }

}
