package javapractice;

import java.util.Scanner;

public class StringPracticesTwentyAugust {
    public static void main(String[] args) {
        System.out.println("Ali".equalsIgnoreCase("ALI"));  //s1.equals(s2) s1 ve s2 String denerken aklıma geldi. :)
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a word");
        String s1=input.next();

        String s2="Alibaba";
        System.out.println(s2.equals(s1)); //equals metod ile true, "==" ile false geldi. Aynı string değeri için. Ama aslında ikisi farklı stringler

        System.out.println(s1==s2);

        String s3 = "Testing is enjoyable";    //"is" stringi 'i' ile başlar, onun indexini verir...
        System.out.println(s3.indexOf("is"));


    }
}
