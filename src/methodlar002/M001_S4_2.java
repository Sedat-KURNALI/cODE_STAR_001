package methodlar002;

import java.util.Scanner;

public class M001_S4_2 {
    /*
       Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
       numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
       sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
       duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
       geri dondurun.
        */
    public static void main(String[] args) {
        String adSoyad = adsoyadGir();
        String kkNo = kkIdNoGir();
        System.out.println("Adiniz ve Soyadiniz = " + adSoyad);
        System.out.println("Kredi karti numaraniz = " + kkNo);
    }

    public static String adsoyadGir() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Lutfen adinizi giriniz : ");
        String str1 = scan.nextLine();
        str1 = str1.substring(0, 1).toUpperCase() + str1.substring(1).toLowerCase();

        System.out.print("Lutfen soyadinizi giriniz : ");
        String str2 = scan.nextLine();
        str2 = str2.substring(0, 1).toUpperCase() + str2.substring(1).toLowerCase();

        return str1 + " " + str2;
    }

    public static String kkIdNoGir() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen kredi karti nosunu giriniz : ");
        String str = scan.nextLine();
        str = str.substring(0, 4) + " " + str.substring(4, 8) + " " + str.substring(8, 12) + " " + str.substring(12);
        return str;
    }
}
