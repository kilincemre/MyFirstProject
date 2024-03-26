package day12arraylists;

public class PracticeMethodCreation1 {
    public static void main(String[] args) {
        int resultOfMultiply = multiply(7,5);
        System.out.println(resultOfMultiply);

        double result = multiplyFirstTwoAndAddThird (5,7,4);
        System.out.println(result);

        System.out.println(multiplyFirstTwoAndAddThird(5, 7, 4 ) );  //we can print it out without assigning to any data type.

        printOut("Ali Baba");

        sumOf(5,7.2);


    }
    protected static int multiply(int x, int y) {
        return x * y;
    }
        private static double multiplyFirstTwoAndAddThird ( int a, double b, double c){
        return a*b+c;
        }
        public static void printOut(String str1){
            System.out.println(str1);
        }

        public static void sumOf(double a, double b){
            System.out.println(a+b);
        }
        public static void sumOf(int a, double b) {
            System.out.println(a + b);
        }
        public static void sumOf(double a, int b) {
            System.out.println(a + b);
        }
        public static void sumOf(int a, int b) {
        System.out.println(a + b);
        }
        public static void sumOf(int a, int b, int c) {
        System.out.println(a + b);
        }
    }

