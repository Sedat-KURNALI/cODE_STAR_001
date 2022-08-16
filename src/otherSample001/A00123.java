package otherSample001;

import java.util.Scanner;

public class A00123 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sayi alin,bu sayinin tek mi cift mi oldugunu,
        sifirdan buyuk mu kucuk mu oldugunu,
        ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
        100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();

        tekMiCiftMi(sayi);
        int rakamlarToplami = 0;
        sifirdanBuyukMuKucukMu(sayi);
        yuzdenBuyukMuKucukMu(sayi);

    }


    public static void sifirdanBuyukMuKucukMu(int sayi) {
        if (sayi >= 0) {
            System.out.println("Girdiginiz " + sayi + " sayisi 0'dan buyuk.");
        } else {
            System.out.println("Girdiginiz " + sayi + " sayisi 0'dan kucuk.");
        }
    }

    public static void tekMiCiftMi(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("Girdiginiz " + sayi + " sayisi cifttir.");
        } else {
            System.out.println("Girdiginiz " + sayi + " sayisi tektir.");
        }
    }

    public static void yuzdenBuyukMuKucukMu(int sayi) {
        int birler = sayi % 10;
        int onlar = (sayi % 100) / 10;
        int yuzler = (sayi % 1000) / 100;
        System.out.println(yuzler + " " + onlar + " " + birler);
        int toplam = yuzler + onlar + birler;
        if (sayi >= 100) {
            System.out.println("Sayi 100 veya 100 den buyuk. Yuzler, onlar ve birler basamagi toplami : " + toplam);

        } else {
            System.out.println("Sayi 100 den kucuk ve birler basamagi : " + birler);
        }
    }
}
