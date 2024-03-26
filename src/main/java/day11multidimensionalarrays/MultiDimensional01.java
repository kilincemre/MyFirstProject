package day11multidimensionalarrays;

import java.util.Arrays;

public class MultiDimensional01 {
    public static void main(String[] args) {

        //Multi-dimensional array nasıl olusturulur?

        int a [][]=new int[3][2]; //[[0,0],[0,0],[0,0]] outer array-->3, inner array-->2

        //Multidimensional array'e eleman nasıl eklenir?
        a[0][0]= 5;
        a[0][1]=12;
        a[1][0]=8;
        a[1][1]=45;
        a[2][0]=123;
        a[2][1]=0;

        //Array'ler nasıl çıktı alınır
        System.out.println(Arrays.toString(a)); //ilk outer kısmı açabildi :) Arrays.toString
        System.out.println(Arrays.deepToString(a)); //dibine kadar :) Arrays.deepToString

        System.out.println(a[1][1]);
        System.out.println(a[1]);

        System.out.println(Arrays.toString(a[1])); //Multidimensional array icindeki bir array nasil yazdirilir?

        //Kısa yoldan nasıl multi-dimensional array nasıl oluşturulur?
        String students [][] = {{"Ali" ,"Ahmet"},{"Emre" , "Enes"}, {"Osman"}, {"Adnan", "Ayhan","Metin"}};

        //Toplam kac isim oldugunu bulalim???
        int sum=0;

        for (String[]w : students) {
            sum =w.length+sum;
        }
        System.out.println(sum);
        System.out.println((students[3]).length);   //iç arraylerin sayısını buluyoruz :)



        //Example 2: Yukarıdaki students array'inde icinde "m" bulunduran isimleri console'a yazdiralim...
        for (String[] w : students){

            for (String k : w){
                if (k.contains("m")){
                    System.out.println(k);
                }
            }
        }
    }
}
