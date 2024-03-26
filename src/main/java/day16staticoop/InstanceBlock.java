package day16staticoop;

public class InstanceBlock {
    //instance block tum constructor larda bir kod calistirmaniz gerektiginde kullanilir
    //instance block tekrari önler

    public int year; //Bu class'a bir vairable açtık.

    public InstanceBlock(int year) {
        // System.out.println("hi");
        this.year = year;
    }

    public InstanceBlock() {   //default constructor
        // System.out.println("hi");
    }
    {
        System.out.println("hi");  //burası instance block, buraya yazdığım için yukarıda ayrı ayrı yazmama gerek kalmadı.
        //her ikisi için sağda runner ile basacağım.
        //kod kalabalığından kurtulmak için oldu bu...
    }

}
