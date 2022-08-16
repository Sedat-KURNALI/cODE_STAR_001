package for_while_repeat;

import java.util.Scanner;

public class R002 {
    public static void main(String[] args) {
       /*
        Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
        LCM'yi (En Küçük Ortak Kat) bulmasını isteyin.
        Input : 30  40
            Beklenen Cikti:
            30 ve 40 icin GCD = 10
            30 ve 40 icin LCM = 120
       */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi gir:");
        int sayi1 = scan.nextInt();
        System.out.println("bir sayi gir:");
        int sayi2 = scan.nextInt();
        int obeb = 0;
        for (int i = 1; i <= sayi2; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                obeb = i;
            }
        }
        int okek = (sayi1 * sayi2) / obeb;
        System.out.println(sayi1 + " ve " + sayi2 + " icin GCD = " + obeb);
        System.out.println(sayi1 + " ve " + sayi2 + " icin LCM = " + okek);

    }
}
