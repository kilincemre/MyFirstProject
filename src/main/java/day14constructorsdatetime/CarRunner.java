package day14constructorsdatetime;

public class CarRunner {
    public static void main(String[] args) {

        Car c1=new Car("bmw", "m4", 2023, false);
        System.out.println(c1.make);
        System.out.println(c1.model);
        System.out.println(c1.hybrid);
        System.out.println(c1.year);
        Car c2 = new   Car("bmw","r8",2022, true);          //constructor bu
        Car c3 = new Car("honda", "civic", 2015, false);


        c1.movement();      //void ile çıktı alamıyoruz. return yok çünkü
        c1.stop();

        System.out.println(c1);
        System.out.println(c2);

    }
}
