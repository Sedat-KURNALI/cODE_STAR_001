package genelTekrar02;

import java.util.Scanner;

public class Q001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        if (sayi1 > 0 && sayi2 > 0) {
            System.out.println("sayılarToplamı = " + (sayi1 + sayi2));
        } else if (sayi1 < 0 && sayi2 < 0) {
            System.out.println("Sayıların çarpımı=" + (sayi1 * sayi2));
        } else if ((sayi1 > 0 && sayi2 < 0)||(sayi1 < 0 && sayi2 > 0)) {
            System.out.println("Farklı isaretlerde işlem yapamazsın");
        } else if(sayi1 == 0 || sayi2 == 0){
            System.out.println("Sıfır çarpmaya göre yutan elemandır");
        }
    }
}
