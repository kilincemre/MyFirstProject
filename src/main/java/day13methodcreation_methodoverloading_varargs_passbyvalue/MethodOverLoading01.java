package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodOverLoading01 {

    public static void main(String[] args) {
        add(3 , 5);            //double ve add secince
    }

    /*
        String fb = "fenerbahce";       //Yukarida string olmadığı için bunlar hata verdi...
        String myTeam = fb.substring(5);
        System.out.println(myTeam);
        System.out.println(fb.indexOf("b"));
*/



    //overloading yapiyoruz...              isimlere (add) dokunmadik, parametrelere karistik...
    /*public static void add(int a, int b) {            //isim+paramatre(name + parameter) ==>>> method signature....
        System.out.println(a + b);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }*/

    public static void add(double a, int b) {
        System.out.println(a + b);
    }
    /*public static void add(int a, double b) {
        System.out.println(a + b);
    }*/

    public static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }           //method overloading sirasinda method ismi degismez...
                //
}