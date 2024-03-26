package javapractice;

public class ForLoops21August {
    public static void main(String[] args) {
        for (int i = 1; i <6 ; i++) {
            System.out.println("hello baba");

        }

        for (int i = 11; i < 15; i++) {
            System.out.println(i);

        }

        //sonsuz loop :) [infinite loop]
        //for (int i = 35; i >30 ; i++) {
          //  System.out.println("La ilahe illallah, Muhammedun Rasulullah");
        //}

        // "I love Java..." cümlesindeki ilk a'ya kadar olan kısmı yazdıralım...

        String s="I love Java";
        for (int i = 0; i < s.length() ; i++) {
            if (s.charAt(i)=='a'){
                break;
            }
            System.out.print(s.charAt(i));                  //to write the letters in the same row, we use "System.out.print"
        }

    }
}
