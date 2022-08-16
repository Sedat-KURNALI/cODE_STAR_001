package otherSample001;

import java.util.Scanner;

public class A004 {
    public static void main(String[] args) {
        // Verilen iki sayının HCF'sini hesaplayan bir program yazın (OBEB) . Ortak katların en büyüğü
        // 15 – 21 için 3     64  - 80 için 16 gibi

        Scanner scan = new Scanner(System.in);
        System.out.print("OBEB ve OKEK i hesaplanacak 1. sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.print("OBEB ve OKEK i hesaplanacak 2. sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        System.out.println("2 sayinin  OBEB i : " + obeb(sayi1, sayi2));
        System.out.println("2 sayinin  OKEK i : " + okek(sayi1, sayi2));
    }

    private static int okek(int s3, int s4) {
        int sonuc = 0;
        for (int i = (s3 * s4); i > 0; i--) {
            if ((i % s3 == 0) && (i % s4 == 0)) {
                sonuc = i;
            }
        }
        return sonuc;
    }

    public static int obeb(int s1, int s2) {
        int sonuc = 0;
        for (int i = 1; i <= s2; i++) {
            if ((s1 % i == 0) && (s2 % i == 0)) {
                sonuc = i;
            }
        }
        return sonuc;
    }
}
