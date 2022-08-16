package methodlar002;

import java.util.Scanner;

public class M001_S4_1 {
    /*
        Soru 4) Kullanicidan ismini, soyismini ve bosluk birakmadan 16 hane olarak kredi karti
        numarasini alin. Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak
        sekilde, KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde
        duzelten 2 method yazin, ve programda kullanabilmek icin duzenlenmis hallerini
        geri dondurun.
         */
    public static void main(String[] args) {
        String ad =adiGir();
        String soyad=soyadiGir();
        String kkNo=kkIdNoGir();
        System.out.println("Adiniz = " + ad);
        System.out.println("Soyadiniz = " + soyad);
        System.out.println("Kredi karti numaraniz = " + kkNo);
    }

    public static String adiGir() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen adinizi giriniz : ");
        String str = scan.nextLine();
        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }

    public static String soyadiGir() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen soyadinizi giriniz : ");
        String str = scan.nextLine();
        str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
        return str;
    }

    public static String kkIdNoGir() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen kredi karti nosunu giriniz : ");
        String str = scan.nextLine();
        str = str.substring(0, 4) + " " + str.substring(4, 8) + " " + str.substring(8, 12) + " " + str.substring(12);
        return str;
    }


}
