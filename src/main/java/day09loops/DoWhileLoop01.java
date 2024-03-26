package day09loops;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        // 1)   While loop
        int a=1;
        while (a<1){
            System.out.println("you are a while loop...");      //zero execution(hic calısmamak)
            a++;
        }

        // 2)   Do-While loop
        int b=1;
        do{
            System.out.println("you are a do-while loop...");   //do-wile loop en az bir kez calisir
        }while (b<1);

    }
}
