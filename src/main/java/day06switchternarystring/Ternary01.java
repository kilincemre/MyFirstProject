package day06switchternarystring;

public class Ternary01 {
    public static void main(String[] args) {
        //Example 1: Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //        //           -4 ==> -1*-4        4 ==> 4        0 ==> 0
        //int a=-4;
        //System.out.println(a>0 ? a : -a); That is my work

        //int c=-17;
        //int result= c<0  ?  -c : c;
        //System.out.println(result);

        // iki sayının işareti aynı ise çarpalım, değilse çarpmayalım
        int a=13;
        int b=-4;

        Object result2 = (a>0 && b>0) || (a<0 && b<0) ? a*b : "we can't multiply numbers with different signs"; /*When there is a conflict, we tell them
        "you are all object, you are coming from same object(it is the root of class hierarchy"*/
        System.out.println(result2);
        //Ternary ile daha az kod yazdığımız için ternary tercih edilir.


    }
}
