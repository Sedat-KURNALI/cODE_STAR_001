package methodlar002;

import java.util.Scanner;

public class M001_S3 {
    /*
        Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi email
        @ isareti icermiyorsa gecersiz email yazdirin
        @gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
        @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"
        */
    public static void main(String[] args) {
        String email = emailGir();
        emailControl(email);

    }

    private static void emailControl(String str) {
        if (!str.contains("@")) {
            System.out.println("gecersiz email");
        } else if (!str.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresinizi girin");
        } else if (str.endsWith("@gmail.com")) {
            System.out.println("email adresi basariyla kaydedildi");
        } else {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
        }
    }

    public static String emailGir() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Email adresinizi giriniz :");
        return scan.next();
    }
}
