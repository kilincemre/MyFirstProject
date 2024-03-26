package javapractice;

public class SubstringCompanyName21August {
    public static void main(String[] args) {
        String a =  "emrekilinc@matematikrontgeni.com";

        //we want to separate gmail from the given address...
        System.out.println(a.substring(15,20));  //first index is included, last index is not included...But this is not dynamic.

        int startingIndex = a.indexOf("@")+1;
        int endingIndex = a.indexOf(".");
        String companyName = a.substring(startingIndex,endingIndex);
        System.out.println("companyName = " + companyName);




    }
}
