package day11multidimensionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1: [0, 2, 3, 0, 12, 0] sifirlarini en sona koyalim... >>> [2, 3, 12, 0, 0, 0]

        int a [] = {0,2,3,12,0,0};
        int b [] = new int[a.length]; // [0,0,0,0,0,0]       // a bir array olduğu için length çalışır...
        int idx = 0;
        for (int w : a){
            if (w!=0){
                b[idx]=w;

                idx++;
            }
        }

        System.out.println(Arrays.toString(b));

        //Arraylerin esit olup olmadığı nsaıl anlaşılır?
        int arr[]=new int[3];
        arr[0]=2;
        arr[1]=1;
        arr[2]=3;

        int brr[]=new int[3];
        brr[0]=1;
        brr[1]=3;
        brr[2]=2;

        boolean result = Arrays.equals(arr,brr);
        System.out.println("result = " + result);


    }
}
