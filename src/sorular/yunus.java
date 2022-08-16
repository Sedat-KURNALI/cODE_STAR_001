package sorular;
import java.util.Scanner;

public class yunus {
    public static void main(String[] args) {
        int yasiniz = 0;
        String ad = isimGir();
        String soyad = soyadGir();
        boolean hata = hataKontrol(ad, soyad);
        if (!hata) {
            System.out.println("Hata var");
        } else {
            ad = buyukCevirAd(ad);
            soyad = buyukCevirSoyad(soyad);
        }
        String yas = yasGir();
        boolean yasKontrol = yasHata(yas);
        if (!yasKontrol) {
            System.out.println("Hata var sadece sayi girebilirsiniz");
        } else {
            yasiniz = Integer.parseInt(yas);
        }
        System.out.println(ad + " " + soyad + " " + yas);
    }

    private static boolean yasHata(String yasH) {
        boolean h = false;
        int yasU = yasH.length();
        yasH = yasH.replaceAll("\\D", "");
        if (yasU == yasH.length()) {
            h = true;
        }
        return h;
    }

    private static String yasGir() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yasinizi giriniz: ");
        return scan.next();
    }

    private static String buyukCevirSoyad(String soyad) {
        return soyad.toUpperCase();
    }

    public static String buyukCevirAd(String buyuk) {

        if (buyuk.contains(" ")) {
            int bos = buyuk.indexOf(" ");
            buyuk = buyuk.substring(0, 1).toUpperCase() + buyuk.substring(1, bos).toLowerCase() +
                    buyuk.substring(bos, bos + 2).toUpperCase() + buyuk.substring(bos + 2).toLowerCase();
        } else {
            buyuk = buyuk.substring(0, 1).toUpperCase() + buyuk.substring(1).toLowerCase();
        }
        return buyuk;
    }

    public static boolean hataKontrol(String adHata, String soyadHata) {
        boolean k = true;
        int adHataUonce = adHata.length();
        adHata = adHata.replace(" ", "qwe");
        adHata = adHata.replaceAll("\\d", "").replaceAll("\\W", "");
        adHata = adHata.replace("qwe", " ");
        if (adHataUonce != adHata.length()) {
            k = false;
        }
        int soyadHataUonce = soyadHata.length();
        soyadHata = soyadHata.replace(" ", "qwe");
        soyadHata = soyadHata.replaceAll("\\d", "").replaceAll("\\W", "");
        soyadHata = soyadHata.replace("qwe", " ");
        if (soyadHataUonce != soyadHata.length()) {
            k = false;
        }
        return k;
    }

    public static String soyadGir() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Soyadinizi giriniz: ");
        return scan.nextLine().trim();
    }

    public static String isimGir() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Adinizi giriniz: ");
        return scan.nextLine().trim();
    }


}

