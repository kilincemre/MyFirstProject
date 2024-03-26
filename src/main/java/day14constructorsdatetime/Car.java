package day14constructorsdatetime;

public class Car {
    /*
    Constructor nedir?
    Class'tan obje olusturmaya yarayan code blocklaridir.
    Class olusturunca java bize otomatik olarak constructor olusturdu.
    Ama bu constructor gozle gorunmeyen, otomatik java tarafından
    üretilir. "Default constructor" deniyor...

     default constructor ===> Car(){}

     siz kendi constructorunuzu olururursaniz java
     default'u siler...
     Access modifier =
     */


    //Araba(car) objesi oluşturuyoruz...
    //Variable'lari olusturuyoruz, bunlar pasif özelliklerdir.
    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid =true;

    public Car(String make, String model, int year, boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;



    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }

//Method olusturalim...(aktif özelliklerdir)
public void movement(){
    System.out.println("honda moves fast");
}
public void stop(){
    System.out.println("honda stops anytime you want");
}
}