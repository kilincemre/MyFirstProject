package day08loops;

public class MyPractice2 {
    public static void main(String[] args) {
        String s3 = "Java is fun";
        for (int k = s3.length(); k > 0 ; k=k-1) {

            System.out.print(s3.charAt(k-1));
        }
    }
}
