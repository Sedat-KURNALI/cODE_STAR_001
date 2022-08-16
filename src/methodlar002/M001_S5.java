package methodlar002;

import java.util.Scanner;

public class M001_S5 {

    public static void main(String[] args) {
        tekmiciftmi();
        sifirdanbuyukmukucukmu();
        yuzdenbuyukkucuk();

    }
    public static void tekmiciftmi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tekmi Ciftmi Uygulamasi icin Lutfen bir integer sayı giriniz");
        int alinansayi = scan.nextInt();
        if (alinansayi % 2 == 0) {
            System.out.println("Girilen Sayi Çifttir.");

        } else
            System.out.println("Girilen Sayi Tektir.");
    }
    public static void sifirdanbuyukmukucukmu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nSayinin 0 dan Buyukmu Kucukmu Oldugunu Bulan Uygulama icin Lütfen Başka Bir SAyi Giriniz");
        int girilensayi = scan.nextInt();
        if (girilensayi == 0) {
            System.out.println("Girilen Sayi Sıfıra Eşittir");

        } else if (girilensayi > 0) {
            System.out.println("Girilen Sayi Sifirdan Buyuktur.");
        } else
            System.out.println("Girilen sayi Sıfırdan Küçüktür");
    }
    public static void yuzdenbuyukkucuk() {
        int birlerBasamagi=0;
        int rakamlarToplami = 0;
        int birlerBasamagiAl=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("\nLutfen -1000 ile +1000 Arasinda Bir Deger Giriniz");
        int girisiYapilanSayi = scan.nextInt();
        int ilkGirilenSayi=girisiYapilanSayi;
        if (girisiYapilanSayi > 100) {
            System.out.println("Girilen Sayi 100 den Buyuktur");
            birlerBasamagi = girisiYapilanSayi % 10;
            rakamlarToplami += birlerBasamagi;
            girisiYapilanSayi/= 10;
            birlerBasamagi = girisiYapilanSayi % 10;
            rakamlarToplami += birlerBasamagi;
            girisiYapilanSayi/= 10;
            birlerBasamagi = girisiYapilanSayi % 10;
            rakamlarToplami += birlerBasamagi;
            girisiYapilanSayi /= 10;
            System.out.println("Girdiginiz " + ilkGirilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
        } else if (girisiYapilanSayi< 100) {
            birlerBasamagiAl=girisiYapilanSayi%10;
            System.out.println("Girilen Sayi 100 den Kucuktur,Sayinin Birler Basamagi:" + birlerBasamagiAl);
        } else System.out.println("Lütfen 100 den büyük veya küçük bir değer giriniz");
    }
}