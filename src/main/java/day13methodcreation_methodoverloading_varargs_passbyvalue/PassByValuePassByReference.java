package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class PassByValuePassByReference {
    public static void main(String[] args) {

        int result = add(3,5);
        System.out.println(result);
    }

    public static int add(int a, int b){
        return a+b;
    }

}
