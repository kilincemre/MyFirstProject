package practice03;

import java.util.Scanner;

public class C05DoWhileLoopNoContinue {
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
                System.out.println("you can not enter negative integer");
            } else {
                sum += num1;
                counter++;
                    }

        }   while (true);           // while(true) olunca dongu devam eder... while basina comment dash yazmak önemli...
            System.out.println("number of positive integers you entered is " + counter + " and the sum of them is " + sum);
        }
    }





