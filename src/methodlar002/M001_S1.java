package methodlar002;

import java.util.Scanner;

public class M001_S1 {
    /*
       Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
       kucuk mu oldugunu, ayrica 100'den buyukse birler, onlar ve yuzler basamagindaki
       rakamlarin toplamini, 100'den kucukse sadece birler basamagini yazdiran 3 method olusturun.
       */
    public static void main(String[] args) {

        int sayi = sayiGir();

        ciftMi(sayi);

        karsilastir(sayi);
    }


    private static void karsilastir(int b) {
        if (b < 0) {
            System.out.println("Sayi negatiftir");
        } else {
            System.out.println("Sayi pozitiftir");
        }
        if (b < 100) {
            System.out.println(b + " sayisini birler basamagi : " + b % 10);
        } else {
            System.out.println(b + " sayisini rakamlari toplami : " + ((b % 1000) / 100 + b % 10 + (b / 10) % 10));
        }
    }

    private static void ciftMi(int a) {
        if (a % 2 == 0) {
            System.out.println("Girdiginiz sayi Cift");
        } else {
            System.out.println("Girdiginiz sayi Tek");
        }
    }

    public static int sayiGir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        return scan.nextInt();
    }

}
