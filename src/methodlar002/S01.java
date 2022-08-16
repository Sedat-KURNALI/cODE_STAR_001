package methodlar002;

import java.util.Scanner;

public class S01 {
    public static void main(String[] args) {
         /*
        Soru 1 ) Kullanicidan bir sayi alin. Bu sayinin tek mi cift mi oldugunu, sifirdan buyuk mu
        kucuk mu oldugunu, ayrica 100'den buyukse birler, onlar ve yuzler basamagindaki
        rakamlarin toplamini, 100'den kucukse sadece birler basamagini yazdiran 3 method
        olusturun.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz.");
        int sayi = scan.nextInt();
        sayiTekCift(sayi);
        negatifPozitif(sayi);
        sayiKontrol(sayi);
    }
    private static void sayiTekCift(int sayi) {
        System.out.println(sayi % 2 == 0 ? "Sayi cifttir" : "Sayi tektir.");
    }
    private static void negatifPozitif(int sayi) {
        System.out.println(sayi < 0 ? "Sayi Negatif" : sayi == 0 ? "Sayi Notrdur" : "Sayi Pozitif");
    }
    private static void sayiKontrol(int sayi) {
        if (sayi < 100) {
            System.out.println("Birler basamagi : " + sayi % 10);
        } else {
            int rakamlarToplami = sayi % 10;
            sayi /= 10;
            rakamlarToplami += sayi % 10;
            sayi /= 10;
            rakamlarToplami += sayi;
            System.out.println("Rakamlar toplami : " + rakamlarToplami);
        }
    }
}

