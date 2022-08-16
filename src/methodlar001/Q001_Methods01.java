package methodlar001;

import java.util.Scanner;

public class Q001_Methods01 {

    public static int sayi1 = 0;
    public static int sayi2 = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        menuGoster();

        int islem = scanner.nextInt();

        if (islem == 1) {
            sayilar();
            toplama();
        } else if (islem == 2) {
            sayilar();
            cikartma();
        } else if (islem == 3) {
            sayilar();
            carpma();
        } else if (islem == 4) {
            sayilar();
            bolme();
        } else {
            System.out.println("Gecersiz");
        }
    }

    public static void sayilar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayi :");
        sayi1 = scanner.nextInt();
        System.out.println("2.sayi :");
        sayi2 = scanner.nextInt();
    }

    public static void menuGoster() {
        System.out.println("1 - Toplama");
        System.out.println("2 - Cikartma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bolme");
        System.out.println("Lutfen Bir islem Giriniz:");
    }

    public static void toplama() {
        System.out.println("Toplam =  " + (sayi1 + sayi2));
    }

    public static void cikartma() {
        System.out.println("Cikartma =  " + (sayi1 - sayi2));
    }

    public static void carpma() {

        System.out.println("Carpma =  " + (sayi1 + sayi2));
    }

    public static void bolme() {

        System.out.println("Bölme =  " + ((double) sayi1 / sayi2));
    }
}