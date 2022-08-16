package recap2;

import java.util.Scanner;

public class Q03_SwitchCase {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının okunusunu yazı ile yazdırınız.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Uc basamakli bir sayi giriniz :");
        int sayi = scanner.nextInt();

        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = sayi / 100;


        System.out.println(yuzler + " " + onlar + " " + birler);
        switch (yuzler) {
            case 1:
                System.out.print("Yuz ");
                break;
            case 2:
                System.out.print("Iki Yuz ");
                break;
            case 3:
                System.out.print("Uc Yuz ");
                break;
            case 4:
                System.out.print("Dort Yuz ");
                break;
            case 5:
                System.out.print("Bes Yuz ");
                break;
            case 6:
                System.out.print("Alti Yuz ");
                break;
            case 7:
                System.out.print("Yedi Yuz ");
                break;
            case 8:
                System.out.print("Sekiz Yuz ");
                break;
            case 9:
                System.out.print("Dokuz Yuz ");
                break;
        }
        switch (onlar) {
            case 1:
                System.out.print("On ");
                break;
            case 2:
                System.out.print("Yirmi ");
                break;
            case 3:
                System.out.print("Otuz ");
                break;
            case 4:
                System.out.print("Kirk ");
                break;
            case 5:
                System.out.print("Elli ");
                break;
            case 6:
                System.out.print("Altmis ");
                break;
            case 7:
                System.out.print("Yetmis ");
                break;
            case 8:
                System.out.print("Seksen ");
                break;
            case 9:
                System.out.print("Doksan ");
                break;
        }
        switch (birler) {
            case 1:
                System.out.print("Bir ");
                break;
            case 2:
                System.out.print("Iki ");
                break;
            case 3:
                System.out.print("Uc ");
                break;
            case 4:
                System.out.print("Dort ");
                break;
            case 5:
                System.out.print("Bes ");
                break;
            case 6:
                System.out.print("Alti ");
                break;
            case 7:
                System.out.print("Yedi ");
                break;
            case 8:
                System.out.print("Sekiz ");
                break;
            case 9:
                System.out.print("Dokuz ");
                break;
        }
    }

}
