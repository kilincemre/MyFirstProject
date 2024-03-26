package practice03;

import java.util.Scanner;

public class C05DoWhileLoop {
    public static void main(String[] args) {
        //do-while en az bir kere yaptirir...

//kullanicidan toplanmak üzere poz. tamsayilar isteriz...
        // bitirmek isterse 0'a basmasini soyleyin...

        //kullanici bitirmek istediginde toplam kac sayi girdi ve bunlarin toplamini bulup yazdiralim...
        //negatif girerse "negatif giremezsiniz", negatif sayi toplama ve sayi adedine eklenmez...
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        do {
            System.out.println("please enter a positive integer and to finish it push 0");
            int num1 = scan.nextInt();
            if (num1 == 0) {
                break;
            } else if (num1 < 0) {
                System.out.println("you can not enter negative integer"); //continue keyword olmasa idi orada kalirdik... continue süreci devam ettirir.
                continue;
            }
                sum += num1;
                counter++;

        }while(true);
        System.out.println("number of integers you entered is " + counter + " and the sum of them is " + sum);
    }
}


