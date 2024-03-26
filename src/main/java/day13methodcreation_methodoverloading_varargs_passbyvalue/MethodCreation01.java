package day13methodcreation_methodoverloading_varargs_passbyvalue;

public class MethodCreation01 {
    public static void main(String[] args) {
        multiply(3,5);
        int resultOfMultiply = multiply(3,5);

        System.out.println(multiplicationOfFirstTwoAndThird(2, 3, 5));
        System.out.println(resultOfMultiply);
        print("Fenerbahce is the Champion...");

    }
        //main method kapanis parantezi
        //Ornek-1 : 2 sayiyi carpma islemi yapan method olusturalim...
        protected static int multiply(int a, int b) {           //int a, int b parametreler...
            return a * b;           //main methodda calistirinca oraya dondurdugum deger buradaki return
        }    // return type olarak void dışında herhangi bir data type koydugumuz zaman return yapmak zorundayiz...

        //Ornek-2 : verilen ilk 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan meyhod'u olusturalim...
        private static int multiplicationOfFirstTwoAndThird (int a, int b, int c){
        return a*b+c;
    }
        //Ornek 3: Girilen bir kelimeyi ekrana yazdiran method olusturup kullanalim...
        public static void print(String str){       //Eger bir method yeni bir data uretmiyorsa return type'ı void olur.
                                                    //method'un return type'ı void ise return body'de(iki süslü parantez arasi) return yer almaz...
                                                    //method olusturmada kullanilan variable'lar, parameters olarak adlandirilir...
                                                    //method call'da kullanilan gercek degerlere argumanlar(Arguements) denir...
            System.out.println(str);

        }
}
