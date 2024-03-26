package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class C06Arrays {
    public static void main(String[] args) {
        /*5 elemanli bir array olusturup,
        array elemanlari kullanicidan alip, ortalama bulup, ortalamadan buyuk array elemanini yazdiralim
        arraylerin isaretlerini degistiren kod yazalim...
         */

        int arr[] = new int[5];
        System.out.println(Arrays.toString(arr)); //Bu önemli !!!

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {     //index varsa fori kullanalım...  length() method degil, ona dikkat!!!
            System.out.println("please enter an integer");
            int num = scan.nextInt();
            arr[i] = num;   //unutmusum  :(
        }
        System.out.println(Arrays.toString(arr));
        //Buraya kadar array elemani girdik
        //Its time to find average
        double sum = 0;
        // for-each --->>>>      for ( ne gelecek  : nereden  ) {
        for (int w : arr) {
            sum += w;
        }
        System.out.println("sum is " + sum);            //bu uc satiri scope disina almazasak her durum icin alta sum ve average basiyordu...
        double average = sum / arr.length;
        System.out.println("average = " + average);

        for (int w : arr) {            //for-each'te { for satiri sonuna yazilir...
            if (w > average) {
                System.out.println("more than average is " + w);
            }
        }
        //array elemanlarini -1 ie carpariz (index onemli oldugu icin fori daha kolay)
        for (int i = 0; i <arr.length; i++) {
            arr[i]=arr[i]*(-1);     //array[i]*=-1


        }
        System.out.println(Arrays.toString(arr)); // bu arkadasi scope disina atmazsak alt alta 5 tane array atıyor en sonda
    }
}

