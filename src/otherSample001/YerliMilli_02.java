package otherSample001;

import java.util.Scanner;

public class YerliMilli_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir yazi giriniz :");
        String yazi = scan.nextLine();
        System.out.println("buyukHali = " + toBuyukHarf(yazi));
        System.out.println("kucukHali = " + toKucukHarf(yazi));

    }

    private static String toBuyukHarf(String kelime) {
        String buyukKelime = "";
        for (int i = 0; i < kelime.length(); i++) {
            char ch = kelime.charAt(i);
            ch = (ch >= 'a' && ch <= 'z') ? (char) (ch - 32) : ch;
            buyukKelime = buyukKelime + ch;
        }
        return buyukKelime;
    }

    private static String toKucukHarf(String kelime) {
        String kucukKelime = "";
        for (int i = 0; i < kelime.length(); i++) {
            char ch = kelime.charAt(i);
            ch = (ch >= 'A' && ch <= 'Z') ? (char) (ch + 32) : ch;
            kucukKelime = kucukKelime + ch;
        }
        return kucukKelime;
    }
}