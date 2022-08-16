package genelTekrar02;

import java.util.Locale;
import java.util.Scanner;

public class Q002 {
    public static void main(String[] args) {

        String isim = "IntelliJ IDEA Community Edition";
        char ara = 'E';

        if (isim.indexOf(ara) == -1) {
            System.out.println("Aradığımız karakter yok");
        } else {
            if (isim.indexOf(ara) == isim.lastIndexOf(ara)) {
                System.out.println("Aradığımız karakterden 1 tane var");
            } else {
                System.out.println("Aradığımız karakterden 1 den fazla var");
            }
        }
    }
}
