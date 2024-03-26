package day10loopsarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array'leri kısa yoldan nasıl oluştururuz?
        int numbers[] = {12, 3, -3, 5, 23};
        for (int w : numbers) {
            if (w < 5) {
                System.out.println(w +"");

            }
            //Specific bir elemanın array'de olup olmadığını anlamak için gereken kodu yazınız...

            String names []={"k", "c" ,"r" , "a" ,"s"};
            //binarySearch() methodunu sort() kullanmadan kullanmayız.
            //binarySearch() methodu var olan elemanlar için size o elemanın indexini verir.


        }
    }
}