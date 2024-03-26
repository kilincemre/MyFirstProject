package day15stringbuilderaccessmodifier;

public class Student {
    /*
    public > protected > default > private
    public ===> her class'a açık
    protected ===> baska package'larda degil ama baska package'larda child class icinden kullanilabilir...
    default ===> baska package'larda kullanılamaz
    private ===> sadece olusturlduklari class icinden kullanilabilir.

    //public her class'tan kullanilabilir...
     */
    public String stdname = "Ali Can";

    protected String address = "İstanbul";

    String email = "alican@gmail.com";

    private String Id = "1425784";

}
