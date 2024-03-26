package day12arraylists;

public class MethodCreation01 {                     // access modifier + return type        + method name    +     method parenthesis + method body
    public static void main(String[] args) {        //        public         void, int, ...     sumOfIntegers...       ()                  { }
        int result = sumOfIntegers(27,65);
        System.out.println(result);

        multiply(3,8);              //void ile oluşturulan method'da return yok, onun yerine sout ile sonuç aldık...
        multiply(7.5,12.4);
        double result2 = division(144.8,6.5);
        System.out.println(result2);
    }
    public static int sumOfIntegers(int a, int b){
        return a+b;
    }
    public static void multiply(double c, double d){      //void ile return yapilmiyor...
        System.out.println(c*d);                            //burada kullanilan c ve d asagida da kullanilabiliyor. Cunku local variables oluyor...

        }
    public static double division(double c, double d){          //Burada ce- veya d değişince yukarida da degisti...
       return (c/d);                         // "Return" yerine "System.out.println((k / m));" yazdim olmadi...
    }
}
