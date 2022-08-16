package otherSample001;

import java.util.Scanner;

public class A006 {
    public static void main(String[] args) {
           /*
            Interview sorusu...
            Verilen bir metindeki harflerin frekansını(tekrar sayısı) bulup yazdıran bir METHOD yazınız.
            (Büyük harf-küçük harf ayrımına dikkat ediniz) Test data:
            Input = AAABBCDD
            output = A3B2C1D2
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir yazi giriniz :");
        String yazi = scan.nextLine();
        tekrarSayisi(yazi);
    }

    private static void tekrarSayisi(String kelime) {
        for (char i = 'A'; i <= 'z'; i++) {
            int sayi = 0;
            if (i == 91) {
                i = 97;
            }
            for (int j = 0; j < kelime.length(); j++) {
                if (i == kelime.charAt(j)) {
                    sayi++;
                }
            }
            if (sayi > 0) {
                System.out.print("" + i + sayi + " ");
            }
            sayi = 0;
        }
    }
}
