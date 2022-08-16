package otherSample001;

import java.util.Scanner;

public class YerliMilli_01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir yazi giriniz :");
        String yazi = scan.nextLine();
        String buyukHali = toBuyukHarf(yazi);
        String kucukHali = toKucukHarf(yazi);
        System.out.println("buyukHali = " + buyukHali);
        System.out.println("kucukHali = " + kucukHali);

    }

    private static String toKucukHarf(String yazi) {
        String yedekYazi = "";
        String harf = "";
        for (int i = 0; i < yazi.length(); i++) {
            harf = yazi.substring(i, i + 1);
            harf = (harf.equals("İ")) ? "i" : harf;
            harf = (harf.equals("I")) ? "ı" : harf;
            harf = (harf.equals("Ö")) ? "ö" : harf;
            harf = (harf.equals("Ç")) ? "ç" : harf;
            harf = (harf.equals("Ğ")) ? "ğ" : harf;
            harf = (harf.equals("Ş")) ? "ş" : harf;
            harf = (harf.equals("Ü")) ? "ü" : harf;

            yedekYazi = yedekYazi.concat(harf);
        }
        yedekYazi = yedekYazi.toLowerCase();

        return yedekYazi;
    }

    private static String toBuyukHarf(String yazi) {
        String yedekYazi = "";
        String harf = "";
        for (int i = 0; i < yazi.length(); i++) {
            harf = yazi.substring(i, i + 1);
            harf = (harf.equals("i")) ? "İ" : harf;
            harf = (harf.equals("ı")) ? "I" : harf;
            harf = (harf.equals("ö")) ? "Ö" : harf;
            harf = (harf.equals("ç")) ? "Ç" : harf;
            harf = (harf.equals("ğ")) ? "Ğ" : harf;
            harf = (harf.equals("ş")) ? "Ş" : harf;
            harf = (harf.equals("ü")) ? "Ü" : harf;

            yedekYazi = yedekYazi.concat(harf);
        }
        yedekYazi = yedekYazi.toUpperCase();

        return yedekYazi;
    }

}
