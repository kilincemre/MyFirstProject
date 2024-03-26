package day06switchternarystring;

public class StringManipulations02 {
    public static void main(String[] args) {

        String s = "Learn Java feel 365 times better";
        int num = s.replaceAll("[^0-9]","" ).length();



        System.out.println(num);


    }

}
