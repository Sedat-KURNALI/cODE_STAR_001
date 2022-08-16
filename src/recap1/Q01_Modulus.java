package recap1;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki
         * rakamlari toplamini bulunuz

         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen 5 basamaklı sayı giriniz : ");
        int sayi = scan.nextInt();
        int ilkIkiSayi = sayi / 1000;
        int sonIkiSayi = sayi % 100;
        int toplam = ilkIkiSayi / 10 + ilkIkiSayi % 10 + sonIkiSayi / 10 + sonIkiSayi % 10;
        System.out.println("toplam = " + toplam);

    }
}
