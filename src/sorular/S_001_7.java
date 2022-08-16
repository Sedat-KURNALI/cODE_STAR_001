package sorular;

import java.util.Scanner;

public class S_001_7 {
    public static void main(String[] args) {
        /*
                2 sayı gir ve sayıları toplayıp sonucu ekrana yazdırınız
                yazi veya harf girerse "karakter girdiniz"
                özel karakter girerse "özel karakter girdiniz" yazısını ekrana çıkarsın
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci sayiyi giriniz : ");
        String str1 = scan.nextLine();

        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        String str2 = scan.nextLine();

        if (str1.equals(str1.replaceAll("\\D", "")) &&
                str2.equals(str2.replaceAll("\\D", ""))) {
            int sayi1 = Integer.parseInt(str1);
            int sayi2 = Integer.parseInt(str2);
            int toplam = sayi1 + sayi2;
            System.out.println(sayi1 + " + " + sayi2 + " = " + toplam);
        } else {
            if (!str1.equals(str1.replaceAll("[a-zA-Z]", "")) ||
                    !str2.equals(str2.replaceAll("[a-zA-Z]", ""))) {
                System.out.println("karakter girdiniz");
            }
            if (!str1.equals(str1.replaceAll("\\W", "")) ||
                    !str2.equals(str2.replaceAll("\\W", ""))) {
                System.out.println("özel karakter girdiniz");
            }
        }
    }
}