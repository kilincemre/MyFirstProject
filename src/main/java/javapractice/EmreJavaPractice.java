package javapractice;

import java.util.Scanner;

public class EmreJavaPractice {
    public static void main(String[] args) {

//Turkish recitement of entered data as 3-digit positve integers
    Scanner input= new Scanner(System.in);
    System.out.println("please enter a 3-digit positive number");
    String numberEntered = input.next();
        if (numberEntered.replaceAll("[^0-9]" , "").length()<3 || numberEntered.length()!=3 || numberEntered.startsWith("0")) {              // Niye olmuyor?
            System.out.println("please enter a 3-digit positive integer"); // Finally... :)
        }else{
        char hundreds = numberEntered.charAt(0);
        char tens = numberEntered.charAt(1);
        char units = numberEntered.charAt(2);



        switch (hundreds) {
            case '1':
                System.out.println("yüz");
                break;
            case '2':
                System.out.println("ikiyüz");
                break;
            case '3':
                System.out.println("ucyuz");
                break;
            case '4':
                System.out.println("dörtyüz");
                break;
            case '5':
                System.out.println("besyüz");
                break;
            case '6':
                System.out.println("altiyüz");
                break;
            case '7':
                System.out.println("yediyuz");
                break;
            case '8':
                System.out.println("sekizyüz");
                break;
            case '9':
                System.out.println("dokuzyüz");
                break;
            case '0':
                System.out.println(" ");
                break;
            default:
                System.out.println("please enter 3-digit number");
        }
        switch (tens){
        case '1':
            System.out.println("on");
            break;
        case '2':
            System.out.println("yirmi");
            break;
        case '3':
            System.out.println("otuz");
            break;
        case '4':
            System.out.println("kırk");
            break;
        case '5':
            System.out.println("elli");
            break;
        case '6':
            System.out.println("altmis");
            break;
        case '7':
            System.out.println("yetmis");
            break;
        case '8':
            System.out.println("seksen");
            break;
        case '9':
            System.out.println("doksan");
            break;
        case '0':
            System.out.println(" ");
            break;
            default:
                System.out.println("please enter 3-digit number");

    }
        switch (units) {
            case '1':
                System.out.println("bir");
                break;
            case '2':
                System.out.println("iki");
                break;
            case '3':
                System.out.println("uc");
                break;
            case '4':
                System.out.println("dört");
                break;
            case '5':
                System.out.println("bes");
                break;
            case '6':
                System.out.println("alti");
                break;
            case '7':
                System.out.println("yedi");
                break;
            case '8':
                System.out.println("sekiz");
                break;
            case '9':
                System.out.println("dokuz");
                break;
            case '0':
                System.out.println(" ");
                break;
            default:
                System.out.println("please enter 3-digit number");
                }
            }
        }
    }


