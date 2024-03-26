package javapractice;

import java.util.Arrays;

public class Array01Tekrar {
    public static void main(String[] args) {
        int a [] = new int[5];
        a[0]=75;
        a[1]=15;
        a[2]=34;
        a[3]=25;
        a[4]=81;
        System.out.println(Arrays.toString(a));  //Arrays.toString yapılırken parantez içine sadece a yazılır...

        // a arrayindeki elemanları tersten yazdırarak önlerine * koyalim...
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(" *" + a[i]);
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (i%2==0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        //a arrayindeki elemanları küçükten büyüğe sıralayalım...
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));     //sort ile yaptık...
        System.out.println(Arrays.binarySearch(a, 44)); //-4 olmasının sebebi 44'ün 34 ve 75 arasında olması. 4. sırada olması...
        //negatif olması da listede olmaması...

        a[2]=11;                //2. indexte olan eleman yerine 11 yazdı.
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a,11));

        String s1[] = {"a","b","c","d"};
        String s2[] = {"a","d","b","c"};
        String s3[] = {"a","d","b","c"};
        System.out.println(Arrays.equals(s1,s2));
        System.out.println(Arrays.equals(s2,s3));
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(a).length());


    }
}
