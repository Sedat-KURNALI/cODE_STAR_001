package recap1;

import java.util.Scanner;

public class Q04_NotHesaplama {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Vize notunu giriniz : ");
        int vize1 = scan.nextInt();
        System.out.println("2. Vize notunu giriniz : ");
        int vize2 = scan.nextInt();
        System.out.println("Final notunu giriniz : ");
        int finalNot = scan.nextInt();
        double ort = ((vize1 + vize2) / 2) * 0.3 + finalNot * 0.7;
        System.out.println("Ortalama = " + ort);
    }
}
