package section01;

import java.util.Scanner;

public class Soru001 {
    public static void main(String[] args) {
        /*
            Kullanicidan bir sifre girmesini isteyin.
            Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
            sartlari saglamazsa "Islem basarisiz,Lutfen yeni bir sifre girin" yazdirin
            ve basarili sifre girincee kadar tekrar sifre girmesini isteyin
            - Sifre buyuk harf icermelidir
            - Sifre kucuk harf icermelidir
            - Sifre ozel karakter icermelidir
            - Sifre uzunlugu en az 8 karakter olmali
    */
        Scanner scan = new Scanner(System.in);
        String sifre = "";
        int sayac = 0;
        while (sayac != 4) {
            System.out.println("lutfen şifrenizi giriniz");
            sifre = scan.nextLine();
            int i = 0;
            int kontrol = 0;
            int kontrolb = 0;
            int kontrolc = 0;
            do {
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                    kontrol++;
                }
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                    kontrolb++;
                }
                if (!(sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z' || sifre.charAt(i) >= 'A'
                        && sifre.charAt(i) <= 'Z' || sifre.charAt(i) >= '0' && sifre.charAt(i) <= '9')) {
                    kontrolc++;
                }
                i++;
            } while (i < sifre.length());
            if (kontrol == 0) {
                System.out.println("şifre küçük harf içermeli");
            } else {
                sayac++;
            }
            if (kontrolb == 0) {
                System.out.println("şifre büyük harf içermeli");
            } else {
                sayac++;
            }
            if (kontrolc == 0) {
                System.out.println("şifre özel karekter içermeli");
            } else {
                sayac++;
            }
            if (sifre.length() < 8) {
                System.out.println("şifre en az sekiz karekter olmalı");
            } else {
                sayac++;
            }
            if (sayac == 4) {
                System.out.println("şifre başarılı");
            } else {
                sayac = 0;
            }
        }


    }

}
