package day16staticoop;

public class StudentRunner {
    public static void main(String[] args) {

        System.out.println(Student.stdName);
         Student alpi = new Student ();
         Student memo = new Student();
         Student hedo = new Student();
         //Scanner scan=new Scanner() gibi aynı...
        System.out.println(alpi.age);
        System.out.println(memo.age);
        System.out.println(hedo.age);
        //soldaki class'ta kalıpta
        // non-static variable olarak age=21 olduğu için
        //her yeni objenin yaşı da 21 oluyor...

        Student.staticMethod();
        hedo.nonStaticMethod();


    }
}
