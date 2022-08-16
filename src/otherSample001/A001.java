package otherSample001;

import java.util.Scanner;

public class A001 {
    public static void main(String[] args) {
        /*
             İsmail Cenk KOCA  12:04 PM
             arkadaşlar bir de bir stringte tekrar eden harfleri yazdıran programı yapabilirmisiniz?
             Java is also easy.
             sonuç :a s

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime = scan.nextLine().toLowerCase();
        */
        String kelime = "Java is also easy.1234789123?)()=?/%%naber";
        for (char i = 'A'; i <= 'z'; i++) {
            int sayi = 0;
            for (int j = 0; j < kelime.length(); j++) {
                if (i == kelime.charAt(j)) {
                    sayi++;
                }
            }
            if (sayi > 0) {
                System.out.println(i + " " + sayi);
            }
            sayi = 0;
        }
        System.out.println(kelime);
    }
}
