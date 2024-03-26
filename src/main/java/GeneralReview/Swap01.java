package GeneralReview;

import java.util.Scanner;

public class Swap01 {
    public static void main(String[] args) {

        /* a variable'nin değeri 12, b variable'nin degeri 25 olsun.
        Oyle bir kod yazalim ki a 25, b 12 olsun.
        Sayılari kullanıcıdan alalim.
         */

        //1. yol
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter an integer for variable a");
        int numa = scan.nextInt(); //num a = 25
        System.out.println("please enter an integer for variable b");
        int numb = scan.nextInt(); //num b = 12

       /* int numc = 0;    //Garbage collector is needed in this way...
        numc = numa;    //numc is 25
        numa = numb;    //numa is 12
        numb = numc;    //numb is 25

        System.out.println("value of b is " + numb + ", " + "value of a is " + numa);
*/
        System.out.println("================================");
        //2. yol Garbage collector'a ihtiyaç duymadan yaptığımız swap, (interview'da bu şekilde üçüncü variable kullanmadan da yapın denebilirmiş...)
        numb = numa + numb; //numb = 37
        numa = numb - numa; //numa = 12
        numb = numb - numa;

        System.out.println("numa is " + numa);
        System.out.println("numb is " + numb);


    }
}


