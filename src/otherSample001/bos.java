package otherSample001;

import java.util.Scanner;

public class bos {
    public static void main(String[] args) {
        // Verilen iki sayının HCF'sini hesaplayan bir program yazın (OBEB) . Ortak katların en büyüğü
        // 15 – 21 için 3     64  - 80 için 16 gibi

        int sayi1 = 12;

        int sayi2 = 13;

        while (sayi1 != sayi2) {

            if (sayi1 > sayi2) sayi1 = sayi1 - sayi2;

            if (sayi2 > sayi1) sayi2 = sayi2 - sayi1;

            System.out.println("sayi1 = " + sayi1);
            System.out.println("sayi2 = " + sayi2);
        }

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
    }
}
