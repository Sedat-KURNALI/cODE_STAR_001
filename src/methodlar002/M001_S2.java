package methodlar002;

import java.util.Scanner;

public class M001_S2 {
    /*
                Soru 2 ) Kullaniciya kac sayi toplamak istedigini sorun. Kullanici 2,3 veya 4 degerini girerse,
        kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdirin. Kullanici
        toplamak istedigi sayi adedini 4'den buyuk girerse "Cok sayi girdiniz, ben toplayamam" yazdirin.
        */
    public static void main(String[] args) {
        int sayi = sayiGir();
        if (sayi < 2) {
            System.out.println("2 den kucuk deger girdiniz");
        } else if (sayi > 4) {
            System.out.println("4 ten cok sayi girdiniz, ben toplayamam");
        } else {
            islem(sayi);
        }
    }

    public static int sayiGir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        return scan.nextInt();
    }

    public static void islem(int a) {
        int toplam = 0;
        switch (a) {
            case 4:
                toplam += sayiGir();
            case 3:
                toplam += sayiGir();
            case 2:
                toplam += sayiGir();
                toplam += sayiGir();
                break;
        }
        System.out.println("toplam sonucu = " + toplam);
    }
}
