package section01;

import java.util.Scanner;

public class fghb {
    public static void main(String[] args) {
          /*
             bir stringte tekrar eden harfleri yazdıran programı yapiniz?
             Java is also easy.
             sonuç :a s
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime = scan.nextLine().toLowerCase();

        for (char i = 'a'; i <= 'z'; i++) {
            int sayi = 0;
            for (int j = 0; j < kelime.length(); j++) {
                if (i == kelime.charAt(j)) {
                    sayi++;
                }
            }
            if (sayi > 1) {    //  sayi > 0 dersek girilen kelimedeki harf sayilarini verir
                System.out.println(i + " " + sayi);
            }
        }
        System.out.println(kelime);
    }
}
