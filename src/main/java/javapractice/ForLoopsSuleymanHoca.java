package javapractice;

import java.util.Scanner;

public class ForLoopsSuleymanHoca {
    public static void main(String[] args) {
        //baslangic ve bitis degerlerini kullanicidan alip baslangic ve bitis dahil tum sayilari yazdiralim...
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a starting integer");
        int start = input.nextInt();
        System.out.println("Please enter a finishing integer");
        int finish = input.nextInt();

        if (finish < start) {
            System.out.println("starting number must be less than finishing number");
        } else {
            for (int i = start; i <= finish; i++) {

                System.out.print(i + " ");
            }
        }
        System.out.println();
        //Ask user to enter two integers, print out all even integers within those two integers...
        if (start>finish) {
            System.out.println("start value must be less than finish value");
        }else{
            for (int i = start; i <=finish ; i++) {
                if (i%2==0){
                    System.out.print(i + " ");
                }

            }
        }
    }
}
