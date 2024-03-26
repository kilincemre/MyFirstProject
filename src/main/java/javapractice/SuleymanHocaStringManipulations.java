package javapractice;

public class SuleymanHocaStringManipulations {
    public static void main(String[] args) {
        String s1 = "Study Hard, Stay Humble, Help Others.";
        //first character ?
        System.out.println(s1.charAt(0));

        //7th character from left to right ?
        System.out.println(s1.charAt(6));

        //Last character ?
        System.out.println(s1.charAt(s1.length() - 1));

        //median character ?
        if (s1.length() % 2 == 0) {
            System.out.println(s1.charAt(s1.length() - 1 / 2));

        }
        String s2 = "If you learn fast, you forget it fast";
        System.out.println(s2.indexOf('a', 23));

        String s3 = "cabuk ogrenilen cabuk unutulur";
        System.out.println(s3.indexOf('r',8));
        System.out.println(s2.indexOf("buk", 5));

        String s4 = "Revise more, forget less";
        System.out.println(s4.isEmpty());           //Given String is empty or not?
        System.out.println("abc123".isEmpty());


    }
}
