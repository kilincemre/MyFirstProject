package javapractice;

public class TrimToUpperCaseSplit21August {
    public static void main(String[] args) {
        String name =   "mEhMeT bOzOK";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);

        System.out.print(""+first+last);
    }
}