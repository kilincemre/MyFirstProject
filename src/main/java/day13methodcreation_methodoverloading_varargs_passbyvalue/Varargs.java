package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class Varargs {
    public static void main(String[] args) {
        int result = addition(1,2,45,57,78,98,61,127);

        System.out.println(result);

    }
    //Java farkli sayidaki paramaterlerin hepsini kabul eden bir yapı olusturdu...
    //Buna varargs deniyor.
    public static int addition(int b, int... a){    //int... a     "to be continued" gibi oldu...
       int sum=0;
        for ( int w      :    a      ) {
            sum = sum + w;
        }
return sum;                 //varargs en sonda olmali, parantez icinde...
        }
    }
   /* public static int addition(int a, int b, int c){
        return a+b+c;
    }
    public static int addition(int a, int b, int c, int d){
        return a+b+c+d;
    }

    } */

