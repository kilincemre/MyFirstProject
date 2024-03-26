package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodCreationRepeat {
    public static void main(String[] args) {
        //Ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method'u olusturunuz ve kullaniniz.
        /*    multiplyAndAdd(3,4,5);
    }
    protected static void multiplyAndAdd(double a, double b, double c){
        System.out.println((a*b+c));   Bu sekilde void ile de olur...     */
        int result = multiplyAndAdd(3, 4, 5);
        System.out.println(result);
    }

    private static int multiplyAndAdd(int k, int m, int n) {
        return k * m + n;

    }
}
